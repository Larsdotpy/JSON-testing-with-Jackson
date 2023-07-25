package JavaStreams;

import DifficultJsonTests.*;
import Utils.Methods;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

import static Utils.Methods.calculateTotalOrderValue;

public class FilterBy {
    ObjectMapper objectMapper = new ObjectMapper();

    File file = new File("src/test/java/JSON_files/json_example_difficult.json");

    JsonData jsonData = objectMapper.readValue(file, JsonData.class);

    public FilterBy() throws IOException {
    }

    @Test
    public void filterByAge(){
        jsonData.getData().getUsers().stream()
                .filter(users -> users.getProfile().getAge() > 30)
                .forEach(users -> System.out.println("Username: " + users.getUsername() + " Age: " + users.getProfile().getAge()));
    }

    @Test
    public void filterByName(){
        jsonData.getData().getUsers().stream()
                .filter(users -> Objects.equals(users.getProfile().getFirstName(), "Alice"))
                .forEach(users -> System.out.println("First name: " + users.getProfile().getFirstName()));
    }

    // For this example, find all orders with the status 'shipped',
    // then extract the product names and quantities from each order, and finally,
    // calculate the total revenue for each product by summing the quantities and prices.
    @Test
    public void filterByOrderStatusProductNameQuantityTotalRevenue() {
    Map<String, Double> productRevenueMap = jsonData.getData().getUsers().stream()
            .flatMap(user -> user.getOrders().stream())
            .filter(order -> "shipped".equals(order.getStatus()))
            .flatMap(order -> order.getItems().stream())
            .collect(Collectors.groupingBy(
                    Items::getProduct,
                    Collectors.summingDouble(item -> item.getQuantity() * item.getPrice())
            ));

    productRevenueMap.forEach((product, revenue) ->
            System.out.println("Product: " + product + ", Total Revenue: $" + revenue));
    }



    // This time, find all users who have placed orders with a total amount greater than $50,
    // and for each of these users, we'll calculate the average price of their ordered items.

    @Test
    public void filterByUsersAndOrdersGreaterThan50GetAveragePrice(){
        Map<Users, Double> userAvgPriceMap = jsonData.getData().getUsers().stream()
                .filter(user -> hasOrdersTotalGreaterThan50(user))
                .collect(Collectors.toMap(
                        user -> user,
                        user -> calculateAveragePriceOfOrderedItems(user)
                ));

        // Print the average price of ordered items for each user
        userAvgPriceMap.forEach((user, avgPrice) ->
                System.out.println("User: " + user.getUsername() + " Average Price: $" + avgPrice));
    }


    private static boolean hasOrdersTotalGreaterThan50(Users user) {
        return user.getOrders().stream()
                .mapToDouble(order -> order.getItems().stream()
                        .mapToDouble(item -> item.getQuantity() * item.getPrice())
                        .sum())
                .sum() > 50.0;
    }

    private static double calculateAveragePriceOfOrderedItems(Users user) {
        List<Orders> orders = user.getOrders();
        return orders.stream()
                .flatMap(order -> order.getItems().stream())
                .mapToDouble(item -> item.getPrice())
                .average()
                .orElse(0.0);
    }

    @Test
    public void filterByUserWithHighestTotalOrderValue(){
        // Use Java streams to find the user with the highest total order value
        Optional<Users> userWithHighestTotalValue = jsonData.getData().getUsers().stream()
                .max(Comparator.comparingDouble(Methods::calculateTotalOrderValue));

        // Print the user details with the highest total order value
        userWithHighestTotalValue.ifPresent(user -> {
            double totalValue = calculateTotalOrderValue(user);
            System.out.println("User with highest total order value:");
            System.out.println("Username: " + user.getUsername());
            System.out.println("Total Order Value: $" + totalValue);
        });
    }

    @Test
    public void filterByUniqueTags(){
        // Use Java streams to find all unique tags from the metadata
        Set<String> uniqueTags = jsonData.getMetadata().getTags().stream()
                .collect(HashSet::new, Set::add, Set::addAll);

        // Print the unique tags from the metadata
        System.out.println("Unique Tags from Metadata:");
        uniqueTags.forEach(System.out::println);
    }


}




package JavaStreams;

import DifficultJsonTests.JsonData;
import DifficultJsonTests.Orders;
import DifficultJsonTests.Users;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

public class Combining {
    ObjectMapper objectMapper = new ObjectMapper();
    File file = new File("src/test/java/JSON_files/json_example_difficult.json");
    JsonData jsonData = objectMapper.readValue(file, JsonData.class);

    public Combining() throws IOException {
    }


    @Test
    public void getUsernamesTotalOrdersCountriesAndTotalPrice(){
        // Get a stream of all the users
        Stream<Users> userStream = jsonData.getData().getUsers().stream();

        // Get the names of all users
        List<String> userNames = userStream.map(Users::getUsername).toList();

        System.out.println("Usernames: " + userNames);

        // Get the total number of orders for all users
        int totalOrders = jsonData.getData().getUsers().stream()
                .mapToInt(user -> user.getOrders().size())
                .sum();

        System.out.println("Total Orders: " + totalOrders);

        // Get the distinct countries of all users
        List<String> distinctCountries = jsonData.getData().getUsers().stream()
                .map(user -> user.getProfile().getContact().getAddress().getCountry())
                .distinct().toList();

        System.out.println("Distinct Countries: " + distinctCountries);

        // Get the total price of all orders from all users
        double totalPrice = jsonData.getData().getUsers().stream()
                .flatMap(user -> user.getOrders().stream())
                .mapToDouble(Orders::getTotal)
                .sum();

        System.out.println("Total Price of All Orders: " + totalPrice);
    }
}
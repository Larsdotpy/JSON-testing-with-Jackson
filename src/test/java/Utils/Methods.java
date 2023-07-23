package Utils;

import DifficultJsonTests.Users;

public class Methods {
    public static double calculateTotalOrderValue(Users user) {
        return user.getOrders().stream()
                .mapToDouble(order -> order.getItems().stream()
                        .mapToDouble(item -> item.getQuantity() * item.getPrice())
                        .sum())
                .sum();
    }
}

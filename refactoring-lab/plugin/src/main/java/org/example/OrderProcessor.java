import java.util.logging.Logger;

public class OrderProcessor {

    public double calculateTotalPrice(Order order) {

        double totalPrice = 0;

        for (Item item : order.getItems()) {
            totalPrice += item.getPrice() * item.getQuantity();
        }

        return applyDiscount(order, totalPrice);
    }

    private double applyDiscount(Order order, double totalPrice) {

        if (order.getCustomer().isMember()) {
            totalPrice *= 0.9;
        }

        return totalPrice;
    }

    private void printItems(Order order) {

        for (Item item : order.getItems()) {

            System.out.println(
                    "  - " +
                            item.getName() +
                            ": " +
                            item.getQuantity() +
                            " x $" +
                            item.getPrice() +
                            " = $" +
                            (item.getQuantity() * item.getPrice()));
        }
    }

    public void printOrderSummary(Order order) {

        double totalPrice = calculateTotalPrice(order);

        System.out.println("Order Summary:");
        System.out.println("Customer: " + order.getCustomer().getName());
        System.out.println("Items:");

        printItems(order);

        System.out.printf("Total Price: $%.2f%n", totalPrice);
    }
}
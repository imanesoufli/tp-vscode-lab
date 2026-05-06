package test.java.org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class OrderProcessorTest {

    @Test
    void testCalculateTotalPriceForMember() {

        Customer customer = new Customer("Alice", true);

        Item item1 = new Item("Laptop", 1000, 1);
        Item item2 = new Item("Mouse", 50, 2);

        Order order = new Order(
                customer,
                Arrays.asList(item1, item2));

        OrderProcessor processor = new OrderProcessor();

        double total = processor.calculateTotalPrice(order);

        assertEquals(990, total, 0.001);
    }

    @Test
    void testCalculateTotalPriceForNonMember() {

        Customer customer = new Customer("Bob", false);

        Item item1 = new Item("Keyboard", 100, 1);

        Order order = new Order(
                customer,
                Arrays.asList(item1));

        OrderProcessor processor = new OrderProcessor();

        double total = processor.calculateTotalPrice(order);

        assertEquals(100, total, 0.001);
    }
}
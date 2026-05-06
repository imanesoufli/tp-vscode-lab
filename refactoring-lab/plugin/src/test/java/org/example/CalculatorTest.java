package test.java.org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testCalculateRatio() {

        Calculator calculator = new Calculator();

        double result = calculator.calculateRatio(2, 3);

        assertEquals(0.8333333333, result, 0.0001);
    }
}
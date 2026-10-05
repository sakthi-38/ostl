package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator c = new Calculator();

    @Test
    void testAddition() {
        assertEquals(10, c.add(4, 6));
    }

    @Test
    void testSubtraction() {
        assertEquals(2, c.subtract(8, 6));
    }

    @Test
    void testMultiplication() {
        assertEquals(20, c.multiply(2, 10));
    }

    @Test
    void testDivision() {
        assertEquals(5, c.divide(10, 2));
    }

    @Test
    void testDivideByZero() {
        try {
            c.divide(10, 0);
            fail("Expected ArithmeticException was not thrown");
        } catch (ArithmeticException e) {
            assertEquals("Division by zero", e.getMessage());
        }
    }
}

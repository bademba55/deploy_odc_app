package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    SimpleCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new SimpleCalculator();
    }

    @Test
    void test_if_calculated_add_is_working() {
        assertEquals(22, calculator.Add(10, 12));

    }

    @Test
    void test_if_soustraction_is_working() {

        assertEquals(2, calculator.soustraction(12, 10));
    }


}
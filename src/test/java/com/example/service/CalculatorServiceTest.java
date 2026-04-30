package com.example.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    @DisplayName("Should correctly add two positive integers")
    void shouldAddTwoPositiveIntegers() {
        // given
        int num1 = 10;
        int num2 = 20;

        // when
        int result = calculatorService.add(num1, num2);

        // then
        assertEquals(30, result);
    }

    @Test
    @DisplayName("Should correctly add negative integers")
    void shouldAddNegativeIntegers() {
        // given
        int num1 = -5;
        int num2 = -10;

        // when
        int result = calculatorService.add(num1, num2);

        // then
        assertEquals(-15, result);
    }

    @Test
    @DisplayName("Should correctly add mixed positive and negative integers")
    void shouldAddMixedIntegers() {
        // given
        int num1 = 15;
        int num2 = -5;

        // when
        int result = calculatorService.add(num1, num2);

        // then
        assertEquals(10, result);
    }

    @Test
    @DisplayName("Should correctly subtract two positive integers")
    void shouldSubtractTwoPositiveIntegers() {
        // given
        int num1 = 20;
        int num2 = 10;

        // when
        int result = calculatorService.subtract(num1, num2);

        // then
        assertEquals(10, result);
    }

    @Test
    @DisplayName("Should correctly subtract resulting in a negative number")
    void shouldSubtractResultingInNegative() {
        // given
        int num1 = 10;
        int num2 = 20;

        // when
        int result = calculatorService.subtract(num1, num2);

        // then
        assertEquals(-10, result);
    }
}

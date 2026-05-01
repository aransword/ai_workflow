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

    @Test
    @DisplayName("Should correctly multiply two positive integers")
    void shouldMultiplyTwoPositiveIntegers() {
        // given
        int num1 = 5;
        int num2 = 4;

        // when
        int result = calculatorService.multiply(num1, num2);

        // then
        assertEquals(20, result);
    }

    @Test
    @DisplayName("Should correctly multiply involving zero")
    void shouldMultiplyWithZero() {
        // given
        int num1 = 10;
        int num2 = 0;

        // when
        int result = calculatorService.multiply(num1, num2);

        // then
        assertEquals(0, result);
    }

    @Test
    @DisplayName("Should correctly multiply involving negative numbers")
    void shouldMultiplyWithNegativeNumbers() {
        // given
        int num1 = -5;
        int num2 = 3;

        // when
        int result = calculatorService.multiply(num1, num2);

        // then
        assertEquals(-15, result);
    }

    @Test
    @DisplayName("Should correctly divide two integers")
    void shouldDivideTwoIntegers() {
        // given
        int num1 = 20;
        int num2 = 5;

        // when
        int result = calculatorService.divide(num1, num2);

        // then
        assertEquals(4, result);
    }

    @Test
    @DisplayName("Should throw exception when dividing by zero")
    void shouldThrowExceptionWhenDividingByZero() {
        // given
        int num1 = 10;
        int num2 = 0;

        // when & then
        org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculatorService.divide(num1, num2);
        });
    }

    @Test
    @DisplayName("Should correctly calculate using unified method")
    void shouldCalculateUsingUnifiedMethod() {
        assertEquals(30, calculatorService.calculate(10, 20, "add"));
        assertEquals(10, calculatorService.calculate(20, 10, "subtract"));
        assertEquals(50, calculatorService.calculate(5, 10, "multiply"));
        assertEquals(2, calculatorService.calculate(10, 5, "divide"));
    }

    @Test
    @DisplayName("Should throw exception for invalid operation")
    void shouldThrowExceptionForInvalidOperation() {
        // when & then
        org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculatorService.calculate(10, 5, "invalid");
        });
    }
}

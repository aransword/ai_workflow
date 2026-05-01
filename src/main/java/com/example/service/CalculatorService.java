package com.example.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CalculatorService {

    /**
     * Performs addition of two integers.
     * 
     * @param num1 First number
     * @param num2 Second number
     * @return Sum of num1 and num2
     */
    public int add(int num1, int num2) {
        log.info("Performing addition: {} + {}", num1, num2);
        return num1 + num2;
    }

    /**
     * Performs subtraction of two integers.
     *
     * @param num1 First number
     * @param num2 Second number
     * @return Result of num1 - num2
     */
    public int subtract(int num1, int num2) {
        log.info("Performing subtraction: {} - {}", num1, num2);
        return num1 - num2;
    }

    /**
     * Performs multiplication of two integers.
     *
     * @param num1 First number
     * @param num2 Second number
     * @return Result of num1 * num2
     */
    public int multiply(int num1, int num2) {
        log.info("Performing multiplication: {} * {}", num1, num2);
        return num1 * num2;
    }

    /**
     * Performs division of two integers.
     *
     * @param num1 First number
     * @param num2 Second number
     * @return Result of num1 / num2
     * @throws IllegalArgumentException if num2 is zero
     */
    public int divide(int num1, int num2) {
        log.info("Performing division: {} / {}", num1, num2);
        if (num2 == 0) {
            log.error("Division by zero error");
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return num1 / num2;
    }

    /**
     * Dispatches the calculation to the appropriate method based on the operation.
     *
     * @param num1      First number
     * @param num2      Second number
     * @param operation Operation to perform (add, subtract, multiply, divide)
     * @return Result of the calculation
     * @throws IllegalArgumentException if the operation is invalid
     */
    public int calculate(int num1, int num2, String operation) {
        return switch (operation) {
            case "add" -> add(num1, num2);
            case "subtract" -> subtract(num1, num2);
            case "multiply" -> multiply(num1, num2);
            case "divide" -> divide(num1, num2);
            default -> {
                log.error("Invalid operation requested: {}", operation);
                throw new IllegalArgumentException("Invalid operation: " + operation);
            }
        };
    }
}

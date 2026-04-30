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
}

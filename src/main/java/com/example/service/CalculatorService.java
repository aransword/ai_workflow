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
}

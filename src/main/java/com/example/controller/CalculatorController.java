package com.example.controller;

import com.example.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
@RequiredArgsConstructor
public class CalculatorController {

    private final CalculatorService calculatorService;

    @GetMapping("/")
    public String index() {
        return "calculator";
    }

    @PostMapping("/calculate")
    public String calculate(@RequestParam("num1") int num1,
                            @RequestParam("num2") int num2,
                            @RequestParam("operation") String operation,
                            Model model) {
        log.info("Request to calculate {}: {} and {}", operation, num1, num2);

        try {
            int result = calculatorService.calculate(num1, num2, operation);
            String symbol = getSymbol(operation);

            model.addAttribute("num1", num1);
            model.addAttribute("num2", num2);
            model.addAttribute("operation", operation);
            model.addAttribute("symbol", symbol);
            model.addAttribute("result", result);
        } catch (IllegalArgumentException e) {
            log.error("Calculation error: {}", e.getMessage());
            model.addAttribute("error", e.getMessage());
            model.addAttribute("num1", num1);
            model.addAttribute("num2", num2);
            model.addAttribute("operation", operation);
        }

        return "calculator";
    }

    private String getSymbol(String operation) {
        return switch (operation) {
            case "add" -> "+";
            case "subtract" -> "-";
            case "multiply" -> "*";
            case "divide" -> "/";
            default -> "?";
        };
    }
}

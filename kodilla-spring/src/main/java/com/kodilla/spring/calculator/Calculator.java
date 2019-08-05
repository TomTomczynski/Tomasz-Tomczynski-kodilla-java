package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    @Autowired
    Display display;

    void add(double a, double b) {
        display.displayValue(a + b);
    }

    void sub(double a, double b) {
        display.displayValue(a - b);
    }

    void mul(double a, double b) {
        display.displayValue(a * b);
    }

    void div(double a, double b) {
        display.displayValue(a / b);
    }
}

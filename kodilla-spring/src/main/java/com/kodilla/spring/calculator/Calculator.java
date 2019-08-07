package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    @Autowired
    Display display;

    double add(double a, double b) {
        display.displayValue(a + b);
        return a + b;
    }

    double sub(double a, double b) {
        display.displayValue(a - b);
        return a - b;
    }

    double mul(double a, double b) {
        display.displayValue(a * b);
        return a * b;
    }

    double div(double a, double b) {
        double resulr = 0;
        try {
            resulr = a / b;

        } catch (ArithmeticException ae) {
            System.out.println("ArithmeticException occured!");
        }
        display.displayValue(resulr);
        return resulr;
    }

}

package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public final class Display {

     void displayValue (double val){
         new Double(val).doubleValue();
        System.out.println(val);
    }


}

package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {

        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        double add;
        double subtraction;
        double multiplication;
        double division;

        //When
        add = calculator.add(2.0, 3.0);
        subtraction = calculator.sub(6.53, 0.04);
        multiplication = calculator.mul(3, 3.5);
        division = calculator.div(30, 10);

        //Then
        Assert.assertEquals(5, add, 0.01);
        Assert.assertEquals(6.49, subtraction, 0.01);
        Assert.assertEquals(10.5, multiplication, 0.01);
        Assert.assertEquals(3, division, 0.01);
    }
}


package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }


        // tu umieść kolejny test ->
        System.out.println("Test - pierwszy test jednostkowy:");


        Calculator theCalculator = new Calculator(10, 5);
        theCalculator.addingNumbers();
        if (theCalculator.getshowResult().equals(15)){
            System.out.println("test dodawania  OK");
        } else {
            System.out.println("Error!");
        }
        theCalculator.subtractingNumbers();
        if (theCalculator.getshowResult().equals(5)){
            System.out.println("test odejmowania  OK");
        } else {
            System.out.println("Error!");
        }
    }
}
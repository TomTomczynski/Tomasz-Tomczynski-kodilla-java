package com.kodilla.testing.calculator;

public class Calculator {
    int numberA;
    int numberB;
    int result;

    public void someMethod () {
        System.out.println("It works!");
    }

    public Calculator(int a, int b){
        numberA = a;
        numberB = b;
    }

    public void addingNumbers(){
        result = numberA + numberB;
    }

    public void subtractingNumbers(){
        result = numberA - numberB;
    }

    public void showResult(){
        System.out.println("The result of the operation: " + result);
    }
    public Integer getshowResult(){
        return this.result;
    }

}

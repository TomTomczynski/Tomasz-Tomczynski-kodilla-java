package com.kodilla.stream;


import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;


public class StreamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        processor.execute(executeSaySomething);

//        Executor codeToExecute = () -> System.out.println("This is lambda.");
//        processor.execute(() -> System.out.println("This is lambda."));

//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//        expressionExecutor.executeExpression(10, 5, (a1, b1) -> a1 + b1);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);


//        PoemBeautifier thePoem = new PoemBeautifier();
//        String theText = "This is Thom's text for testing.";
//        thePoem.beautify(theText, (String) -> "!!!! " + theText + " !!!!" + '\n');
//        thePoem.beautify(theText, (String) -> theText.toLowerCase() + '\n');
//        thePoem.beautify(theText, (String) -> theText.toUpperCase() + '\n');
//        thePoem.beautify(theText, (String) -> {
//            StringBuilder theStrigBuilder = new StringBuilder(theText);
//            return (theStrigBuilder.reverse().toString());
//        });
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
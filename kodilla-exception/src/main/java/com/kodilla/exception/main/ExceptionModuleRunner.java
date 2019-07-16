package com.kodilla.exception.main;

import com.kodilla.exception.com.kodilla.exception.io.FileReader;
import com.kodilla.exception.com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.test.SecondChallenge;
import com.kodilla.exception.test.ExceptionHandling;

public class ExceptionModuleRunner {

    public static void main(String arg[]) {
        FileReader fileReader = new FileReader();
        try {
            fileReader.readFile();
        } catch (FileReaderException e) {
            System.out.println("problem while reading a file !");
        }
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            System.out.println(secondChallenge.probablyIWillThrowException(1.5, 5));
        } catch (ExceptionHandling e) {
            System.out.println("Problem with the \" ProbablyIWillThrowException() \" .");
        }
    }
}

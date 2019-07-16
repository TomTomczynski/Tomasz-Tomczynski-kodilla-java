package com.kodilla.exception.main;

import com.kodilla.exception.com.kodilla.exception.io.FileReader;
import com.kodilla.exception.com.kodilla.exception.io.FileReaderException;

public class ExceptionModuleRunner {

    public static void main(String[] arg) {
        FileReader fileReader = new FileReader();
        try {
            fileReader.readFile();
        } catch (FileReaderException e) {
            System.out.println("problem while reading a file !");
        }
    }
}

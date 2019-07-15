package com.kodilla.exception.com.kodilla.exception.io;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {
    public void readFile() throws FileReaderException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("files/names.txt").getFile());

        try (Stream<String> fileLines = Files.lines(Paths.get(file.getPath()))) {
            fileLines.forEach(l -> System.out.println(l));
        } catch (Exception e) {
            System.out.println("Oh no! Something went wrong! \n Error: " + e.getMessage() + "\n" + e.getLocalizedMessage());
            throw new FileReaderException();
        } finally {
            System.out.println("Dzialamy dalej...");
        }
    }
}

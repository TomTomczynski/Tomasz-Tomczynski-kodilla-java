package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String text, PoemDecorator poemDecorator){
        System.out.println("Text beefor changes: " + text);
        System.out.println("Text after changes: " + poemDecorator.beautify(text));
    }
}

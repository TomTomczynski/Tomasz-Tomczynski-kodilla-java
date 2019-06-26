package com.kodilla.testing;

import java.util.*;

public class TestingMain {
    public static void main(String[] args){
        List<String> test = new ArrayList<>();

        for(int i=0;i<10;i++) {
            test.add("User_" + (i + 1));
            System.out.println("Size");
        }
        System.out.println("Size: " + test.size());
    }
}
package com.kodilla.testing.com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        ArrayList<Integer> Numbers = new ArrayList<>();
        for (Integer theNumber : numbers){
            if ((theNumber%2)==0) {Numbers.add(theNumber);}
        }
        return Numbers;
    }
}

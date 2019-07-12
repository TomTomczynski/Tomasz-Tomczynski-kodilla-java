package com.kodilla.stream.array;

import java.util.stream.IntStream;


public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        return IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .map(k -> {
                    System.out.println(k);
                    return k;
                })
//                .flatMap(k -> IntStream.of(k))
//                .mapToObj(k -> new Integer(k))
//                .mapToInt(k -> k)
                .average()
                .getAsDouble();
    }
}



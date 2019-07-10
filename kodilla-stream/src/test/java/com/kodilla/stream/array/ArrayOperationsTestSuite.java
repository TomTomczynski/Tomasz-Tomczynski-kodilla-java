package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] theNumbers = {0,3,6,1};
        //When
        double result = ArrayOperations.getAverage(theNumbers);
        //Then
        Assert.assertEquals(2.5, result, 0.05);
    }
}

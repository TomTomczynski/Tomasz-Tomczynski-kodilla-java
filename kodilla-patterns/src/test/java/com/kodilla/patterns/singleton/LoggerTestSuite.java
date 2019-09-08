package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void  testGetLastLog(){
        //Given
        //When
        Logger.getInstance().log("Log nr 1.");
        String result = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("Log nr 1.", result);
    }
}

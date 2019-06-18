package com.kodilla.testing.collection;

import com.kodilla.testing.com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList () {

        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<>();
        //When
        ArrayList<Integer> result = new ArrayList<>(oddNumbersExterminator.exterminate(numbers));
        System.out.println("Testing size of exterminate ArrayList " + result.size());
        //Then
        Assert.assertEquals( 0, result.size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList () {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i<10; i++){
            numbers.add(i-1,i);
        }
        //When
        ArrayList<Integer> result = new ArrayList<>(oddNumbersExterminator.exterminate(numbers));
        System.out.println("Testing the exterminate ArrayList: " + result.toString());
        //Then
        Assert.assertEquals( 4, result.size());
    }
}

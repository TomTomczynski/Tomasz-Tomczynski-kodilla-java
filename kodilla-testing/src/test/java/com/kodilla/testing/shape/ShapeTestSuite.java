package com.kodilla.testing.shape;

import com.kodilla.testing.com.kodilla.testing.collection.com.kodilla.testing.shape.*;
import org.junit.*;

import java.util.ArrayList;

public class ShapeTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddShape() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square theSquere = new Square(5);
        Triangle theTriangle = new Triangle(10, 10);
        Rectangle theRectangle = new Rectangle(5, 10);
        //When
        shapeCollector.addFigure(theSquere);
        shapeCollector.addFigure(theTriangle);
        shapeCollector.addFigure(theRectangle);
        ArrayList<Shape> result = shapeCollector.getTheShapeCollector();

        //Then
        Assert.assertEquals(3, result.size());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square theSquere = new Square(5);
        Triangle theTriangle = new Triangle(10, 10);
        Rectangle theRectangle = new Rectangle(5, 10);
        //When
        shapeCollector.removeFigure(theSquere);
        shapeCollector.removeFigure(theTriangle);
        shapeCollector.removeFigure(theRectangle);
        ArrayList<Shape> result = shapeCollector.getTheShapeCollector();
        //Then
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square theSquere = new Square(5);
        shapeCollector.addFigure(theSquere);
        //When
        Shape result = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(theSquere, result);
    }

    @Test
    public void testGetShapesQuantity() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle theTriangle = new Triangle(10, 10);
        shapeCollector.addFigure(theTriangle);
        //When
        int result = shapeCollector.getShapesQuantity();
        //Then
        Assert.assertEquals(1, result);
    }

    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle theTriangle = new Triangle(10, 10);
        shapeCollector.addFigure(theTriangle);
        //When
        double result = shapeCollector.getFigure(0).getField();
        //Then
        Assert.assertEquals(50,result,0.001);

    }
}

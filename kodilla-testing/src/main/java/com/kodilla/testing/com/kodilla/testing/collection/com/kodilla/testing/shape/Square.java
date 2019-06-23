package com.kodilla.testing.com.kodilla.testing.collection.com.kodilla.testing.shape;

import static jdk.nashorn.internal.runtime.JSType.toDouble;

public class Square implements Shape{
    String ShapeName = "Square";
    Integer side;

    public Square(int side) {
        side = side;
    }

    @Override
    public String getShapeName() {
        return null;
    }

    @Override
    public Double getField() {
        return toDouble(side*side);
    }
}

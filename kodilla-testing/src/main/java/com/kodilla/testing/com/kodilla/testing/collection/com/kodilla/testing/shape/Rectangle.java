package com.kodilla.testing.com.kodilla.testing.collection.com.kodilla.testing.shape;

import static jdk.nashorn.internal.runtime.JSType.toDouble;

public class Rectangle  implements Shape {
    String ShapeName = "Rectangle";
    int sideA;
    int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public String getShapeName() {
        return null;
    }

    @Override
    public Double getField() {
        return toDouble(sideA*sideB);
    }
}

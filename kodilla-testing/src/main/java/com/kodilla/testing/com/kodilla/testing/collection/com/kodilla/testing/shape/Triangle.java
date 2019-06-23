package com.kodilla.testing.com.kodilla.testing.collection.com.kodilla.testing.shape;

import static jdk.nashorn.internal.runtime.JSType.toDouble;

public class Triangle  implements Shape{
    String ShapeName = "The Triangle";
    int base;
    int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return ShapeName;
    }

    @Override
    public Double getField() {
        return ((base*height)/2.0);
    }
}


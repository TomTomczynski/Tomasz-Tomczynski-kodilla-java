package com.kodilla.testing.com.kodilla.testing.collection.com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> theShapeCollector = new ArrayList<>();

    public void addFigure(Shape shape){
        theShapeCollector.add(shape);
    }

    public void removeFigure(Shape shape){

    }

    public Shape getFigure(int n){
        return theShapeCollector.get(n);
    }

    public void showFigures(){
        theShapeCollector.toString();
    }

    public int getShapesQuantity() {
        return theShapeCollector.size();
    }

    public ArrayList<Shape> getTheShapeCollector() {
        return theShapeCollector;
    }


}

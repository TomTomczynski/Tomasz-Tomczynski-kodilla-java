package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";


    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Shopping Task 1", "Item 1", 2.00);
            case PAINTING:
                return new PaintingTask("Painting Task 1", "Color 1", "Room 1");
            case DRIVING:
                return new DrivingTask("Driving Task 1", "Destination 1", "Vehicle 1");
            default:
                return null;
        }
    }
}

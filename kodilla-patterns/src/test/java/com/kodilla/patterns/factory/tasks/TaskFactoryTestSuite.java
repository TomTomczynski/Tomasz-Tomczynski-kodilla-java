package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTasks() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //Where
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING);
        Boolean taskStatus = shoppingTask.isTaskExecuted();
        System.out.println("Shopping Task is done ? " + taskStatus.toString());
        shoppingTask.executeTask();
        //Then
        Assert.assertEquals("Shopping Task 1", shoppingTask.getTaskName());
        Assert.assertEquals(true, shoppingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTasks() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        Boolean taskStatus;
        //Where
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTING);
        taskStatus = paintingTask.isTaskExecuted();
        System.out.println("Painting Task is done ? " + taskStatus.toString());
        System.out.println(paintingTask.getTaskName());
        paintingTask.executeTask();
        //Then
        Assert.assertEquals("Painting Task 1", paintingTask.getTaskName());
        Assert.assertEquals(true, paintingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryDrivingTasks() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        Boolean taskStatus;
        //Where
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING);
        taskStatus = drivingTask.isTaskExecuted();
        System.out.println("Driving Task is done ? " + taskStatus.toString());
        System.out.println(drivingTask.getTaskName());
        drivingTask.executeTask();
        System.out.println("After Task e");
        //Then
        Assert.assertEquals("Driving Task 1", drivingTask.getTaskName());
        Assert.assertEquals(true, drivingTask.isTaskExecuted());
    }

}

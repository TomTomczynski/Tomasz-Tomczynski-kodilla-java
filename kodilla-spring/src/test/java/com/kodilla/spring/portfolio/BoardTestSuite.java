package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getDoneList().getTasks().add("Task_1");
        board.getInProgressList().getTasks().add("Task_2");
        board.getTaskList().getTasks().add("Task_3");
        //Then
        board.getDoneList().getTasks().stream()
                .forEach(f -> System.out.println("Tasks done: " + f));
        board.getInProgressList().getTasks().stream()
                .forEach(f -> System.out.println("Tasks in progres: " + f));
        board.getTaskList().getTasks().stream()
                .forEach(f -> System.out.println("Tasks to do: " + f));
    }
}

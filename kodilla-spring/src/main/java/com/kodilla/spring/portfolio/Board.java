package com.kodilla.spring.portfolio;

public class Board {
    private final TaskList taskList;
    private final TaskList inProgressList;
    private final TaskList doneList;

    public Board(TaskList taskList, TaskList inProgressList, TaskList doneList) {
        this.taskList = taskList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getTaskList() {
        return taskList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }
}

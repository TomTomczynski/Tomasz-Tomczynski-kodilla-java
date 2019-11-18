package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration

public class BoardConfig {
    @Qualifier("toDoList")
    @Autowired
    TaskList toDoList;

    @Qualifier("doneList")
    @Autowired
    TaskList doneList;

    @Qualifier("inProgressList")
    @Autowired
    TaskList inProgressList;

    @Bean
    public Board getTaskLists() {
        return new Board(toDoList, doneList, inProgressList);
    }

    @Bean(name = "doneList")
    @Scope("prototype")
    public TaskList getDoneList() {
        return new TaskList();
    }

    @Bean(name = "toDoList")
    @Scope("prototype")
    public TaskList getToDoList() {
        return new TaskList();
    }

    @Bean(name = "inProgressList")
    @Scope("prototype")
    public TaskList getInProgressList() {
        return new TaskList();
    }

}

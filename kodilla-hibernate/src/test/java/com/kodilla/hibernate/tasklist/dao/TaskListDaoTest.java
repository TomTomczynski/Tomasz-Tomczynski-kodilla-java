package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class TaskListDaoTest {

    @Autowired
    public TaskListDao taskListDao;

    @Test
    public void testFindByListName() {
        //Given

        TaskList task = new TaskList("List Name 1", "Description 1");
        String listName = task.getListName();

        taskListDao.save(task);

        //When
        List<TaskList> readTaskList = taskListDao.findByListName(listName);

        //Then
        System.out.println("Number of Task List in the database: "+ taskListDao.count());
        Assert.assertEquals(1, readTaskList.size());
        Assert.assertFalse(readTaskList.isEmpty());

        //CleanUp
        readTaskList.forEach(i->taskListDao.deleteById(i.getId()));

    }
}
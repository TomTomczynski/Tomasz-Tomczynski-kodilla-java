package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface TaskListDao extends CrudRepository <TaskList,Integer>{
    List<TaskList> findByListName(String listName);
    Optional<TaskList> findById (Integer id);
}

package com.todolist.todolist.service;

import com.todolist.todolist.entity.ToDo;
import com.todolist.todolist.entity.User;
import com.todolist.todolist.repository.ToDoRepository;
import com.todolist.todolist.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {
    @Autowired
    private ToDoRepository todoRepo;

    public ToDo save(ToDo toDo) {
        return todoRepo.save(toDo);
    }

    public List<ToDo> findAll() {
        return todoRepo.findAll();
    }
}

package com.todolist.todolist.controller;

import com.todolist.todolist.entity.ToDo;
import com.todolist.todolist.repository.ToDoRepository;
import com.todolist.todolist.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class ToDoController {
    //  http://localhost:8080/swagger-ui.html#/to-do-controller
    @Autowired
    private ToDoService toDoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ToDo SaveToDo(@RequestBody ToDo toDo) {
        return toDoService.save(toDo);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ToDo> getAllToDo() {
        return toDoService.findAll();
    }

}

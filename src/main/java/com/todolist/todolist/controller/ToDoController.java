package com.todolist.todolist.controller;

import com.todolist.todolist.entity.ToDo;
import com.todolist.todolist.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todo")
public class ToDoController {
//http://localhost:8080/todolist/api/swagger-ui/
    @Autowired
    private ToDoRepository todoRepo;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String saveCustomer(@RequestBody ToDo customer) {
        todoRepo.save(customer);
        return "customer saved successfully!!";
    }
}

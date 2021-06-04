package com.todolist.todolist.repository;

import com.todolist.todolist.entity.ToDo;
import org.springframework.data.couchbase.repository.CouchbaseRepository;

public interface ToDoRepository extends CouchbaseRepository<ToDo, Integer> {
}

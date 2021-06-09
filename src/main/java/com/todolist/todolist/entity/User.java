package com.todolist.todolist.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

@Document
@Setter
@Getter
public class User {
    @Id
    private Integer id;
    private String name;
    private String lastName;
    private String userName;
    private String email;
    private String password;
}

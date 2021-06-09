package com.todolist.todolist.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

import java.util.Date;

@Document
@Setter
@Getter
public class ToDo {
    @Id
    private Integer id;
    private String name;
    private Date startDate;
    private Integer userId;
}

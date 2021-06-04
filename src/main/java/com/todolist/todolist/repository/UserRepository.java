package com.todolist.todolist.repository;

import com.todolist.todolist.entity.User;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CouchbaseRepository<User, Integer> {
}

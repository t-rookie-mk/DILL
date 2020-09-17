package com.example.demo.dao;

import com.example.demo.pojo.user;
import org.springframework.data.repository.CrudRepository;

public interface userRepository  extends CrudRepository<user, Long> {
}

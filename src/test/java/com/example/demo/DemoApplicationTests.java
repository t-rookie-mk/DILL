package com.example.demo;

import com.example.demo.dao.userRepository;
import com.example.demo.pojo.user;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    userRepository userRepository;


    @Test
    void contextLoads() {
        System.out.println(userRepository.findAll());
    }

}

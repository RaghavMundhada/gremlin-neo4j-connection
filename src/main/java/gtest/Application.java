package gtest;

import gtest.dao.DAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Author: Dhruv Mahajan
 **/

@SpringBootApplication
public class Application {

    DAO dao;

    @Autowired
    public Application(DAO dao) {
        this.dao = dao;
        this.dao.test();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}



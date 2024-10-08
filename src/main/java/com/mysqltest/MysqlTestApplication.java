package com.mysqltest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
//@MapperScan("com.mysqltest.Mapper")
public class MysqlTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MysqlTestApplication.class, args);
    }

}

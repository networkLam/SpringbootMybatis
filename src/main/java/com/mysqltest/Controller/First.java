package com.mysqltest.Controller;

import com.mysqltest.Mapper.FirstMapper;
import com.mysqltest.POJO.Address;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController

public class First {

    @Autowired
    FirstMapper firstMapper ;

    @GetMapping("/test")
    public String sayHi(){
        List<Address> info = firstMapper.getInfo();
        System.out.println("print"+info.toString());
        log.info("visited");
        return "hi springboot";
    }
}

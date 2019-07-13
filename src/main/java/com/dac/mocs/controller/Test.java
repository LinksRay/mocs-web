package com.dac.mocs.controller;


import com.dac.mocs.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @Autowired
    private UserMapper mapper;
    @RequestMapping("/test")
    public String test(){
        return mapper.selectAll().get(0).toString();
    }
}

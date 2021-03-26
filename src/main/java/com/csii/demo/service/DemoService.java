package com.csii.demo.service;

import com.csii.demo.entity.Demo;
import com.csii.demo.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    @Autowired
    DemoMapper mapper;

    public Demo findDemo(Integer id){
        return mapper.findById(id);
    }
}

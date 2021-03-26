package com.csii.demo.mapper;

import com.csii.demo.entity.Demo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface DemoMapper {

    public Demo findById(Integer id);
}

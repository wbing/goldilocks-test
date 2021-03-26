package com.csii.demo.mapper;

import com.csii.demo.entity.Demo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DemoMapperTest {

    @Autowired
    private DemoMapper mapper;

    @Test
    public void test_find_demo(){
        Demo demo=mapper.findById(1);
        System.out.println(demo.getName());
    }

}
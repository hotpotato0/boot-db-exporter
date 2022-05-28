package com.example.monitoring.controller;

import com.example.monitoring.mapper.QueryMapper;
import com.example.monitoring.dto.TestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/query")
public class QueryController {

    @Autowired
    private QueryMapper queryMapper;

    @GetMapping("/hello")
    public List<TestDTO> HelloWorld(){
        return queryMapper.getTestData();
    }
}

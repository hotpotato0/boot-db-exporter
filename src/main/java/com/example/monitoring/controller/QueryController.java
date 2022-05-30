package com.example.monitoring.controller;

import com.example.monitoring.dto.LabelDTO;
import com.example.monitoring.mapper.QueryMapper;
import com.example.monitoring.dto.TestDTO;
import io.micrometer.core.instrument.Metrics;
import io.micrometer.core.instrument.Tag;
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


    @GetMapping("/label")
    public LabelDTO HelloLabel(){
        LabelDTO labelDTO = queryMapper.getLableData();
        List<Tag> tags = List.of(
                Tag.of("title", labelDTO.getTitle()),
                Tag.of("subtitle", labelDTO.getSubtitle())
//                Tag.of("value", labelDTO.getValue()),
        );
        Metrics.counter("title.subtitle.label", tags).increment();

        return queryMapper.getLableData();
    }

    @GetMapping("/gauge")
    public LabelDTO HelloGuage(){
        LabelDTO labelDTO = queryMapper.getLableData();
        List<Tag> tags = List.of(
                Tag.of("title", labelDTO.getTitle()),
                Tag.of("subtitle", labelDTO.getSubtitle())
//                Tag.of("value", labelDTO.getValue()),
        );
        Metrics.gauge("title.subtitle.gauge", tags, labelDTO.getValue());

        return queryMapper.getLableData();
    }
}

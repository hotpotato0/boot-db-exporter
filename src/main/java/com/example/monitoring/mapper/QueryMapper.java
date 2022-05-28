package com.example.monitoring.mapper;
//com.example.monitoring.mapper
import com.example.monitoring.dto.TestDTO;
import java.util.List;

public interface QueryMapper {
    List<TestDTO> getTestData();
}

package com.example.monitoring.dao;
//com.example.monitoring.mapper
import com.example.monitoring.dto.TestDTO;
import java.util.List;

public interface QueryDAO {
    List<TestDTO> getTestData();
}

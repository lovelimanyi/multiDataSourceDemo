package com.xianjinxia.multiDatasource.lmy.dao;

import com.xianjinxia.multiDatasource.lmy.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface Table1Mapper {

    List<Map<String,Object>> selectAll();

    Student selectAllStudentById(Integer id);
}

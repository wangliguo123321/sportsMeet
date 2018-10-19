package com.project.sport.mapper;

import com.project.sport.pojo.College;
import com.project.sport.pojo.CollegeExample;
import java.util.List;

public interface CollegeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(College record);

    int insertSelective(College record);

    List<College> selectByExample(CollegeExample example);

    College selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(College record);

    int updateByPrimaryKey(College record);
}
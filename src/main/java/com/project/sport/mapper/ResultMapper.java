package com.project.sport.mapper;

import com.project.sport.pojo.Result;
import com.project.sport.pojo.ResultExample;
import java.util.List;

public interface ResultMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Result record);

    int insertSelective(Result record);

    List<Result> selectByExample(ResultExample example);

    Result selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Result record);

    int updateByPrimaryKey(Result record);
}
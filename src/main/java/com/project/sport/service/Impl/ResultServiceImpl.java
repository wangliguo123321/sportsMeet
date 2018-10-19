package com.project.sport.service.Impl;

import com.project.sport.mapper.ResultMapper;
import com.project.sport.pojo.Result;
import com.project.sport.pojo.ResultExample;
import com.project.sport.service.ResultService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultServiceImpl implements ResultService{

    @Autowired
    ResultMapper resultMapper;

    @Override
    public void addResult(Result result) {
        resultMapper.insert(result);
    }

    @Override
    public void deleteResult(long id) {
        resultMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Result findByName(String name) {
        ResultExample example = new ResultExample();
        example.createCriteria().andT_nameEqualTo(name);
        List<Result> results = resultMapper.selectByExample(example);
        if (!results.isEmpty())
        return results.get(0);
        else
            return null;
    }

    @Override
    public List<Result> getList() {
        return null;
    }
}

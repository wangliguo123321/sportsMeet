package com.project.sport.service.Impl;

import com.project.sport.pojo.College;
import com.project.sport.pojo.CollegeExample;
import com.project.sport.service.CollegeService;
import com.project.sport.mapper.CollegeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeServiceImpl implements CollegeService{

    @Autowired
    CollegeMapper collegeMapper;

    @Override
    public List<College> getList() {
        CollegeExample example = new CollegeExample();
        example.setOrderByClause("id ");
        return collegeMapper.selectByExample(example);
    }

    @Override
    public void editScore(College college) {
        collegeMapper.updateByPrimaryKeySelective(college);
    }

    @Override
    public void saveCollege(College college) {
        collegeMapper.insert(college);
    }

    @Override
    public void deleteCollege(long id) {
        collegeMapper.deleteByPrimaryKey(id);
    }
}

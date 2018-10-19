package com.project.sport.service;

import com.project.sport.pojo.College;

import java.util.List;

public interface CollegeService {


    List<College> getList();

    void editScore(College college);

    void saveCollege(College college);

    void deleteCollege(long id);
}


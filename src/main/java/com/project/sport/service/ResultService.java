package com.project.sport.service;

import com.project.sport.pojo.Result;

import java.util.List;

public interface ResultService {

    void addResult(Result result);

    void deleteResult(long id);

    Result findByName(String name);

    List<Result> getList();
}

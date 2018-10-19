package com.project.sport.controller;

import com.project.sport.pojo.Result;
import com.project.sport.service.ResultService;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public class ResultController {

    @Autowired
    ResultService resultService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addResult(Result result){
        resultService.addResult(result);
        return "index";
    }


    @RequestMapping(value = "delete", method = RequestMethod.DELETE)
    public String deleteResult(long id){
        resultService.deleteResult(id);
        return "index";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public String resultList(){
        List<Result> resultList = resultService.getList();
        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObject = null;
        Result results = null;
        for(int i = 0; i < resultList.size(); i++){
            results = resultList.get(i);
            jsonObject = new JSONObject();
            jsonObject.put("gameName",results.getT_name());
            jsonObject.put("stuName1",results.getT_stuname1());
            jsonObject.put("stuName2",results.getT_stuname2());
            jsonObject.put("stuName3",results.getT_stuname3());
            jsonObject.put("stuCollege1",results.getT_stucollege1());
            jsonObject.put("stuCollege2",results.getT_stucollege2());
            jsonObject.put("stuCollege3",results.getT_stucollege3());
//            jsonObject.put("time",messages.getTime());
            jsonArray.add(jsonObject);
        }
        return jsonArray.toJSONString();
    }

}

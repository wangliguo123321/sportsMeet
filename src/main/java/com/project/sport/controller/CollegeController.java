package com.project.sport.controller;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import com.project.sport.pojo.College;
import com.project.sport.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CollegeController {
    @Autowired
    CollegeService collegeService;

    @RequestMapping(value = "/college/add", method = RequestMethod.POST)
    public String  addCollege(College college){
        collegeService.saveCollege(college);
        return "index";
    }



    @RequestMapping(value = "/college/list", method = RequestMethod.GET)
    @ResponseBody
    public String list(){
        List<College> collegeList =collegeService.getList();
        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObject = null;
        College colleges = null;
        for(int i = 0; i < collegeList.size(); i++){
            colleges = collegeList.get(i);
            jsonObject = new JSONObject();
            jsonObject.put("score",colleges.getT_score());
            jsonObject.put("name",colleges.getT_name());
            jsonArray.add(jsonObject);
        }
        return jsonArray.toJSONString();
    }

    @RequestMapping(value = "/college/delete")
    public String delCollege(long id){
        collegeService.deleteCollege(id);
        return "index";
    }


    @RequestMapping(value = "/college/edit", method = RequestMethod.POST)
    public String editCollege(@RequestBody College college){
        collegeService.editScore(college);
        return "index";
    }
}

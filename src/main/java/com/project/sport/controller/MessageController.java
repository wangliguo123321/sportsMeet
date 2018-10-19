package com.project.sport.controller;

import com.project.sport.pojo.Message;
import com.project.sport.service.MessageService;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MessageController {

    @Autowired
    MessageService messageService;

    @RequestMapping(value = "/msg/add")
    public String addMsg(Message msg){
        messageService.addMessage(msg);
        return "index";
    }


    @RequestMapping(value = "/msg/delete", method = RequestMethod.DELETE)
    public String deleteMsg(long id){
        messageService.deleteMessage(id);
        return "index";
    }


    @RequestMapping(value = "/msg/list", method = RequestMethod.GET)
    @ResponseBody
    public String msgList(){
        List<Message> messagesList = messageService.getList();
        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObject = null;
        Message messages = null;
        for(int i = 0; i < messagesList.size(); i++){
            messages = messagesList.get(i);
            jsonObject = new JSONObject();
            jsonObject.put("msg",messages.getT_msg());
            jsonObject.put("name",messages.getT_name());
            jsonObject.put("time",messages.getT_time());
            jsonArray.add(jsonObject);
        }
        return jsonArray.toString();
    }
}

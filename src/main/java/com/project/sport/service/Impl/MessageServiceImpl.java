package com.project.sport.service.Impl;

import com.project.sport.mapper.MessageMapper;
import com.project.sport.pojo.Message;
import com.project.sport.pojo.MessageExample;
import com.project.sport.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    MessageMapper messageMapper;


    @Override
    public List<Message> getList() {
        MessageExample example = new MessageExample();
        example.setOrderByClause("id desc");

        return messageMapper.selectByExample(example);
    }

    @Override
    public void addMessage(Message msg) {
        messageMapper.insert(msg);
    }

    @Override
    public void deleteMessage(long id) {
        messageMapper.deleteByPrimaryKey(id);
    }
}

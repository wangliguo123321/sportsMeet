package com.project.sport.service;

import com.project.sport.pojo.Message;

import java.util.List;

public interface MessageService {

    List<Message> getList();

    void addMessage(Message msg);

    void deleteMessage(long id);
}

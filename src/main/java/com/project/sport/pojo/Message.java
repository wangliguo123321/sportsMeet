package com.project.sport.pojo;

public class Message {
    private Long id;

    private String t_msg;

    private String t_name;

    private String t_time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getT_msg() {
        return t_msg;
    }

    public void setT_msg(String t_msg) {
        this.t_msg = t_msg == null ? null : t_msg.trim();
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name == null ? null : t_name.trim();
    }

    public String getT_time() {
        return t_time;
    }

    public void setT_time(String t_time) {
        this.t_time = t_time == null ? null : t_time.trim();
    }
}
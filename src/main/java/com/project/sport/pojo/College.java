package com.project.sport.pojo;

public class College {
    private Long id;

    private String t_name;

    private Integer t_score;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name == null ? null : t_name.trim();
    }

    public Integer getT_score() {
        return t_score;
    }

    public void setT_score(Integer t_score) {
        this.t_score = t_score;
    }
}
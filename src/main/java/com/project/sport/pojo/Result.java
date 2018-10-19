package com.project.sport.pojo;

public class Result {
    private Long id;

    private String t_name;

    private String t_stucollege1;

    private String t_stucollege2;

    private String t_stucollege3;

    private String t_stuname1;

    private String t_stuname2;

    private String t_stuname3;

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

    public String getT_stucollege1() {
        return t_stucollege1;
    }

    public void setT_stucollege1(String t_stucollege1) {
        this.t_stucollege1 = t_stucollege1 == null ? null : t_stucollege1.trim();
    }

    public String getT_stucollege2() {
        return t_stucollege2;
    }

    public void setT_stucollege2(String t_stucollege2) {
        this.t_stucollege2 = t_stucollege2 == null ? null : t_stucollege2.trim();
    }

    public String getT_stucollege3() {
        return t_stucollege3;
    }

    public void setT_stucollege3(String t_stucollege3) {
        this.t_stucollege3 = t_stucollege3 == null ? null : t_stucollege3.trim();
    }

    public String getT_stuname1() {
        return t_stuname1;
    }

    public void setT_stuname1(String t_stuname1) {
        this.t_stuname1 = t_stuname1 == null ? null : t_stuname1.trim();
    }

    public String getT_stuname2() {
        return t_stuname2;
    }

    public void setT_stuname2(String t_stuname2) {
        this.t_stuname2 = t_stuname2 == null ? null : t_stuname2.trim();
    }

    public String getT_stuname3() {
        return t_stuname3;
    }

    public void setT_stuname3(String t_stuname3) {
        this.t_stuname3 = t_stuname3 == null ? null : t_stuname3.trim();
    }
}
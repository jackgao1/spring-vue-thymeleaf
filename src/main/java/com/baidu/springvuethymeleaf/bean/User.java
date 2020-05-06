package com.baidu.springvuethymeleaf.bean;

public class User {
    private int student_id;
    private String name;
    private String politily;
    private String sex;
    private String birth;

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPolitily() {
        return politily;
    }

    public void setPolitily(String politily) {
        this.politily = politily;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }
}

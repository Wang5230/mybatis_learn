package com.itheima.domain;

import java.io.Serializable;

/**
 * @@author WangHao
 * @Company NEAU
 */
public class User implements Serializable {
    private String user_name;
    private String user_birth;
    private String user_pos;
    private Integer user_age;

    public void setUser_Age(Integer age) {
        this.user_age = age;
    }

    public Integer getUser_Age() {
        return user_age;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_name='" + user_name + '\'' +
                ", user_birth='" + user_birth + '\'' +
                ", user_pos='" + user_pos + '\'' +
                ", age=" + user_age +
                '}';
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }


    public void setUser_birth(String user_birth) {
        this.user_birth = user_birth;
    }

    public void setUser_pos(String uesr_pos) {
        this.user_pos = uesr_pos;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getUser_birth() {
        return user_birth;
    }

    public String getUser_pos() {
        return user_pos;
    }
}

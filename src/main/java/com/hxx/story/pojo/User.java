package com.hxx.story.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;

public class User {
    private String name;
    @JsonIgnore//隐藏密码
    private String passworld;
    private Integer age;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm a",locale="zh",timezone="GMT+8")//设置时间格式 locale="zh" 意思为在中国 timezone为时区
    private Date birthday;
    @JsonInclude(JsonInclude.Include.NON_NULL)//若该字段为空，则json数据不显示该字段
    private String desc;

    public String getName() {
        return name;
    }

    public String getPassworld() {
        return passworld;
    }

    public Integer getAge() {
        return age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getDesc() {
        return desc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassworld(String passworld) {
        this.passworld = passworld;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}

package com.entity;

import javax.persistence.Entity;/*JPA主键*/
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by yuanjie.fang on 2018/3/1.
 * 学生实体类
 */
@Entity()
@Table(name = "f_students")
public class Students implements Serializable {

    private static final long serialVersionUID = -8019929135094013110L;

    private int sid;//学号
    private String sname;//姓名
    private String gender;//性别
    private Date birthday;//出生日期
    private String major;//专业
//    private String address;//地址
    //定义对象类型属性
    private Address add;

    public Students() {
    }

    public Students(int sid, String sname, String gender, Date birthday, String major, Address add) {
        this.sid = sid;
        this.sname = sname;
        this.gender = gender;
        this.birthday = birthday;
        this.major = major;
        this.add = add;
    }

    @Id
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }
}


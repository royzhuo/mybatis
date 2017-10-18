package com.entity;

import java.util.Date;

/**
 * Created by roy.zhuo on 2017/10/18.
 */


public class Employee {

    private Integer id;
    private String name;
    private DepartMent dept;
    private Date createTime;
    private Date updateTime;

    public Employee(Integer id, String name, DepartMent dept, Date createTime, Date updateTime) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Employee() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DepartMent getDept() {
        return dept;
    }

    public void setDept(DepartMent dept) {
        this.dept = dept;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept=" + dept +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }


}

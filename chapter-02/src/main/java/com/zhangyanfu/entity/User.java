package com.zhangyanfu.entity;

/**
 * @Author Zhang Yanfu
 * @Date 2017/12/25.
 * @Email 1105564280@qq.com
 */
public class User {

    public String project_name;
    public String purpose;
    public String department;
    public int id;
    public String money;

    public User(String project_name, String purpose, String department, int id, String money) {
        this.project_name = project_name;
        this.purpose = purpose;
        this.department = department;
        this.id = id;
        this.money = money;
    }

    public User() {
    }

    public String getProject_name() {
        return project_name;
    }

    public String getPurpose() {
        return purpose;
    }

    public String getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public String getMoney() {
        return money;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "User{" +
                "project_name='" + project_name + '\'' +
                ", purpose='" + purpose + '\'' +
                ", department='" + department + '\'' +
                ", id=" + id +
                ", money='" + money + '\'' +
                '}';
    }
}

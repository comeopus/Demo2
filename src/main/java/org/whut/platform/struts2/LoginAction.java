package org.whut.platform.struts2;


import com.opensymphony.xwork2.ActionSupport;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 14-11-11
 * Time: 下午4:06
 * To change this template use File | Settings | File Templates.
 */
public class LoginAction{

    private String username;
    private String password;
    private int age;
    private Date date;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String execute(){
        return "success";
    }
}

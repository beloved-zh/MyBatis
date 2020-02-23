package com.zh.pojo;

/**
 * User实体类
 */
public class User {

    private int uId;
    private String uName;
    private String pwd;

    public User() {
    }

    public User(int uId, String uName, String pwd) {
        this.uId = uId;
        this.uName = uName;
        this.pwd = pwd;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "uId=" + uId +
                ", uName='" + uName + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}

package com.example.beandozerspringbootdemo.entity;



/**
 * @author sh on 2018/12/18 20:37
 * @version ideaIU-2018.2.3.win_home
 */

public class UserEntity implements Cloneable{
    private String uuid;
    private String userName;
    private String password;
    private String sex;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public UserEntity clone() throws CloneNotSupportedException {
        return (UserEntity) super.clone();
    }
}

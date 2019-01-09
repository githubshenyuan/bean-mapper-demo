package com.example.beandozerspringbootdemo.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author sh on 2018/12/18 20:37
 * @version ideaIU-2018.2.3.win_home
 */
@Entity
@Table(name = "user")
public class UserEntity {
    private String uuid;
    private String userName;
    private String password;
    private String sex;
    @Id
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @GeneratedValue(generator = "system-uuid")
    @Column(name = "uuid")
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    @Basic
    @Column(name = "userName")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Basic
    @Column(name = "sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

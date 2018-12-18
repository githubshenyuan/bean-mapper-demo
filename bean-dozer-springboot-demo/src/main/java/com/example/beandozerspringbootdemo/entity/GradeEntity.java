package com.example.beandozerspringbootdemo.entity;

import java.util.List;

/**
 * @author sh on 2018/12/18 20:38
 * @version ideaIU-2018.2.3.win_home
 */
public class GradeEntity {
    private String uuid;
    private String gradeName;
    private List<UserEntity> userEntityList;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public List<UserEntity> getUserEntityList() {
        return userEntityList;
    }

    public void setUserEntityList(List<UserEntity> userEntityList) {
        this.userEntityList = userEntityList;
    }
}

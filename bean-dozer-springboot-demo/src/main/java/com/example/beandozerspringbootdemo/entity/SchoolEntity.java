package com.example.beandozerspringbootdemo.entity;

import java.util.List;

/**
 * @author sh on 2018/12/18 20:38
 * @version ideaIU-2018.2.3.win_home
 */
public class SchoolEntity {
    private String uuid;
    private String schoolName;
    private List<GradeEntity> gradeEntityList;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public List<GradeEntity> getGradeEntityList() {
        return gradeEntityList;
    }

    public void setGradeEntityList(List<GradeEntity> gradeEntityList) {
        this.gradeEntityList = gradeEntityList;
    }
}

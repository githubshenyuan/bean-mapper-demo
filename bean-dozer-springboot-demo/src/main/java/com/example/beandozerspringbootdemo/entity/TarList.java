package com.example.beandozerspringbootdemo.entity;

import java.util.Date;
import java.util.List;

/**
 * @author sh on 2018/12/18 21:35
 * @version ideaIU-2018.2.3.win_home
 */
public class TarList {
    private String tar;
    private Date inputDate;
    private List<DeepTarEntity> deepTarEntities;
    private String value;

    private DeepTarEntity deepTarEntity;

    public String getTar() {
        return tar;
    }

    public void setTar(String tar) {
        this.tar = tar;
    }

    public List<DeepTarEntity> getDeepTarEntities() {
        return deepTarEntities;
    }

    public void setDeepTarEntities(List<DeepTarEntity> deepTarEntities) {
        this.deepTarEntities = deepTarEntities;
    }

    public DeepTarEntity getDeepTarEntity() {
        return deepTarEntity;
    }

    public void setDeepTarEntity(DeepTarEntity deepTarEntity) {
        this.deepTarEntity = deepTarEntity;
    }

    public Date getInputDate() {
        return inputDate;
    }

    public void setInputDate(Date inputDate) {
        this.inputDate = inputDate;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

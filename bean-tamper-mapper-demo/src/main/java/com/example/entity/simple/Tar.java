package com.example.entity.simple;

import java.util.Date;
import java.util.List;

/**
 * @author sh on 2018/9/24
 * @version ideaIU-2017.2.5.win
 */
public class Tar {


    private String tarName;
    private Date tarStrDate;
    private String tarDate;
    private ComponentTar componentTar;
    private List<ComponentTar> componentTarList;

    private ComponentTar componentTar1;

    public String getTarName() {
        return tarName;
    }

    public void setTarName(String tarName) {
        this.tarName = tarName;
    }

    public Date getTarStrDate() {
        return tarStrDate;
    }

    public void setTarStrDate(Date tarStrDate) {
        this.tarStrDate = tarStrDate;
    }

    public String getTarDate() {
        return tarDate;
    }

    public void setTarDate(String tarDate) {
        this.tarDate = tarDate;
    }

    public ComponentTar getComponentTar() {
        return componentTar;
    }

    public void setComponentTar(ComponentTar componentTar) {
        this.componentTar = componentTar;
    }

    public List<ComponentTar> getComponentTarList() {
        return componentTarList;
    }

    public void setComponentTarList(List<ComponentTar> componentTarList) {
        this.componentTarList = componentTarList;
    }

    public ComponentTar getComponentTar1() {
        return componentTar1;
    }

    public void setComponentTar1(ComponentTar componentTar1) {
        this.componentTar1 = componentTar1;
    }
}

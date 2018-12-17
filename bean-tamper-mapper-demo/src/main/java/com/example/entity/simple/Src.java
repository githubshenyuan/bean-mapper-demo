package com.example.entity.simple;

import java.util.Date;
import java.util.List;

/**
 * @author sh on 2018/9/24
 * @version ideaIU-2017.2.5.win
 */
public class Src {

    private String name;
    private String strDate;
    private Date date;
    private ComponentSrc componentSrc;
    private List<ComponentSrc> componentSrcList;

    private List<ComponentSrc> componentSrcList1;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStrDate() {
        return strDate;
    }

    public void setStrDate(String strDate) {
        this.strDate = strDate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ComponentSrc getComponentSrc() {
        return componentSrc;
    }

    public void setComponentSrc(ComponentSrc componentSrc) {
        this.componentSrc = componentSrc;
    }

    public List<ComponentSrc> getComponentSrcList() {
        return componentSrcList;
    }

    public void setComponentSrcList(List<ComponentSrc> componentSrcList) {
        this.componentSrcList = componentSrcList;
    }

    public List<ComponentSrc> getComponentSrcList1() {
        return componentSrcList1;
    }

    public void setComponentSrcList1(List<ComponentSrc> componentSrcList1) {
        this.componentSrcList1 = componentSrcList1;
    }
}

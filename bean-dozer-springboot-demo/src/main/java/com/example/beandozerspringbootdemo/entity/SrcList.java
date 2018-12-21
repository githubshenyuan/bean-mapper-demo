package com.example.beandozerspringbootdemo.entity;

import java.util.List;
import java.util.Map;

/**
 * @author sh on 2018/12/18 21:35
 * @version ideaIU-2018.2.3.win_home
 */
public class SrcList {
    private String src;
    private String inputDate;
    private List<DeepSrcEntity> deepSrcEntities;
    private Map<String, Map<String, RuleMapEntity>> mapMap;


    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public List<DeepSrcEntity> getDeepSrcEntities() {
        return deepSrcEntities;
    }

    public void setDeepSrcEntities(List<DeepSrcEntity> deepSrcEntities) {
        this.deepSrcEntities = deepSrcEntities;
    }

    public String getInputDate() {
        return inputDate;
    }

    public void setInputDate(String inputDate) {
        this.inputDate = inputDate;
    }

    public Map<String, Map<String, RuleMapEntity>> getMapMap() {
        return mapMap;
    }

    public void setMapMap(Map<String, Map<String, RuleMapEntity>> mapMap) {
        this.mapMap = mapMap;
    }
}

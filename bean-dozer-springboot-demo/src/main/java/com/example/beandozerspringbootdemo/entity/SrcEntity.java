package com.example.beandozerspringbootdemo.entity;

import java.util.Map;

/**
 * @author sh 2018/12/20 14:53
 * @version ideaIU-2018.2.5.win
 */
public class SrcEntity {
    Map<String, RuleMapEntity> mapEntityMap;

    public Map<String, RuleMapEntity> getMapEntityMap() {
        return mapEntityMap;
    }

    public void setMapEntityMap(Map<String, RuleMapEntity> mapEntityMap) {
        this.mapEntityMap = mapEntityMap;
    }
}

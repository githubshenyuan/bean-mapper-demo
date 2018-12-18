package com.example.beandozerspringbootdemo.entity;

import java.util.List;

/**
 * @author sh on 2018/12/18 21:35
 * @version ideaIU-2018.2.3.win_home
 */
public class SrcList {
    private String src;
    private List<DeepSrcEntity> deepSrcEntities;


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
}

package com.example.beandozerspringbootdemo.entity;

import java.util.List;

/**
 * @author sh on 2018/12/18 21:35
 * @version ideaIU-2018.2.3.win_home
 */
public class TarList {
    private String tar;
    private List<DeepTarEntity> deepTarEntities;

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
}

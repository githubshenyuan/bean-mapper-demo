package com.example.beandozerspringbootdemo.entity;

import java.util.Map;

/**
 * @author sh 2018/12/20 12:29
 * @version ideaIU-2018.2.5.win
 */
public class RuleMapEntity {
    private String channelId;
    private Map<String, String> staus;
    private Map<String, String> value;

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }


    public Map<String, String> getStaus() {
        return staus;
    }

    public void setStaus(Map<String, String> staus) {
        this.staus = staus;
    }

    public Map<String, String> getValue() {
        return value;
    }

    public void setValue(Map<String, String> value) {
        this.value = value;
    }
}

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

    public Map<String, String> getRules() {
        return rules;
    }

    public void setRules(Map<String, String> rules) {
        this.rules = rules;
    }
}

package com.example.beandozerspringbootdemo.common.service;

/**
 * @author sh on 2019/1/5 23:06
 * @version ideaIU-2018.2.3.win_home
 */
public class MatchEntity {
    //
    private String channelId;
    private String type;
    private String flag;
    private String key;
    private String value;

    MatchEntity(String channelId, String type, String flag, String key, String value) {
        this.channelId = channelId;
        this.type = type;
        this.flag = flag;
        this.key = key;
        this.value = value;
    }
    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

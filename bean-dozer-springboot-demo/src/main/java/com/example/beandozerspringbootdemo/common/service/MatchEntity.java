package com.example.beandozerspringbootdemo.common.service;

/**
 * @author sh on 2019/1/5 23:06
 * @version ideaIU-2018.2.3.win_home
 */
public class MatchEntity {
    //
    private String channelId;
    private String type;
    private String scene;
    private String key;
    private String value;
    private String description;

    MatchEntity(String channelId, String type, String scene, String key, String value) {
        this.channelId = channelId;
        this.type = type;
        this.scene = scene;
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

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

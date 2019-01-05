package com.example.beandozerspringbootdemo.common.constants;

/**
 * @author sh on 2019/1/5 22:26
 * @version ideaIU-2018.2.3.win_home
 */
public class ResultData {
    private String code;
    private String message;
    private Object data;

    private ResultData(){
        this.code = "200";
        this.message = "SUCCESS";
    }
    public static ResultData success() {
        return new ResultData();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

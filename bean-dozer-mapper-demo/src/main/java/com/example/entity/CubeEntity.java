package com.example.entity;

/**
 * @author sh 2018/12/18 16:30
 * @version ideaIU-2018.2.5.win
 * 立体对象  嵌套对象
 */
public class CubeEntity {
    private UserSrc userSrc;
    private UserTar userTar;

    public UserSrc getUserSrc() {
        return userSrc;
    }

    public void setUserSrc(UserSrc userSrc) {
        this.userSrc = userSrc;
    }

    public UserTar getUserTar() {
        return userTar;
    }

    public void setUserTar(UserTar userTar) {
        this.userTar = userTar;
    }
}

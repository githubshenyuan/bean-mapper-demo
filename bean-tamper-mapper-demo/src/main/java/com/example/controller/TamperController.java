package com.example.controller;

import com.alibaba.tamper.BeanMapping;
import com.alibaba.tamper.core.config.BeanMappingConfigHelper;
import com.example.entity.UserSrc;
import com.example.entity.UserTar;
import sun.rmi.runtime.Log;

import java.util.UUID;

/**
 * @author sh 2018/12/17 19:29
 * @version ideaIU-2018.2.5.win
 */
public class TamperController {

    public void start() {
        BeanMappingConfigHelper.getInstance().registerConfig("mapper/single.xml");
        UserSrc userSrc = new UserSrc();
        UserTar userTar = new UserTar();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            String uuid = UUID.randomUUID().toString();
            map(userSrc, userTar,uuid);
        }

        long end = System.currentTimeMillis();

        System.out.println("百万次耗时："+(end-start)/1000+"秒 "+(end-start)%1000+"毫秒");
    }

    public static void map(UserSrc userSrc, UserTar userTar,String uuid) {
        BeanMapping srcMapping    = null;
        BeanMapping targetMapping = null;
        srcMapping = BeanMapping.create(UserSrc.class, UserTar.class);
        userSrc.setUuidSrc(uuid);
        userSrc.setUserNameSrc(uuid);
        userSrc.setPasswordSrc(uuid);
        srcMapping.mapping(userSrc, userTar);

    }

    public static void main(String[] args) {





    }

}

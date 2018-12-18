package com.example.controller;

import com.example.entity.CubeEntity;
import com.example.entity.FlatEntity;
import com.example.entity.UserSrc;
import com.example.entity.UserTar;
import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;

import java.lang.ref.SoftReference;
import java.util.UUID;

/**
 * @author sh 2018/12/18 8:56
 * @version ideaIU-2018.2.5.win
 */
public class DozerController {


    public void start() {
        Mapper mapper = DozerBeanMapperBuilder.create()
                .withMappingFiles( "dozer/single.xml")
                .build();


        UserSrc userSrc = new UserSrc();
        UserTar userTar = new UserTar();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            String uuid = UUID.randomUUID().toString();
            map(userSrc, userTar, uuid, mapper);

        }

        long end = System.currentTimeMillis();

        System.out.println("百万次耗时："+(end-start)/1000+"秒 "+(end-start)%1000+"毫秒");

    }

    public void map(UserSrc userSrc, UserTar userTar, String uuid, Mapper mapper) {
        userSrc.setUuidSrc(uuid);
        userSrc.setUserNameSrc(uuid);
        userSrc.setPasswordSrc(uuid);

        mapper.map(userSrc, userTar);

    }

    /**
     * 扁平化映射 测试。。。。。
     * 通过
     */
    public void plat() {

        Mapper mapper = DozerBeanMapperBuilder.create()
                .withMappingFiles( "dozer/plat.xml")
                .build();
        FlatEntity flatEntity = new FlatEntity();
        String uuid = UUID.randomUUID().toString();
        flatEntity.setUuidSrc(uuid);
        flatEntity.setUuidTar(uuid);
        flatEntity.setUserNameSrc(uuid);
        flatEntity.setUserNameTar(uuid);
        flatEntity.setPasswordSrc(uuid);
        flatEntity.setPasswordTar(uuid);
        CubeEntity cubeEntity = new CubeEntity();
        mapper.map(flatEntity, cubeEntity);

        System.out.println("");
    }
}

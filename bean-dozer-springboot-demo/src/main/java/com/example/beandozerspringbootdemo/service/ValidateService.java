package com.example.beandozerspringbootdemo.service;

import com.example.beandozerspringbootdemo.common.constants.ResultData;
import com.example.beandozerspringbootdemo.entity.UserEntity;
import com.example.beandozerspringbootdemo.repostory.UserRepostory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author sh on 2019/1/5 21:51
 * @version ideaIU-2018.2.3.win_home
 */
@Service
public class ValidateService {

    @Resource
    UserRepostory userRepostory;

    public ResultData validateData() {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserName("小明");
        userEntity.setPassword("123456");
        userEntity.setSex("男");
        userRepostory.save(userEntity);
        System.out.println("ValidateService服务：validateData 方法被调用");
        List<String> list = new ArrayList<>();
        list.add("402809816827451f016827454f280002");
        list.add("402809816827451f016827454f1e0000");
        List<UserEntity> userEntities = userRepostory.getUser(list);
        System.out.println("");
        return ResultData.success();
    }

    public ResultData validateBusiness() {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserName("小利");
        userEntity.setPassword("09890");
        userEntity.setSex("女");
        userRepostory.save(userEntity);
        System.out.println("ValidateService服务：validataBusiness 方法被调用");
        return ResultData.success();
    }

    public ResultData cancelValidateData() {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserName("小照");
        userEntity.setPassword("45678");
        userEntity.setSex("男");
        userRepostory.save(userEntity);
        System.out.println("ValidateService服务：cancelValidateData 方法被调用");
        return ResultData.success();
    }
}

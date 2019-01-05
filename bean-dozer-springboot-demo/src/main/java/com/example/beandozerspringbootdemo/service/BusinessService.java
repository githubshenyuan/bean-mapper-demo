package com.example.beandozerspringbootdemo.service;


import com.example.beandozerspringbootdemo.common.constants.ResultData;
import org.springframework.stereotype.Service;

/**
 * @author sh on 2019/1/5 21:52
 * @version ideaIU-2018.2.3.win_home
 */
@Service
public class BusinessService {
    public ResultData validateBusiness() {
        System.out.println("BusinessService 服务：validateBusiness 方法被调用");
        return ResultData.success();
    }

    public ResultData cancelValidateBusiness() {
        System.out.println("BusinessService 服务：cancelValidateBusiness 方法被调用");
        return ResultData.success();
    }
}

package com.example.beandozerspringbootdemo.service;

import com.example.beandozerspringbootdemo.common.constants.ResultData;
import org.springframework.stereotype.Service;

/**
 * @author sh on 2019/1/5 21:51
 * @version ideaIU-2018.2.3.win_home
 */
@Service
public class ValidateService {
    public ResultData validateData() {


        System.out.println("ValidateService服务：validateData 方法被调用");
        return ResultData.success();
    }

    public ResultData validateBusiness() {

        System.out.println("ValidateService服务：validataBusiness 方法被调用");
        return ResultData.success();
    }

    public ResultData cancelValidateData() {

        System.out.println("ValidateService服务：cancelValidateData 方法被调用");
        return ResultData.success();
    }
}

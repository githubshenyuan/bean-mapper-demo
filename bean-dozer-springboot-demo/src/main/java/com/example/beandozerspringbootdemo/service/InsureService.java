package com.example.beandozerspringbootdemo.service;

import com.example.beandozerspringbootdemo.common.constants.ResultData;

import com.example.beandozerspringbootdemo.common.service.MatchEntity;
import com.example.beandozerspringbootdemo.common.service.MatchRationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/**
 * @author sh on 2019/1/5 22:10
 * @version ideaIU-2018.2.3.win_home
 */
@Service
public class InsureService {
    @Resource
    ValidateService validateService;
    @Resource
    BusinessService businessService;

    public ResultData Validate(String abc)  {
        Class<ValidateService> clazz = ValidateService.class;
        List<MatchEntity> business = MatchRationService.businessMatchRation.get(abc).get("validateService");
        try {
            for (MatchEntity matchEntity : business) {
                Method method = clazz.getMethod(matchEntity.getKey());
                ResultData sss = (ResultData) method.invoke(validateService);
                if (!sss.getCode().equals("200")) {
                    return sss;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return ResultData.success();
    }
}

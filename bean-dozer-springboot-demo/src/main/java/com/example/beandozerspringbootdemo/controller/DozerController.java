package com.example.beandozerspringbootdemo.controller;

import com.example.beandozerspringbootdemo.common.constants.ResultData;
import com.example.beandozerspringbootdemo.common.service.MatchEntity;
import com.example.beandozerspringbootdemo.common.service.MatchRationService;
import com.example.beandozerspringbootdemo.entity.DeepSrcEntity;
import com.example.beandozerspringbootdemo.entity.RuleMapEntity;
import com.example.beandozerspringbootdemo.entity.SrcList;
import com.example.beandozerspringbootdemo.entity.TarList;
import com.example.beandozerspringbootdemo.service.InsureService;
import com.github.dozermapper.core.Mapper;
import org.springframework.cglib.reflect.FastClass;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;


/**
 * @author sh on 2018/12/18 20:32
 * @version ideaIU-2018.2.3.win_home
 */
@RestController
public class DozerController {

    @Resource
    Mapper mapper;
    @Resource
    InsureService insureService;
    @RequestMapping("do")
    public String dozer() {

        Map<String, Map> map = new HashMap<>();

        Map<String, String> map1 = new HashMap<>();
        map1.put("cdf", "123456");
        map.put("abc", map1);
        SrcList srcList = new SrcList();
        mapper.map(map, srcList,"abcd");
        System.out.println("");
        return "do";
    }
    @RequestMapping("dozer")
    public String demo() {
        SrcList srcList = new SrcList();
        srcList.setSrc("src");
        srcList.setInputDate("1992/12/12");
        DeepSrcEntity deepSrcEntity = new DeepSrcEntity();
        List<DeepSrcEntity> deepSrcEntities = new ArrayList<>();
        deepSrcEntities.add(deepSrcEntity);
        deepSrcEntity.setSrcUuid("uuid");
        deepSrcEntity.setSrcUser("user");
        TarList tarList = new TarList();
        srcList.setDeepSrcEntities(deepSrcEntities);
        System.out.println("");
        Map<String, RuleMapEntity> map = new HashMap();
        RuleMapEntity mapEntity = new RuleMapEntity();
        map.put("ide", mapEntity);
        Map<String,Map<String, RuleMapEntity>> mapMap=new HashMap<>();
        mapMap.put("41",map);
        srcList.setMapMap(mapMap);

        Map map1 = srcList.getMapMap();
        mapper.map(map1, tarList,"abutment-map");
        return "dozer";
    }

    @RequestMapping("ma")
    public ResultData match() {
        ResultData resultData;
        try {
            resultData = insureService.Validate("41");
        } catch (Exception ex) {
            ex.printStackTrace();
            resultData = new ResultData();
        }

        return resultData;
    }
    public static void main(String[] args) {
        FastClass fastClass = FastClass.create(SrcList.class);
    }
}

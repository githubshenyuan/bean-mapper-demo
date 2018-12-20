package com.example.beandozerspringbootdemo.controller;

import com.example.beandozerspringbootdemo.common.service.MatchRationService;
import com.example.beandozerspringbootdemo.entity.DeepSrcEntity;
import com.example.beandozerspringbootdemo.entity.SrcList;
import com.example.beandozerspringbootdemo.entity.TarList;
import com.github.dozermapper.core.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author sh on 2018/12/18 20:32
 * @version ideaIU-2018.2.3.win_home
 */
@RestController
public class DozerController {
    @Resource
    Mapper mapper;

    @RequestMapping("dozer")
    public String demo() {
        Map map = MatchRationService.businessMatchRation;
        Map map1 = MatchRationService.businessMatchRation;
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
        mapper.map(srcList, tarList,"abutment");
        return "dozer";
    }
}

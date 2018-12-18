package com.example.beandozerspringbootdemo.controller;

import com.example.beandozerspringbootdemo.entity.DeepSrcEntity;
import com.example.beandozerspringbootdemo.entity.SrcList;
import com.example.beandozerspringbootdemo.entity.TarList;
import com.github.dozermapper.core.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

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

        SrcList srcList = new SrcList();
        srcList.setSrc("src");
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

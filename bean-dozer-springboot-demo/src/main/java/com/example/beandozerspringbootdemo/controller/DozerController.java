package com.example.beandozerspringbootdemo.controller;

import com.github.dozermapper.core.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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

        return "dozer";
    }
}

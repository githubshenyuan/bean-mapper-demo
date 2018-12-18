package com.example.controller;

import com.example.entity.UserSrc;
import com.example.entity.UserTar;
import org.milyn.Smooks;
import org.milyn.container.ExecutionContext;
import org.milyn.payload.JavaResult;
import org.milyn.payload.JavaSource;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.util.UUID;

/**
 * @author sh 2018/12/17 19:28
 * @version ideaIU-2018.2.5.win
 */
public class SmooksController {

    public void start() throws IOException, SAXException {
        Smooks smooks = new Smooks("smooks/smooks.xml");
        UserSrc userSrc = new UserSrc();
        ExecutionContext executionContext = smooks.createExecutionContext();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            String uuid = UUID.randomUUID().toString();
            map(smooks,userSrc,uuid,executionContext);
            System.out.println(i);
        }

        long end = System.currentTimeMillis();

        System.out.println("百万次耗时："+(end-start)/1000+"秒 "+(end-start)%1000+"毫秒");




    }

    public void map(Smooks smooks,UserSrc userSrc,String uuid,ExecutionContext executionContext) {
        userSrc.setUuidSrc(uuid);
        userSrc.setUserNameSrc(uuid);
        userSrc.setPasswordSrc(uuid);
        JavaSource source = new JavaSource(userSrc);
        JavaResult result = new JavaResult();


        smooks.filterSource(executionContext, source, result);
        UserTar userTar = new UserTar();
        userTar = (UserTar) result.getBean("lineItem");

    }


}

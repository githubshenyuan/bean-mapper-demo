package com.example.beandozerspringbootdemo.common.service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sh on 2018/12/20 21:30
 * @version ideaIU-2018.2.3.win_home
 */
public class MatchRationService {
    public static Map<String, Map> defaultMatchRation = new HashMap<>();
    public static Map<String, Map> businessMatchRation = new HashMap<>();

    static {
        setGuoXinMatchRation();
    }

    private static void setGuoXinMatchRation() {
        Map<String,String> defaultMap = new HashMap<>();
        defaultMap.put("1", "1");
        defaultMap.put("2", "2");
        defaultMap.put("3", "3");
        defaultMap.put("4", "4");
        defaultMap.put("5", "5");
        defaultMap.put("6", "6");
        defaultMap.put("7", "7");
        defaultMap.put("8", "8");
        defaultMap.put("9", "9");
        defaultMap.put("0", "0");
        defaultMap.put("10", "10");
        defaultMap.put("11", "11");
        defaultMap.put("12", "12");
        defaultMap.put("13", "13");
        defaultMatchRation.put("41", defaultMap);
        Map<String,String> businessMap = new HashMap<>();
        businessMap.put("1", "1");
        businessMap.put("2", "2");
        businessMap.put("3", "3");
        businessMap.put("4", "4");
        businessMap.put("5", "5");
        businessMap.put("6", "6");

        businessMatchRation.put("41", businessMap);

    }
}

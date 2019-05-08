package com.example.beandozerspringbootdemo.common.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author sh on 2018/12/20 21:30
 * @version ideaIU-2018.2.3.win_home
 */
public class MatchRationService {
    public final static Map<String, Map<String, String>> defaultMatchRation = new HashMap<>();
    public final static Map<String, Map<String, List<MatchEntity>>> businessMatchRation = new HashMap<>();
    public final static Map<String, Map<String, String>> validateMatchRation = new HashMap<>();
    static{
        setValue();
    }

    private static void setValue() {

        List<MatchEntity> matchEntities = new ArrayList<>();
        MatchEntity matchEntity1;
        //matchEntity1 = new MatchEntity("41","business","validateService","validateData","1");
        //matchEntities.add(matchEntity1);
        matchEntity1 = new MatchEntity("41","business","validateService","validateBusiness","1");
        matchEntities.add(matchEntity1);
        //matchEntity1 = new MatchEntity("41","business","validateService","cancelValidateData","1");
        //matchEntities.add(matchEntity1);
        //matchEntity1 = new MatchEntity("41","business","validateService","cancelVal","1");
        //matchEntities.add(matchEntity1);

        for (MatchEntity matchEntity : matchEntities) {
            switch (matchEntity.getType()) {
                case "default":
                    Map<String,String> map = defaultMatchRation.get(matchEntity.getChannelId());
                    if (map == null) {
                        defaultMatchRation.put(matchEntity.getChannelId(), new HashMap<>());
                        map = defaultMatchRation.get(matchEntity.getChannelId());
                    }
                    map.put(matchEntity.getScene()+"_"+matchEntity.getKey(), matchEntity.getValue());
                    break;
                case "business":
                    Map<String,List<MatchEntity>> businessMap = businessMatchRation.get(matchEntity.getChannelId());
                    if (businessMap == null) {
                        businessMatchRation.put(matchEntity.getChannelId(), new HashMap<>());
                        businessMap = businessMatchRation.get(matchEntity.getChannelId());
                    }
                    List<MatchEntity> matchEntityList = businessMap.get(matchEntity.getScene());
                    if (matchEntityList == null) {
                        businessMap.put(matchEntity.getScene(), new ArrayList<>());
                        matchEntityList = businessMap.get(matchEntity.getScene());
                    }
                    matchEntityList.add(matchEntity);
                    break;
                case "validate":
                    Map<String,String> validateMap = validateMatchRation.get(matchEntity.getChannelId());
                    if (validateMap == null) {
                        validateMatchRation.put(matchEntity.getChannelId(), new HashMap<>());
                        validateMap = validateMatchRation.get(matchEntity.getChannelId());
                    }
                    validateMap.put(matchEntity.getKey(), matchEntity.getValue());
                    break;
                default:
                    System.out.println("马哥你比");
            }
        }

    }
}

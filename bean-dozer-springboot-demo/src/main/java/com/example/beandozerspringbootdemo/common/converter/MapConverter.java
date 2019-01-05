package com.example.beandozerspringbootdemo.common.converter;

import com.github.dozermapper.core.CustomConverter;

/**
 * @author sh on 2019/1/1 20:20
 * @version ideaIU-2018.2.3.win_home
 */
public class MapConverter implements CustomConverter {
    @Override
    public Object convert(Object existingDestinationFieldValue, Object sourceFieldValue, Class<?> destinationClass, Class<?> sourceClass) {
        System.out.println("自定義裝喚起");
        return null;
    }
}

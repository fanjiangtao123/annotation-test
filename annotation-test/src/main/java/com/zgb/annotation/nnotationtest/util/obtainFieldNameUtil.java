package com.zgb.annotation.nnotationtest.util;

import com.zgb.annotation.nnotationtest.annotation.FieldInterface;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class obtainFieldNameUtil {
    public static void obtainFieldName(){
        Class<?> printClass = null;
        //KeyValueDto是实体类方便返回也可以用map
        List<Map<String,String>> list = new ArrayList();
        try {
            //获取类名的包名地址
            printClass = Class.forName("com.zgb.annotation.nnotationtest.entity.BrandInfo");
            //java反射机制获取所有方法名
            Field[] declaredFields = printClass.getDeclaredFields();
            //遍历循环方法并获取对应的注解名称
            for (Field declaredField : declaredFields) {
                String isNotNullStr = "";
                // 判断是否字段上存在注解  MethodInterface
                boolean annotationPresent = declaredField.isAnnotationPresent(FieldInterface.class);
                if (annotationPresent) {
                    // 获取自定义注解对象
                    FieldInterface annotation = declaredField.getAnnotation(FieldInterface.class);
                    // 根据对象获取注解值
                    isNotNullStr = annotation.name();
                    HashMap<String, String> objectObjectHashMap = new HashMap<>();
                    objectObjectHashMap.put(declaredField.getName(),isNotNullStr);
                    list.add(objectObjectHashMap);
                }

            }
            System.out.println(list.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

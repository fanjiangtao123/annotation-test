package com.zgb.annotation.nnotationtest.controller;

import com.zgb.annotation.nnotationtest.dto.CompareDTO;
import com.zgb.annotation.nnotationtest.entity.BrandInfo;
import com.zgb.annotation.nnotationtest.util.ClassCompareUtil;
import com.zgb.annotation.nnotationtest.util.obtainFieldNameUtil;

import java.util.Map;

public class testController {
    public static void main(String[] args){
        BrandInfo brandInfo = new BrandInfo();
        brandInfo.setBrandId(1);
        brandInfo.setName(1);
        BrandInfo brandInfo2 = new BrandInfo();
        brandInfo2.setBrandId(2);
        brandInfo2.setName(1);
        CompareDTO compareDTO = new CompareDTO();
        compareDTO.setNewObject(brandInfo);
        compareDTO.setOldObject(brandInfo2);
        Map<String, Map<String, Object>> stringMapMap = ClassCompareUtil.compareObject(compareDTO);
        System.out.println(stringMapMap);
        obtainFieldNameUtil.obtainFieldName();
    }
}

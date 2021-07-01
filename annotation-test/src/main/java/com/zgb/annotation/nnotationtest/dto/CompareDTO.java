package com.zgb.annotation.nnotationtest.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class CompareDTO {
    @ApiModelProperty(name = "旧对象")
    Object oldObject;
    @ApiModelProperty(name = "新对象")
    Object newObject;

}

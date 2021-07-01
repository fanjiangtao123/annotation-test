package com.zgb.annotation.nnotationtest.entity;

import com.zgb.annotation.nnotationtest.annotation.FieldInterface;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


import java.io.Serializable;

/**
 * 品牌信息
 *
 * @author makejava
 * @since 2021-06-10
 */
@Data
public class BrandInfo implements Serializable {

	/**
	 * 可能用上：
	 *
	 * @Accessors(chain = true)
	 * @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	 * @JsonFormat(timezone = "GTM+8", pattern = "yyyy-MM-dd HH:mm:ss")
	 * @TableField(exist = false)
	 */

	private static final long serialVersionUID = 303778186026141196L;

	/**
	 * 品牌主键id
	 */
	@FieldInterface(name = "物料派发明细主键id", dictionary = true)
	private Integer brandId;

	/**
	 * 品牌主键id
	 */
	@FieldInterface(name = "名称", dictionary = false)
	private Integer name;

}
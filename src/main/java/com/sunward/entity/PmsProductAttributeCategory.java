package com.sunward.entity;

/**
 * 产品属性分类表(PmsProductAttributeCategory)实体类
 *
 * @author hd
 * @since 2020-03-16 19:22:22
 */
import java.io.Serializable;
import lombok.Data;
 
@Data
public class PmsProductAttributeCategory implements Serializable {
    private static final long serialVersionUID = 273711227082826377L;
     
    private Long id;
     
    private String name;
    /**
	*属性数量
	*/ 
    private Integer attributeCount;
    /**
	*参数数量
	*/ 
    private Integer paramCount;

                                 
}
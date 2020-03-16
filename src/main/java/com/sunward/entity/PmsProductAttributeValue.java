package com.sunward.entity;

/**
 * 存储产品参数信息的表(PmsProductAttributeValue)实体类
 *
 * @author hd
 * @since 2020-03-16 19:22:22
 */
import java.io.Serializable;
import lombok.Data;
 
@Data
public class PmsProductAttributeValue implements Serializable {
    private static final long serialVersionUID = 954000067807418918L;
     
    private Long id;
     
    private Long productId;
     
    private Long productAttributeId;
    /**
	*手动添加规格或参数的值，参数单值，规格有多个时以逗号隔开
	*/ 
    private String value;

                                 
}
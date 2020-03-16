package com.sunward.entity;

/**
 * 产品分类(PmsProductCategory)实体类
 *
 * @author hd
 * @since 2020-03-16 19:22:22
 */
import java.io.Serializable;
import lombok.Data;
 
@Data
public class PmsProductCategory implements Serializable {
    private static final long serialVersionUID = 302097697046507770L;
     
    private Long id;
    /**
	*上机分类的编号：0表示一级分类
	*/ 
    private Long parentId;
     
    private String name;
    /**
	*分类级别：0->1级；1->2级
	*/ 
    private Integer level;
     
    private Integer productCount;
     
    private String productUnit;
    /**
	*是否显示在导航栏：0->不显示；1->显示
	*/ 
    private Integer navStatus;
    /**
	*显示状态：0->不显示；1->显示
	*/ 
    private Integer showStatus;
     
    private Integer sort;
    /**
	*图标
	*/ 
    private String icon;
     
    private String keywords;
    /**
	*描述
	*/ 
    private String description;

                                                                                                 
}
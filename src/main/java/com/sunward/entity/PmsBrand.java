package com.sunward.entity;

/**
 * 品牌表(PmsBrand)实体类
 *
 * @author hd
 * @since 2020-03-16 19:22:18
 */
import java.io.Serializable;
import lombok.Data;
 
@Data
public class PmsBrand implements Serializable {
    private static final long serialVersionUID = -24801266883570391L;
     
    private Long id;
     
    private String name;
    /**
	*首字母
	*/ 
    private String firstLetter;
     
    private Integer sort;
    /**
	*是否为品牌制造商：0->不是；1->是
	*/ 
    private Integer factoryStatus;
     
    private Integer showStatus;
    /**
	*产品数量
	*/ 
    private Integer productCount;
    /**
	*产品评论数量
	*/ 
    private Integer productCommentCount;
    /**
	*品牌logo
	*/ 
    private String logo;
    /**
	*专区大图
	*/ 
    private String bigPic;
    /**
	*品牌故事
	*/ 
    private String brandStory;

                                                                                         
}
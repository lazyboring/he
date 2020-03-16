package com.sunward.entity;

/**
 * 后台用户角色表(UmsRole)实体类
 *
 * @author hd
 * @since 2020-03-16 19:22:22
 */
import java.io.Serializable;
import lombok.Data;
 
@Data
public class UmsRole implements Serializable {
    private static final long serialVersionUID = -54390629133953436L;
     
    private Long id;
    /**
	*名称
	*/ 
    private String name;
    /**
	*描述
	*/ 
    private String description;
    /**
	*后台用户数量
	*/ 
    private Integer adminCount;
    /**
	*创建时间
	*/ 
    private Date createTime;
    /**
	*启用状态：0->禁用；1->启用
	*/ 
    private Integer status;
     
    private Integer sort;

                                                         
}
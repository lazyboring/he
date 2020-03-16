package com.sunward.entity;

/**
 * 后台用户表(UmsAdmin)实体类
 *
 * @author hd
 * @since 2020-03-16 19:22:22
 */
import java.io.Serializable;
import lombok.Data;
 
@Data
public class UmsAdmin implements Serializable {
    private static final long serialVersionUID = 771883161176262141L;
     
    private Long id;
     
    private String username;
     
    private String password;
    /**
	*头像
	*/ 
    private String icon;
    /**
	*邮箱
	*/ 
    private String email;
    /**
	*昵称
	*/ 
    private String nickName;
    /**
	*备注信息
	*/ 
    private String note;
    /**
	*创建时间
	*/ 
    private Date createTime;
    /**
	*最后登录时间
	*/ 
    private Date loginTime;
    /**
	*帐号启用状态：0->禁用；1->启用
	*/ 
    private Integer status;

                                                                                 
}
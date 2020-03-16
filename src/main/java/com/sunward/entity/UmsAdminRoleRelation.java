package com.sunward.entity;

/**
 * 后台用户和角色关系表(UmsAdminRoleRelation)实体类
 *
 * @author hd
 * @since 2020-03-16 19:22:22
 */
import java.io.Serializable;
import lombok.Data;
 
@Data
public class UmsAdminRoleRelation implements Serializable {
    private static final long serialVersionUID = 740271398793322624L;
     
    private Long id;
     
    private Long adminId;
     
    private Long roleId;

                         
}
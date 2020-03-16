package com.sunward.entity;

/**
 * 后台用户角色和权限关系表(UmsRolePermissionRelation)实体类
 *
 * @author hd
 * @since 2020-03-16 19:22:22
 */
import java.io.Serializable;
import lombok.Data;
 
@Data
public class UmsRolePermissionRelation implements Serializable {
    private static final long serialVersionUID = 319150677117675500L;
     
    private Long id;
     
    private Long roleId;
     
    private Long permissionId;

                         
}
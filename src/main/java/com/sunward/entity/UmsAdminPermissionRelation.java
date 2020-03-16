package com.sunward.entity;

/**
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限)(UmsAdminPermissionRelation)实体类
 *
 * @author hd
 * @since 2020-03-16 19:22:22
 */
import java.io.Serializable;
import lombok.Data;
 
@Data
public class UmsAdminPermissionRelation implements Serializable {
    private static final long serialVersionUID = -29491694978159288L;
     
    private Long id;
     
    private Long adminId;
     
    private Long permissionId;
     
    private Integer type;

                                 
}
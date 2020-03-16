package com.sunward.controller;

import com.sunward.entity.UmsRolePermissionRelation;
import com.sunward.service.UmsRolePermissionRelationService;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import javax.annotation.Resource;

/**
 * 后台用户角色和权限关系表(UmsRolePermissionRelation)表控制层
 *
 * @author makejava
 * @since 2020-03-16 19:22:22
 */
@RestController
@Api(tags = "umsRolePermissionRelationController",description = "后台用户角色和权限关系表")
@RequestMapping("umsRolePermissionRelation")
public class UmsRolePermissionRelationController {
    /**
     * 服务对象
     */
    @Resource
    private UmsRolePermissionRelationService umsRolePermissionRelationService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UmsRolePermissionRelation selectOne(Long id) {
        return this.umsRolePermissionRelationService.queryById(id);
    }

}
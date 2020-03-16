package com.sunward.controller;

import com.sunward.entity.UmsAdminRoleRelation;
import com.sunward.service.UmsAdminRoleRelationService;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import javax.annotation.Resource;

/**
 * 后台用户和角色关系表(UmsAdminRoleRelation)表控制层
 *
 * @author makejava
 * @since 2020-03-16 19:22:22
 */
@RestController
@Api(tags = "umsAdminRoleRelationController",description = "后台用户和角色关系表")
@RequestMapping("umsAdminRoleRelation")
public class UmsAdminRoleRelationController {
    /**
     * 服务对象
     */
    @Resource
    private UmsAdminRoleRelationService umsAdminRoleRelationService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UmsAdminRoleRelation selectOne(Long id) {
        return this.umsAdminRoleRelationService.queryById(id);
    }

}
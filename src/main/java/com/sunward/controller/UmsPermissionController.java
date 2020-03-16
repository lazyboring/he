package com.sunward.controller;

import com.sunward.entity.UmsPermission;
import com.sunward.service.UmsPermissionService;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import javax.annotation.Resource;

/**
 * 后台用户权限表(UmsPermission)表控制层
 *
 * @author makejava
 * @since 2020-03-16 19:22:22
 */
@RestController
@Api(tags = "umsPermissionController",description = "后台用户权限表")
@RequestMapping("umsPermission")
public class UmsPermissionController {
    /**
     * 服务对象
     */
    @Resource
    private UmsPermissionService umsPermissionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UmsPermission selectOne(Long id) {
        return this.umsPermissionService.queryById(id);
    }

}
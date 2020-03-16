package com.sunward.controller;

import com.sunward.entity.PmsProductAttributeCategory;
import com.sunward.service.PmsProductAttributeCategoryService;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import javax.annotation.Resource;

/**
 * 产品属性分类表(PmsProductAttributeCategory)表控制层
 *
 * @author makejava
 * @since 2020-03-16 19:22:22
 */
@RestController
@Api(tags = "pmsProductAttributeCategoryController",description = "产品属性分类表")
@RequestMapping("pmsProductAttributeCategory")
public class PmsProductAttributeCategoryController {
    /**
     * 服务对象
     */
    @Resource
    private PmsProductAttributeCategoryService pmsProductAttributeCategoryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public PmsProductAttributeCategory selectOne(Long id) {
        return this.pmsProductAttributeCategoryService.queryById(id);
    }

}
package com.sunward.controller;

import com.sunward.entity.PmsProductCategory;
import com.sunward.service.PmsProductCategoryService;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import javax.annotation.Resource;

/**
 * 产品分类(PmsProductCategory)表控制层
 *
 * @author makejava
 * @since 2020-03-16 19:22:22
 */
@RestController
@Api(tags = "pmsProductCategoryController",description = "产品分类")
@RequestMapping("pmsProductCategory")
public class PmsProductCategoryController {
    /**
     * 服务对象
     */
    @Resource
    private PmsProductCategoryService pmsProductCategoryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public PmsProductCategory selectOne(Long id) {
        return this.pmsProductCategoryService.queryById(id);
    }

}
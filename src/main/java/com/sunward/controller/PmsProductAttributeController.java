package com.sunward.controller;

import com.sunward.entity.PmsProductAttribute;
import com.sunward.service.PmsProductAttributeService;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import javax.annotation.Resource;

/**
 * 商品属性参数表(PmsProductAttribute)表控制层
 *
 * @author makejava
 * @since 2020-03-16 19:22:22
 */
@RestController
@Api(tags = "pmsProductAttributeController",description = "商品属性参数表")
@RequestMapping("pmsProductAttribute")
public class PmsProductAttributeController {
    /**
     * 服务对象
     */
    @Resource
    private PmsProductAttributeService pmsProductAttributeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public PmsProductAttribute selectOne(Long id) {
        return this.pmsProductAttributeService.queryById(id);
    }

}
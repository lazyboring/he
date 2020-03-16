package com.sunward.controller;

import com.sunward.entity.PmsProduct;
import com.sunward.service.PmsProductService;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import javax.annotation.Resource;

/**
 * 商品信息(PmsProduct)表控制层
 *
 * @author makejava
 * @since 2020-03-16 19:22:22
 */
@RestController
@Api(tags = "pmsProductController",description = "商品信息")
@RequestMapping("pmsProduct")
public class PmsProductController {
    /**
     * 服务对象
     */
    @Resource
    private PmsProductService pmsProductService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public PmsProduct selectOne(Long id) {
        return this.pmsProductService.queryById(id);
    }

}
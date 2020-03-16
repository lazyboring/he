package com.sunward.controller;

import com.sunward.entity.PmsBrand;
import com.sunward.service.PmsBrandService;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import javax.annotation.Resource;

/**
 * 品牌表(PmsBrand)表控制层
 *
 * @author makejava
 * @since 2020-03-16 19:22:21
 */
@RestController
@Api(tags = "pmsBrandController",description = "品牌表")
@RequestMapping("pmsBrand")
public class PmsBrandController {
    /**
     * 服务对象
     */
    @Resource
    private PmsBrandService pmsBrandService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public PmsBrand selectOne(Long id) {
        return this.pmsBrandService.queryById(id);
    }

}
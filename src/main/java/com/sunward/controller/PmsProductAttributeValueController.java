package com.sunward.controller;

import com.sunward.entity.PmsProductAttributeValue;
import com.sunward.service.PmsProductAttributeValueService;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import javax.annotation.Resource;

/**
 * 存储产品参数信息的表(PmsProductAttributeValue)表控制层
 *
 * @author makejava
 * @since 2020-03-16 19:22:22
 */
@RestController
@Api(tags = "pmsProductAttributeValueController",description = "存储产品参数信息的表")
@RequestMapping("pmsProductAttributeValue")
public class PmsProductAttributeValueController {
    /**
     * 服务对象
     */
    @Resource
    private PmsProductAttributeValueService pmsProductAttributeValueService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public PmsProductAttributeValue selectOne(Long id) {
        return this.pmsProductAttributeValueService.queryById(id);
    }

}
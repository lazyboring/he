package com.sunward.service;

import com.sunward.entity.PmsProductAttribute;
import java.util.List;

/**
 * 商品属性参数表(PmsProductAttribute)表服务接口
 *
 * @author makejava
 * @since 2020-03-16 19:22:22
 */
public interface PmsProductAttributeService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PmsProductAttribute queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PmsProductAttribute> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param pmsProductAttribute 实例对象
     * @return 实例对象
     */
    PmsProductAttribute insert(PmsProductAttribute pmsProductAttribute);

    /**
     * 修改数据
     *
     * @param pmsProductAttribute 实例对象
     * @return 实例对象
     */
    PmsProductAttribute update(PmsProductAttribute pmsProductAttribute);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
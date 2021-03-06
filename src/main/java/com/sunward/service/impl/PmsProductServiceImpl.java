package com.sunward.service.impl;

import com.sunward.entity.PmsProduct;
import com.sunward.dao.PmsProductDao;
import com.sunward.service.PmsProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品信息(PmsProduct)表服务实现类
 *
 * @author makejava
 * @since 2020-03-16 19:22:22
 */
@Service("pmsProductService")
public class PmsProductServiceImpl implements PmsProductService {
    @Resource
    private PmsProductDao pmsProductDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsProduct queryById(Long id) {
        return this.pmsProductDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PmsProduct> queryAllByLimit(int offset, int limit) {
        return this.pmsProductDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param pmsProduct 实例对象
     * @return 实例对象
     */
    @Override
    public PmsProduct insert(PmsProduct pmsProduct) {
        this.pmsProductDao.insert(pmsProduct);
        return pmsProduct;
    }

    /**
     * 修改数据
     *
     * @param pmsProduct 实例对象
     * @return 实例对象
     */
    @Override
    public PmsProduct update(PmsProduct pmsProduct) {
        this.pmsProductDao.update(pmsProduct);
        return this.queryById(pmsProduct.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsProductDao.deleteById(id) > 0;
    }
}
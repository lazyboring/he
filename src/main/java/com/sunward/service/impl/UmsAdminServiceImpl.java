package com.sunward.service.impl;

import com.sunward.entity.UmsAdmin;
import com.sunward.dao.UmsAdminDao;
import com.sunward.service.UmsAdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 后台用户表(UmsAdmin)表服务实现类
 *
 * @author makejava
 * @since 2020-03-16 19:22:22
 */
@Service("umsAdminService")
public class UmsAdminServiceImpl implements UmsAdminService {
    @Resource
    private UmsAdminDao umsAdminDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsAdmin queryById(Long id) {
        return this.umsAdminDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<UmsAdmin> queryAllByLimit(int offset, int limit) {
        return this.umsAdminDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param umsAdmin 实例对象
     * @return 实例对象
     */
    @Override
    public UmsAdmin insert(UmsAdmin umsAdmin) {
        this.umsAdminDao.insert(umsAdmin);
        return umsAdmin;
    }

    /**
     * 修改数据
     *
     * @param umsAdmin 实例对象
     * @return 实例对象
     */
    @Override
    public UmsAdmin update(UmsAdmin umsAdmin) {
        this.umsAdminDao.update(umsAdmin);
        return this.queryById(umsAdmin.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.umsAdminDao.deleteById(id) > 0;
    }
}
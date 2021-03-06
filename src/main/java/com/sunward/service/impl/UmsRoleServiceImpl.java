package com.sunward.service.impl;

import com.sunward.entity.UmsRole;
import com.sunward.dao.UmsRoleDao;
import com.sunward.service.UmsRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 后台用户角色表(UmsRole)表服务实现类
 *
 * @author makejava
 * @since 2020-03-16 19:22:22
 */
@Service("umsRoleService")
public class UmsRoleServiceImpl implements UmsRoleService {
    @Resource
    private UmsRoleDao umsRoleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsRole queryById(Long id) {
        return this.umsRoleDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<UmsRole> queryAllByLimit(int offset, int limit) {
        return this.umsRoleDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param umsRole 实例对象
     * @return 实例对象
     */
    @Override
    public UmsRole insert(UmsRole umsRole) {
        this.umsRoleDao.insert(umsRole);
        return umsRole;
    }

    /**
     * 修改数据
     *
     * @param umsRole 实例对象
     * @return 实例对象
     */
    @Override
    public UmsRole update(UmsRole umsRole) {
        this.umsRoleDao.update(umsRole);
        return this.queryById(umsRole.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.umsRoleDao.deleteById(id) > 0;
    }
}
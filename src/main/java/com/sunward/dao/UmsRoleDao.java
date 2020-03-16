package com.sunward.dao;
 
import com.sunward.dto.UmsRoleDto;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
 
/**
 * 后台用户角色表(UmsRole)表数据库访问层
 *
 * @author niechen
 * @since 2020-03-16 19:22:22
 */
@Mapper
public interface UmsRoleDao {
 
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsRoleDto queryById(Long id);
 
    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UmsRoleDto> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);
 
 
    /**
     * 通过实体作为筛选条件查询
     *
     * @param umsRoleDto 实例对象
     * @return 对象列表
     */
    List<UmsRoleDto> queryAll(UmsRoleDto umsRoleDto);
 
    /**
     * 新增数据
     *
     * @param umsRoleDto 实例对象
     * @return 影响行数
     */
    int insert(UmsRoleDto umsRoleDto);
 
    /**
     * 修改数据
     *
     * @param umsRoleDto 实例对象
     * @return 影响行数
     */
    int update(UmsRoleDto umsRoleDto);
 
    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);
 
}
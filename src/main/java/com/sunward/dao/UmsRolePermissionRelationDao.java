package com.sunward.dao;
 
import com.sunward.dto.UmsRolePermissionRelationDto;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
 
/**
 * 后台用户角色和权限关系表(UmsRolePermissionRelation)表数据库访问层
 *
 * @author niechen
 * @since 2020-03-16 19:22:22
 */
@Mapper
public interface UmsRolePermissionRelationDao {
 
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsRolePermissionRelationDto queryById(Long id);
 
    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UmsRolePermissionRelationDto> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);
 
 
    /**
     * 通过实体作为筛选条件查询
     *
     * @param umsRolePermissionRelationDto 实例对象
     * @return 对象列表
     */
    List<UmsRolePermissionRelationDto> queryAll(UmsRolePermissionRelationDto umsRolePermissionRelationDto);
 
    /**
     * 新增数据
     *
     * @param umsRolePermissionRelationDto 实例对象
     * @return 影响行数
     */
    int insert(UmsRolePermissionRelationDto umsRolePermissionRelationDto);
 
    /**
     * 修改数据
     *
     * @param umsRolePermissionRelationDto 实例对象
     * @return 影响行数
     */
    int update(UmsRolePermissionRelationDto umsRolePermissionRelationDto);
 
    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);
 
}
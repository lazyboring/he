package com.sunward.dao;
 
import com.sunward.dto.PmsBrandDto;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
 
/**
 * 品牌表(PmsBrand)表数据库访问层
 *
 * @author niechen
 * @since 2020-03-16 19:22:19
 */
@Mapper
public interface PmsBrandDao {
 
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PmsBrandDto queryById(Long id);
 
    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PmsBrandDto> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);
 
 
    /**
     * 通过实体作为筛选条件查询
     *
     * @param pmsBrandDto 实例对象
     * @return 对象列表
     */
    List<PmsBrandDto> queryAll(PmsBrandDto pmsBrandDto);
 
    /**
     * 新增数据
     *
     * @param pmsBrandDto 实例对象
     * @return 影响行数
     */
    int insert(PmsBrandDto pmsBrandDto);
 
    /**
     * 修改数据
     *
     * @param pmsBrandDto 实例对象
     * @return 影响行数
     */
    int update(PmsBrandDto pmsBrandDto);
 
    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);
 
}
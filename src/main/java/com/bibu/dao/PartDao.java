package com.bibu.dao;

import com.bibu.entity.Part;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 网站栏目表(Part)表数据库访问层
 *
 * @author WeitJack
 * @since 2022-01-15 12:38:21
 */
@Mapper
public interface PartDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Part queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param part 查询条件
     * @return 对象列表
     */
    List<Part> queryAllByLimit(Part part);

    /**
     * 统计总行数
     *
     * @param part 查询条件
     * @return 总行数
     */
    long count(Part part);

    /**
     * 新增数据
     *
     * @param part 实例对象
     * @return 影响行数
     */
    int insert(Part part);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Part> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Part> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Part> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Part> entities);

    /**
     * 修改数据
     *
     * @param part 实例对象
     * @return 影响行数
     */
    int update(Part part);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}


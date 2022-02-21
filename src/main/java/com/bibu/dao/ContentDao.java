package com.bibu.dao;

import com.bibu.entity.Content;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 内容表(Content)表数据库访问层
 *
 * @author WeitJack
 * @since 2022-02-21 22:09:09
 */
@Mapper
public interface ContentDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Content queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param content 查询条件
     * @return 对象列表
     */
    List<Content> queryAllByLimit(Content content);

    /**
     * 统计总行数
     *
     * @param content 查询条件
     * @return 总行数
     */
    long count(Content content);

    /**
     * 新增数据
     *
     * @param content 实例对象
     * @return 影响行数
     */
    int insert(Content content);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Content> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Content> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Content> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Content> entities);

    /**
     * 修改数据
     *
     * @param content 实例对象
     * @return 影响行数
     */
    int update(Content content);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}


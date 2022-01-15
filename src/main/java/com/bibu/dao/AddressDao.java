package com.bibu.dao;

import com.bibu.entity.Address;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 地区表(Address)表数据库访问层
 *
 * @author WeitJack
 * @since 2022-01-03 16:07:52
 */
@Mapper
public interface AddressDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Address queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param address  查询条件
     * @return 对象列表
     */
    List<Address> queryAllByLimit(@Param("address") Address address);

    /**
     * 获取省份列表
     *
     * @return 省份列表
     */
    List<Address> getProvincialList();

    /**
     * 获取城市列表
     *
     * @param address 实体类
     * @return 返回所有城市列表
     */
    List<Address> getCityList(Address address);

    /**
     * 统计总行数
     *
     * @param address 查询条件
     * @return 总行数
     */
    long count(Address address);

    /**
     * 新增数据
     *
     * @param address 实例对象
     * @return 影响行数
     */
    int insert(Address address);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Address> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Address> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Address> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Address> entities);

    /**
     * 修改数据
     *
     * @param address 实例对象
     * @return 影响行数
     */
    int update(Address address);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}


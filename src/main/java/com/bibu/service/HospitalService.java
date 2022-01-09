package com.bibu.service;

import com.bibu.entity.Hospital;
import com.github.pagehelper.PageInfo;

/**
 * 医院表(Hospital)表服务接口
 *
 * @author WeitJack
 * @since 2022-01-09 23:15:17
 */
public interface HospitalService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Hospital queryById(Integer id);

    /**
     * 分页查询
     *
     * @param hospital 筛选条件
     * @return 查询结果
     */
    PageInfo<Hospital> queryByPage(Hospital hospital);

    /**
     * 新增数据
     *
     * @param hospital 实例对象
     * @return 实例对象
     */
    Hospital insert(Hospital hospital);

    /**
     * 修改数据
     *
     * @param hospital 实例对象
     * @return 实例对象
     */
    Hospital update(Hospital hospital);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}

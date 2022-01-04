package com.bibu.service;

import com.bibu.entity.Address;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 地区表(Address)表服务接口
 *
 * @author WeitJack
 * @since 2022-01-03 16:07:53
 */
public interface AddressService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Address queryById(Integer id);

    /**
     * 分页查询
     *
     * @param address     筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    Page<Address> queryByPage(Address address, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param address 实例对象
     * @return 实例对象
     */
    Address insert(Address address);

    /**
     * 修改数据
     *
     * @param address 实例对象
     * @return 实例对象
     */
    Address update(Address address);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}

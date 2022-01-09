package com.bibu.service.impl;

import com.bibu.entity.Address;
import com.bibu.dao.AddressDao;
import com.bibu.service.AddressService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 地区表(Address)表服务实现类
 *
 * @author WeitJack
 * @since 2022-01-03 16:07:53
 */
@Service("addressService")
public class AddressServiceImpl implements AddressService {
    @Resource
    private AddressDao addressDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Address queryById(Integer id) {
        return this.addressDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param address     筛选条件
     * @return 查询结果
     */
    @Override
    public PageInfo<Address> queryByPage(Address address) {
        PageHelper.startPage(address.getPageNum(),address.getPageSize(), address.getSortField());
        List<Address> models = this.addressDao.queryAllByLimit(address);
        PageInfo<Address> pageInfo = new PageInfo<>(models);
        return pageInfo;
    }

    /**
     * 新增数据
     *
     * @param address 实例对象
     * @return 实例对象
     */
    @Override
    public Address insert(Address address) {
        this.addressDao.insert(address);
        return address;
    }

    /**
     * 修改数据
     *
     * @param address 实例对象
     * @return 实例对象
     */
    @Override
    public Address update(Address address) {
        this.addressDao.update(address);
        return this.queryById(address.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.addressDao.deleteById(id) > 0;
    }
}

package com.bibu.service.impl;

import com.bibu.entity.Hospital;
import com.bibu.dao.HospitalDao;
import com.bibu.service.HospitalService;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.List;

import javax.annotation.Resource;

/**
 * 医院表(Hospital)表服务实现类
 *
 * @author WeitJack
 * @since 2022-01-24 21:34:28
 */
@Service("hospitalService")
public class HospitalServiceImpl implements HospitalService {
    @Resource
    private HospitalDao hospitalDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Hospital queryById(Integer id) {
        return this.hospitalDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param hospital 筛选条件
     * @return 查询结果
     */
    @Override
    public PageInfo<Hospital> queryByPage(Hospital hospital) {
        PageHelper.startPage(hospital.getPageNum(), hospital.getPageSize(), hospital.getSortField());
        List<Hospital> models = this.hospitalDao.queryAllByLimit(hospital);
        PageInfo<Hospital> pageInfo = new PageInfo<>(models);
        return pageInfo;
    }

    /**
     * 新增数据
     *
     * @param hospital 实例对象
     * @return 实例对象
     */
    @Override
    public Hospital insert(Hospital hospital) {
        this.hospitalDao.insert(hospital);
        return hospital;
    }

    /**
     * 修改数据
     *
     * @param hospital 实例对象
     * @return 实例对象
     */
    @Override
    public Hospital update(Hospital hospital) {
        this.hospitalDao.update(hospital);
        return this.queryById(hospital.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.hospitalDao.deleteById(id) > 0;
    }
}

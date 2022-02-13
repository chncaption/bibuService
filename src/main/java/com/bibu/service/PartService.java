package com.bibu.service;

import com.bibu.entity.Part;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 网站栏目表(Part)表服务接口
 *
 * @author WeitJack
 * @since 2022-01-15 12:38:22
 */
public interface PartService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Part queryById(Integer id);

    /**
     * 分页查询
     *
     * @param part 筛选条件
     * @return 查询结果
     */
    PageInfo<Part> queryByPage(Part part);

    /**
     * 获取所有part
     *
     * @param part 筛选条件
     * @return 查询结果
     */
    List<Part> getPartList(Part part);

    /**
     * 新增数据
     *
     * @param part 实例对象
     * @return 实例对象
     */
    Part insert(Part part);

    /**
     * 修改数据
     *
     * @param part 实例对象
     * @return 实例对象
     */
    Part update(Part part);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}

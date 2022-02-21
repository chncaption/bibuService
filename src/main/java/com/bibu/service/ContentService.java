package com.bibu.service;

import com.bibu.entity.Content;
import com.github.pagehelper.PageInfo;

/**
 * 内容表(Content)表服务接口
 *
 * @author WeitJack
 * @since 2022-02-21 22:09:10
 */
public interface ContentService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Content queryById(Integer id);

    /**
     * 分页查询
     *
     * @param content 筛选条件
     * @return 查询结果
     */
    PageInfo<Content> queryByPage(Content content);

    /**
     * 新增数据
     *
     * @param content 实例对象
     * @return 实例对象
     */
    Content insert(Content content);

    /**
     * 修改数据
     *
     * @param content 实例对象
     * @return 实例对象
     */
    Content update(Content content);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}

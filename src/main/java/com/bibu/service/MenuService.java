package com.bibu.service;

import com.bibu.entity.Menu;
import com.github.pagehelper.PageInfo;

/**
 * 网站导航表(Menu)表服务接口
 *
 * @author WeitJack
 * @since 2022-03-15 14:02:05
 */
public interface MenuService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Menu queryById(Integer id);

    /**
     * 分页查询
     *
     * @param menu 筛选条件
     * @return 查询结果
     */
    PageInfo<Menu> queryByPage(Menu menu);

    /**
     * 新增数据
     *
     * @param menu 实例对象
     * @return 实例对象
     */
    Menu insert(Menu menu);

    /**
     * 修改数据
     *
     * @param menu 实例对象
     * @return 实例对象
     */
    Menu update(Menu menu);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}

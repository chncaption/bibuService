package com.bibu.service.impl;

import com.bibu.entity.Menu;
import com.bibu.dao.MenuDao;
import com.bibu.service.MenuService;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.util.List;

import javax.annotation.Resource;

/**
 * 网站导航表(Menu)表服务实现类
 *
 * @author WeitJack
 * @since 2022-03-15 14:02:05
 */
@Service("menuService")
public class MenuServiceImpl implements MenuService {
    @Resource
    private MenuDao menuDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Menu queryById(Integer id) {
        return this.menuDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param menu 筛选条件
     * @return 查询结果
     */
    @Override
    public List<Menu> queryByPage(Menu menu) {
        return this.menuDao.queryAllByLimit(menu);
    }

    /**
     * 新增数据
     *
     * @param menu 实例对象
     * @return 实例对象
     */
    @Override
    public Menu insert(Menu menu) {
        this.menuDao.insert(menu);
        return menu;
    }

    /**
     * 修改数据
     *
     * @param menu 实例对象
     * @return 实例对象
     */
    @Override
    public Menu update(Menu menu) {
        this.menuDao.update(menu);
        return this.queryById(menu.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.menuDao.deleteById(id) > 0;
    }
}

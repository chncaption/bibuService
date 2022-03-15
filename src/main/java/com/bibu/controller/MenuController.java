package com.bibu.controller;

import com.bibu.entity.Menu;
import com.bibu.service.MenuService;
import com.github.pagehelper.PageInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 网站导航表(Menu)表控制层
 *
 * @author WeitJack
 * @since 2022-03-15 14:02:04
 */
@RestController
@RequestMapping("api/menu")
public class MenuController {
    /**
     * 服务对象
     */
    @Resource
    private MenuService menuService;

    /**
     * 分页查询
     *
     * @param menu 筛选条件
     * @return 查询结果
     */
    @PostMapping("list")
    public ResponseEntity<PageInfo<Menu>> queryByPage(@RequestBody Menu menu) {
        return ResponseEntity.ok(this.menuService.queryByPage(menu));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("get/{id}")
    public ResponseEntity<Menu> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.menuService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param menu 实体
     * @return 新增结果
     */
    @PostMapping("add")
    public ResponseEntity<Menu> add(@RequestBody Menu menu) {
        return ResponseEntity.ok(this.menuService.insert(menu));
    }

    /**
     * 编辑数据
     *
     * @param menu 实体
     * @return 编辑结果
     */
    @PostMapping("edit")
    public ResponseEntity<Menu> edit(@RequestBody Menu menu) {
        return ResponseEntity.ok(this.menuService.update(menu));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @GetMapping("delete/{id}")
    public ResponseEntity<Boolean> deleteById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.menuService.deleteById(id));
    }

}


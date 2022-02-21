package com.bibu.controller;

import com.bibu.entity.Content;
import com.bibu.service.ContentService;
import com.github.pagehelper.PageInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 内容表(Content)表控制层
 *
 * @author WeitJack
 * @since 2022-02-21 22:09:08
 */
@RestController
@RequestMapping("api/content")
public class ContentController {
    /**
     * 服务对象
     */
    @Resource
    private ContentService contentService;

    /**
     * 分页查询
     *
     * @param content 筛选条件
     * @return 查询结果
     */
    @PostMapping("list")
    public ResponseEntity<PageInfo<Content>> queryByPage(@RequestBody Content content) {
        return ResponseEntity.ok(this.contentService.queryByPage(content));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("get/{id}")
    public ResponseEntity<Content> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.contentService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param content 实体
     * @return 新增结果
     */
    @PostMapping("add")
    public ResponseEntity<Content> add(@RequestBody Content content) {
        return ResponseEntity.ok(this.contentService.insert(content));
    }

    /**
     * 编辑数据
     *
     * @param content 实体
     * @return 编辑结果
     */
    @PostMapping("edit")
    public ResponseEntity<Content> edit(@RequestBody Content content) {
        return ResponseEntity.ok(this.contentService.update(content));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @GetMapping("delete/{id}")
    public ResponseEntity<Boolean> deleteById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.contentService.deleteById(id));
    }

}


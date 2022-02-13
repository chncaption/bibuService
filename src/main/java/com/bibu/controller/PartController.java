package com.bibu.controller;

import com.bibu.entity.Part;
import com.bibu.service.PartService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 网站栏目表(Part)表控制层
 *
 * @author WeitJack
 * @since 2022-01-15 12:38:20
 */
@RestController
@RequestMapping("api/part")
public class PartController {
    /**
     * 服务对象
     */
    @Resource
    private PartService partService;

    /**
     * 获取所有part
     *
     * @param part 筛选条件
     * @return 查询结果
     */
    @PostMapping("list")
    public ResponseEntity<List<Part>> getPartList(@RequestBody Part part) {
        return ResponseEntity.ok(this.partService.getPartList(part));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("get/{id}")
    public ResponseEntity<Part> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.partService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param part 实体
     * @return 新增结果
     */
    @PostMapping("add")
    public ResponseEntity<Part> add(@RequestBody Part part) {
        return ResponseEntity.ok(this.partService.insert(part));
    }

    /**
     * 编辑数据
     *
     * @param part 实体
     * @return 编辑结果
     */
    @PostMapping("edit")
    public ResponseEntity<Part> edit(@RequestBody Part part) {
        return ResponseEntity.ok(this.partService.update(part));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @GetMapping("delete/{id}")
    public ResponseEntity<Boolean> deleteById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.partService.deleteById(id));
    }

}


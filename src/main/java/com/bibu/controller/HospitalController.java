package com.bibu.controller;

import com.bibu.entity.Hospital;
import com.bibu.service.HospitalService;
import com.github.pagehelper.PageInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 医院表(Hospital)表控制层
 *
 * @author WeitJack
 * @since 2022-01-09 23:15:17
 */
@RestController
@RequestMapping("api/hospital")
public class HospitalController {
    /**
     * 服务对象
     */
    @Resource
    private HospitalService hospitalService;

    /**
     * 分页查询
     *
     * @param hospital 筛选条件
     * @return 查询结果
     */
    @PostMapping("list")
    public ResponseEntity<PageInfo<Hospital>> queryByPage(@RequestBody Hospital hospital) {
        return ResponseEntity.ok(this.hospitalService.queryByPage(hospital));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("get/{id}")
    public ResponseEntity<Hospital> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.hospitalService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param hospital 实体
     * @return 新增结果
     */
    @PostMapping("add")
    public ResponseEntity<Hospital> add(@RequestBody Hospital hospital) {
        return ResponseEntity.ok(this.hospitalService.insert(hospital));
    }

    /**
     * 编辑数据
     *
     * @param hospital 实体
     * @return 编辑结果
     */
    @PostMapping("edit")
    public ResponseEntity<Hospital> edit(@RequestBody Hospital hospital) {
        return ResponseEntity.ok(this.hospitalService.update(hospital));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @GetMapping("delete/{id}")
    public ResponseEntity<Boolean> deleteById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.hospitalService.deleteById(id));
    }

}


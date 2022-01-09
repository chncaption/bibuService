package com.bibu.controller;

import com.bibu.entity.Address;
import com.bibu.service.AddressService;
import com.github.pagehelper.PageInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 地区表(Address)表控制层
 *
 * @author WeitJack
 * @since 2022-01-03 16:07:52
 */
@RestController
@RequestMapping("api/address")
public class AddressController {
    /**
     * 服务对象
     */
    @Resource
    private AddressService addressService;

    /**
     * 分页查询
     *
     * @param address     筛选条件
     * @return 查询结果
     */
    @PostMapping("list")  //pageNum,pageSize,sortField
    public ResponseEntity<PageInfo<Address>> queryByPage(@RequestBody Address address) {
        return ResponseEntity.ok(this.addressService.queryByPage(address));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("get/{id}")
    public ResponseEntity<Address> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.addressService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param address 实体
     * @return 新增结果
     */
    @PostMapping("add")
    public ResponseEntity<Address> add(@RequestBody Address address) {
        return ResponseEntity.ok(this.addressService.insert(address));
    }

    /**
     * 编辑数据
     *
     * @param address 实体
     * @return 编辑结果
     */
    @PostMapping("edit")
    public ResponseEntity<Address> edit(@RequestBody Address address) {
        return ResponseEntity.ok(this.addressService.update(address));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @GetMapping("delete/{id}")
    public ResponseEntity<Boolean> deleteById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.addressService.deleteById(id));
    }

}


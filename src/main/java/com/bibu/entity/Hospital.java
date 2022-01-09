package com.bibu.entity;

import com.bibu.bean.PageBean;
import java.io.Serializable;

/**
 * 医院表(Hospital)实体类
 *
 * @author WeitJack
 * @since 2022-01-09 23:15:17
 */
public class Hospital extends PageBean implements Serializable {
    private static final long serialVersionUID = -87601572068454417L;
    /**
     * id
     */
    private Integer id;
    /**
     * 医院名称
     */
    private String name;
    /**
     * 地址id
     */
    private Integer addressId;
    /**
     * 状态
     */
    private Integer status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}


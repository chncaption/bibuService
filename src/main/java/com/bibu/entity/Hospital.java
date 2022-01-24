package com.bibu.entity;

import com.bibu.bean.PageBean;

import java.io.Serializable;

/**
 * 医院表(Hospital)实体类
 *
 * @author WeitJack
 * @since 2022-01-24 21:34:23
 */
public class Hospital extends PageBean implements Serializable {
    private static final long serialVersionUID = -71910842523398734L;
    /**
     * id
     */
    private Integer id;
    /**
     * 医院名称
     */
    private String name;
    /**
     * 栏目id
     */
    private Integer partId;
    /**
     * 地址id
     */
    private Integer addressId;
    /**
     * 省份code
     */
    private String provincialCode;
    /**
     * 省份名称
     */
    private String provincialName;
    /**
     * 城市code
     */
    private String cityCode;
    /**
     * 城市名称
     */
    private String cityName;
    /**
     * 区域code
     */
    private String areaCode;
    /**
     * 区域名称
     */
    private String areaName;
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

    public Integer getPartId() {
        return partId;
    }

    public void setPartId(Integer partId) {
        this.partId = partId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getProvincialCode() {
        return provincialCode;
    }

    public void setProvincialCode(String provincialCode) {
        this.provincialCode = provincialCode;
    }

    public String getProvincialName() {
        return provincialName;
    }

    public void setProvincialName(String provincialName) {
        this.provincialName = provincialName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}


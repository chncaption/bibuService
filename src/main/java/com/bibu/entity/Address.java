package com.bibu.entity;

import com.bibu.bean.PageBean;

import java.io.Serializable;

/**
 * 地区表(Address)实体类
 *
 * @author WeitJack
 * @since 2022-01-03 16:07:52
 */
public class Address extends PageBean implements Serializable {
    private static final long serialVersionUID = 504671077440170071L;
    /**
     * id
     */
    private Integer id;
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
     * 是否为热点地区
     */
    private Integer isHot;
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

    public Integer getIsHot() {
        return isHot;
    }

    public void setIsHot(Integer isHot) {
        this.isHot = isHot;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}


package com.bibu.entity;

import com.bibu.bean.PageBean;
import java.io.Serializable;

/**
 * 网站导航表(Menu)实体类
 *
 * @author WeitJack
 * @since 2022-03-15 14:02:04
 */
public class Menu extends PageBean implements Serializable {
    private static final long serialVersionUID = 380927405710171956L;
    /**
     * id
     */
    private Integer id;
    /**
     * 导航名称
     */
    private String name;
    /**
     * 栏目id
     */
    private Integer partId;
    /**
     * 副标题
     */
    private String subtitle;
    /**
     * 模块名称
     */
    private String modelName;
    /**
     * 链接url
     */
    private String url;
    /**
     * 打开类型(1:当前窗体打开、2：新窗体打开)
     */
    private Integer openType;
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

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getOpenType() {
        return openType;
    }

    public void setOpenType(Integer openType) {
        this.openType = openType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}


package com.bibu.entity;

import com.bibu.bean.PageBean;

import java.io.Serializable;
import java.util.List;

/**
 * 网站栏目表(Part)实体类
 *
 * @author WeitJack
 * @since 2022-01-15 12:38:21
 */
public class Part extends PageBean implements Serializable {
    private static final long serialVersionUID = 804349603297819567L;
    /**
     * id
     */
    private Integer id;
    /**
     * 地址id
     */
    private Integer addressId;
    /**
     * 栏目名称
     */
    private String name;
    /**
     * 副标题
     */
    private String subtitle;
    /**
     * 栏目路径
     */
    private String url;
    /**
     * 关联链接
     */
    private String link;
    /**
     * 自定义图标url
     */
    private String iconUrl;
    /**
     * 图片url
     */
    private String pictureUrl;
    /**
     * 父栏目id
     */
    private Integer parentId;
    /**
     * 模版类型
     */
    private Integer modelType;
    /**
     * 内容模版id
     */
    private Integer modelId;
    /**
     * 推荐位id
     */
    private Integer recommendPlateId;
    /**
     * pc分页数
     */
    private Integer pcPage;
    /**
     * 移动分页数
     */
    private Integer mobilePage;
    /**
     * pc简介
     */
    private String pcDesc;
    /**
     * 移动简介
     */
    private String mobileDesc;
    /**
     * 提示
     */
    private String tip;
    /**
     * 标题
     */
    private String title;
    /**
     * 关键字
     */
    private String keyword;
    /**
     * 描述
     */
    private String decs;
    /**
     * 状态
     */
    private Integer status;


    /**
     * 子节点
     */
    private List<Part> children;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getModelType() {
        return modelType;
    }

    public void setModelType(Integer modelType) {
        this.modelType = modelType;
    }

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public Integer getRecommendPlateId() {
        return recommendPlateId;
    }

    public void setRecommendPlateId(Integer recommendPlateId) {
        this.recommendPlateId = recommendPlateId;
    }

    public Integer getPcPage() {
        return pcPage;
    }

    public void setPcPage(Integer pcPage) {
        this.pcPage = pcPage;
    }

    public Integer getMobilePage() {
        return mobilePage;
    }

    public void setMobilePage(Integer mobilePage) {
        this.mobilePage = mobilePage;
    }

    public String getPcDesc() {
        return pcDesc;
    }

    public void setPcDesc(String pcDesc) {
        this.pcDesc = pcDesc;
    }

    public String getMobileDesc() {
        return mobileDesc;
    }

    public void setMobileDesc(String mobileDesc) {
        this.mobileDesc = mobileDesc;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getDecs() {
        return decs;
    }

    public void setDecs(String decs) {
        this.decs = decs;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<Part> getChildren() {
        return children;
    }

    public void setChildren(List<Part> children) {
        this.children = children;
    }
}


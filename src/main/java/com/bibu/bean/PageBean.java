package com.bibu.bean;

import com.alibaba.fastjson.annotation.JSONField;

public class PageBean {
    @JSONField(serialize = false)
    private int pageNum;
    @JSONField(serialize = false)
    private int pageSize;
    @JSONField(serialize = false)
    private String sortField;

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getSortField() {
        return sortField;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }
}

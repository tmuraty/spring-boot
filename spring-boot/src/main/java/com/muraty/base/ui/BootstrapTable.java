package com.muraty.base.ui;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.io.Serializable;
import java.util.List;

/**
 * bootstrap-table  分页基础实体
 */
public class BootstrapTable implements Serializable {

    private static final Logger log = LoggerFactory.getLogger(BootstrapTable.class);

    private Long total = 0L; // 总条数
    private Integer limit; // 当前数
    private Integer offset; // 步长
    private String order; // 排序
    private String search; // 搜索关键字
    private List rows; // 分页列

    public BootstrapTable(){}

    public BootstrapTable(Long total, List rows) {
        this.total = total;
        this.rows = rows;
    }

    public Long getTotal() {return total;}
    public void setTotal(Long total) {this.total = total;}

    public Integer getLimit() {return limit;}
    public void setLimit(Integer limit) {this.limit = limit;}

    public Integer getOffset() {return offset;}
    public void setOffset(Integer offset) {this.offset = offset;}

    public String getOrder() {return order;}
    public void setOrder(String order) {this.order = order;}

    public String getSearch() {return search;}
    public void setSearch(String search) {this.search = search;}

    public List getRows() {return rows;}
    public void setRows(List rows) {this.rows = rows;}


    /**
     * 前端分页实体转换成jpa查询分页实体
     */
    public Pageable pageable() {
        return pageable(null);
    }

    public Pageable pageable(Sort sort) {

        Integer limit = this.limit;
        Integer offset = this.offset;
        log.debug("limit = {} , offset = {}", limit, offset);

        Integer size = this.limit;
        Integer page = offset / limit;
        log.debug("size = {} , page = {}", size, page);

        if (sort != null)
            return new PageRequest(page, size, sort);
        else
            return new PageRequest(page, size);
    }

    /**
     * jpa查询的分页数据转换成前端json数据
     */
    public void viewPage(Page page) {
        // 获得spring Page 的数据项
        Long total = page.getTotalElements();
        Integer limit = page.getSize();
        Integer offset = page.getNumberOfElements();
        List rows = page.getContent();

        // 设置 bootstrap-table 适配的数据项
        this.total = total;
        this.limit = limit;
        this.offset = offset;
        this.rows = rows ;

        log.debug("limit = {} , offset ={} , total = {} ,rows = {} ", limit, offset, total, rows);

    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BootstrapTable bootstrapTable = (BootstrapTable) o;

        if (!limit.equals(bootstrapTable.limit)) return false;
        if (!offset.equals(bootstrapTable.offset)) return false;
        if (!order.equals(bootstrapTable.order)) return false;
        if (!rows.equals(bootstrapTable.rows)) return false;
        if (!search.equals(bootstrapTable.search)) return false;
        if (!total.equals(bootstrapTable.total)) return false;

        return true;
    }

    public int hashCode() {
        int result = total.hashCode();
        result = 31 * result + limit.hashCode();
        result = 31 * result + offset.hashCode();
        result = 31 * result + order.hashCode();
        result = 31 * result + search.hashCode();
        result = 31 * result + rows.hashCode();
        return result;
    }
}
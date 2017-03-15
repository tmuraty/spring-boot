package com.muraty.base.ui;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.io.Serializable;
import java.util.List;

/**
 * bootstrap-table  分页基础实体
 *
 * @author muraty
 */
public class BootstrapTable implements Serializable {

    private Long total = 0L; // 总条数
    private Integer limit; // 当前数
    private Integer offset; // 步长
    private String order; // 排序
    private String search; // 搜索关键字
    private List rows; // 分页列

    public BootstrapTable(){}

    public BootstrapTable(Long total, Integer limit, Integer offset, List rows) {
        this.total = total;
        this.limit = limit;
        this.offset = offset;
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
        Integer page = this.offset / this.limit;
        return new PageRequest(
                page,       // page
                this.limit  // size
        );
    }

    /**
     * 前端分页实体转换成jpa查询分页实体 排序
     */
    public Pageable pageable(Sort sort) {
        Integer page = this.offset / this.limit;
        return new PageRequest(
                page,       // page
                this.limit, // size
                sort        // 排序
        );
    }

    /**
     * jpa查询的分页数据转换成前端json数据
     */
    public static BootstrapTable goBack(Page page) {
        return new BootstrapTable(
                page.getTotalElements(),    // total
                page.getSize(),             // limit
                page.getNumberOfElements(), // offset
                page.getContent()           // rows
        );
    }

}
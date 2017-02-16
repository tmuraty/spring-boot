package com.muraty.component.base.entity;


import com.muraty.base.ssh.IEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 基础数据表
 */
@Entity
@Table(name = "tr_base_code")
public class BaseCode extends IEntity {

    private String codeRule;    // 编码标准
    private String coding;      // 编码
    private String codeMean;    // 编码中文含义
    private String isShow;      // 是否属于缓存数据
    private String pyShort;     // 编码中文含义拼音简写

    public BaseCode() {}

    @Column(length = 50)
    public String getCodeRule() {return codeRule;}
    public void setCodeRule(String codeRule) {this.codeRule = codeRule;}

    @Column(length = 50)
    public String getCoding() {return coding;}
    public void setCoding(String coding) {this.coding = coding;}

    @Column(length = 200)
    public String getCodeMean() {return codeMean;}
    public void setCodeMean(String codeMean) {this.codeMean = codeMean;}

    @Column(length = 1)
    public String getIsShow() {return isShow;}
    public void setIsShow(String isShow) {this.isShow = isShow;}

    @Column(length = 50)
    public String getPyShort() {return pyShort;}
    public void setPyShort(String pyShort) {this.pyShort = pyShort;}

}

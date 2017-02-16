package com.muraty.base.ui;

import java.io.Serializable;
import java.util.List;

/**
 * select2 组件基础实体
 *
 * @author muraty
 */
public class Select2 implements Serializable {

    private String id;              // 下拉选项对应的 value
    private String text;            // 下拉选项显示的内容

    public Select2() {}

    public Select2(String id, String text) {
        this.id = id;
        this.text = text;
    }

    public String getId() {return id;}
    public void setId(String id) {this.id = id;}

    public String getText() {return text;}
    public void setText(String text) {this.text = text;}

}

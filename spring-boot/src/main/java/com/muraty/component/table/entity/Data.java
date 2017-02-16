package com.muraty.component.table.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.muraty.base.tools.JsonUtil;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 分页测试数据
 */
public class Data {

    private Long data1;
    private Double data2;
    private String data3;
    private Boolean data4;
    private Date data5;
    private Date data6;

    public Data() {}

    public Data(Long data1, Double data2, String data3, Boolean data4, Date data5, Date data6) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
        this.data4 = data4;
        this.data5 = data5;
        this.data6 = data6;
    }

    public Long getData1() {return data1;}
    public void setData1(Long data1) {this.data1 = data1;}

    public Double getData2() {return data2;}
    public void setData2(Double data2) {this.data2 = data2;}

    public String getData3() {return data3;}
    public void setData3(String data3) {this.data3 = data3;}

    public Boolean getData4() {return data4;}
    public void setData4(Boolean data4) {this.data4 = data4;}

    @DateTimeFormat(pattern="yyyy-MM-dd")
    public Date getData5() {return data5;}
    public void setData5(Date data5) {this.data5 = data5;}

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    public Date getData6() {return data6;}
    public void setData6(Date data6) {this.data6 = data6;}

    public String toString() {
        return JsonUtil.toJson(this);
    }
}

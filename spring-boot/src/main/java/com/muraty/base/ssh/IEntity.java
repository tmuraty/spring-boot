package com.muraty.base.ssh;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.muraty.base.tools.JsonUtil;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *  抽象出一个共有的实体
 *  因为主键是32位随机主键,无法辨别数据插入先后,所以加入[数据插入时间]字段
 *
 *  {@link IDao} 绑定了主键为string
 *  {@link IService} 设置查询排序条件按照 insertTime 数据插入时间
 *
 *  请所有的数据实体继承该对象
 *
 *  @author muraty
 */
@MappedSuperclass
public class IEntity implements Serializable {

    private String id;
    private Date insertTime;

    /**
     * 生成 32 位 由hibernate 产生的主键
     */
    @Id
    @GeneratedValue(generator = "idGenerator") // 主键产生器(hibernate自带)
    @GenericGenerator(name = "idGenerator", strategy = "uuid") // 与上面要对应
    @Column(nullable=false ,unique=true ,length = 32) // 不为空, 唯一, 长度32位
    public String getId() {return id;}
    public void setId(String id) {this.id = id;}

    /**
     * 数据插入时间
     */
    @Column(updatable = false) // 字段锁.产生数据后,不能被更新
    @CreationTimestamp // 插入数据的时候生成时间
    @Temporal(TemporalType.TIMESTAMP) // 时间格式 精确到秒
    public Date getInsertTime() {return insertTime;}
    public void setInsertTime(Date insertTime) {this.insertTime = insertTime;}

    public String toString(){
        return JsonUtil.toJson(this);
    }
}
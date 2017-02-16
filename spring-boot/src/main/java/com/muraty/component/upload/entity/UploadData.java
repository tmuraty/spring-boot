package com.muraty.component.upload.entity;


import com.muraty.base.ssh.IEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *  文件上传数据保存
 */
@Entity
@Table(name = "tr_upload_data")
public class UploadData extends IEntity{

    private String oldName;         // 传入前文件名
    private String newName;         // 保存入库文件名
    private Long size;              // 保存入库文件大小
    private String filePrefix;      // 后缀
    private String pathUrl;         // 存入位置
    private String extraId;         // 外键

    public UploadData() {}

    @Column(length = 50)
    public String getOldName() {return oldName;}
    public void setOldName(String oldName) {this.oldName = oldName;}

    @Column(length = 50)
    public String getNewName() {return newName;}
    public void setNewName(String newName) {this.newName = newName;}

    @Column(length = 10)
    public Long getSize() {return size;}
    public void setSize(Long size) {this.size = size;}

    @Column(length = 10)
    public String getFilePrefix() {return filePrefix;}
    public void setFilePrefix(String filePrefix) {this.filePrefix = filePrefix;}

    @Column(length = 50)
    public String getPathUrl() {return pathUrl;}
    public void setPathUrl(String pathUrl) {this.pathUrl = pathUrl;}

    @Column(length = 32)
    public String getExtraId() {return extraId;}
    public void setExtraId(String extraId) {this.extraId = extraId;}


}

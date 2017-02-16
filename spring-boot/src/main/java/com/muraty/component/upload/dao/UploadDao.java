package com.muraty.component.upload.dao;

import com.muraty.base.ssh.IDao;
import com.muraty.component.upload.entity.UploadData;

import java.util.List;

public interface UploadDao extends IDao<UploadData> {

    List<UploadData> findByExtraId(String extraId);

}
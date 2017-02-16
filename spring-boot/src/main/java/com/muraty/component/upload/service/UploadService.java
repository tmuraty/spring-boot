package com.muraty.component.upload.service;

import com.muraty.base.ssh.IDao;
import com.muraty.base.ssh.IService;
import com.muraty.base.ui.FileInput;
import com.muraty.component.upload.dao.UploadDao;
import com.muraty.component.upload.entity.UploadData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 *
 */
@Service
public class UploadService extends IService<UploadData> {

    @Autowired private UploadDao uploadDao;
    @Value("${i.upload.path}") private String uploadPath;

    public IDao<UploadData> dao() {
        return uploadDao;
    }

    public FileInput findByExtraId(HttpServletRequest request, String extraId) {
        // 获得项目上传根目录
        String rootPath = request.getServletContext().getRealPath(uploadPath);

        // 查询 外键为 extraId 的所有 上传文件数据
        List<UploadData> data = uploadDao.findByExtraId(extraId);

        String contextPath = request.getContextPath();

        FileInput fileInput = new FileInput();

        for (UploadData datum : data) {
            // 上传文件位置
            String uploadUrl = contextPath + uploadPath + datum.getPathUrl() + datum.getNewName() + '.' + datum.getFilePrefix();
            fileInput.add(uploadUrl);

            FileInput.PreviewConfig config = new FileInput.PreviewConfig();
            config.setUrl(contextPath + "/upload/data/d/" + datum.getId());
            config.setKey(datum.getId());
            config.setSize(datum.getSize());
            config.setCaption(datum.getOldName());
            fileInput.add(config);

        }

        return fileInput;
    }


}

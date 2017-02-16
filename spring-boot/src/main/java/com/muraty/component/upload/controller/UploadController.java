package com.muraty.component.upload.controller;

import com.muraty.base.ILog;
import com.muraty.base.ui.FileInput;
import com.muraty.component.upload.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 上传插件
 *
 * @author muraty
 */
@Controller
@RequestMapping("upload")
public class UploadController extends ILog{

    @Autowired
    private UploadService uploadService;

    @RequestMapping("/{page}")
    String index(@PathVariable("page") String page) {
        return "component/upload/" + page;
    }


    /**
     * 从数据库获得数据
     */
    @RequestMapping("/data/db1")
    @ResponseBody
    FileInput db1(HttpServletRequest request, String extraId) {
        return uploadService.findByExtraId(request, extraId);
    }

    /**
     * 从数据库获得数据
     */
    @RequestMapping("/data/d/{id}")
    @ResponseBody
    String db1(@PathVariable("id")String id) {
        log.debug(" file id is {} delete success!!! ",id);
        return "{\"msg\": \"success\"}";
    }

}

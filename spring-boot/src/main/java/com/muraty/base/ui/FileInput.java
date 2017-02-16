package com.muraty.base.ui;

import java.util.ArrayList;
import java.util.List;

/**
 * Bootstrap file-input 上传下载控件
 *
 * @author muraty
 */
public class FileInput {

    private List<String> initialPreview = new ArrayList<>();
    private List<PreviewConfig> initialPreviewConfig = new ArrayList<>();

    public FileInput() {}

    public FileInput(List<String> initialPreview, List<PreviewConfig> initialPreviewConfig) {
        this.initialPreview = initialPreview;
        this.initialPreviewConfig = initialPreviewConfig;
    }

    public List<String> getInitialPreview() {return initialPreview;}
    public void setInitialPreview(List<String> initialPreview) {this.initialPreview = initialPreview;}

    public List<PreviewConfig> getInitialPreviewConfig() {return initialPreviewConfig;}
    public void setInitialPreviewConfig(List<PreviewConfig> initialPreviewConfig) {this.initialPreviewConfig = initialPreviewConfig;}


    public void add(String preview){
        initialPreview.add(preview);
    }

    public void add(PreviewConfig config){
        initialPreviewConfig.add(config);
    }

    public static class PreviewConfig{

        private String key;// 主键
        private String caption; // 原图名
        private Long size; // 图片大小
        private String url; // 删除路径

        public String getKey() {return key;}
        public void setKey(String key) {this.key = key;}

        public String getCaption() {return caption;}
        public void setCaption(String caption) {this.caption = caption;}

        public Long getSize() {return size;}
        public void setSize(Long size) {this.size = size;}

        public String getUrl() {return url;}
        public void setUrl(String url) {this.url = url;}
    }


}

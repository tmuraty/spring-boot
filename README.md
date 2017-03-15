spring-boot + admin-lte 脚手架
====================
## 前端
前端采用的是 admin-LTE 模版

核心组件 :
* [jquery](http://jquery.com/)
*不用说,都懂~*
* [bootstrap](http://v3.bootcss.com/)
*产自Twitter，是目前很受欢迎的前端框架*
* [admin-LTE](https://almsaeedstudio.com/themes/AdminLTE/index.html) 
*一套完整的布局框架*

第三方组件 :
* fontawesome , ionicons 字体,图标
* respond , html5shiv ie兼容

采用前端插件包含 :

**国内**
* [bootstrap-table](http://bootstrap-table.wenzhixin.net.cn/zh-cn/)
*用来做分页处理*
* [zTree](http://www.treejs.cn/v3/main.php#_zTreeInfo)
*树插件*
* [layer](http://layer.layui.com/)
*国产的部分ui*

**国外**
* [Chart.js](http://www.chartjs.org/docs/)
*一款做图表的插件*
* [bootstrap-datepicker](http://bootstrap-datepicker.readthedocs.io/en/latest/)
*日期控件*
* [bootstrap-datetimepicker](http://www.bootcss.com/p/bootstrap-datetimepicker/)
*日期+时间控件 是datepicker的升级版*
* [moment](http://momentjs.com/)
*时间控件依赖插件*
* [fastclick](http://www.bootcdn.cn/fastclick/readme/)
*快速响应*
* [x-editable](http://vitalets.github.io/x-editable/index.html)
*结合bootstrap-table做的表单编辑插件(整合的插件属于国外)*
* [bootstrap-file-input](http://plugins.krajee.com/file-input)
*上传插件*
* [iCheck](http://icheck.fronteed.com/)
*美化radio checkbox样式*
* [pace](http://github.hubspot.com/pace/)
*页面加载*
* [select2](https://select2.github.io/)
*select下拉选项控件*
* [validator](http://formvalidation.io/)
*表单验证控件*

## 截图
*布局*
![Screenshot admin-LTE](/images/navigation.png) 

*表格分页和编辑(bootstrap-table+x-editable)*
![Screenshot bootstrap-table](/images/bootstrap-table.png)

*树*
![Screenshot zTree](/images/zTree.png)

*主要使用 layer.msg 防止alert线程锁死*
![Screenshot layer](/images/layer.png)

*表格分析等*
![Screenshot Chart.js](/images/chart.js.png)

*时间控件*
![Screenshot bootstrap-datepicker](/images/bootstrap-datepicker.png)

*上传插件*
![Screenshot file-input](/images/file-input.png)

*radio checkbox美化*
![Screenshot iCheck](/images/iCheck.png)

*页面进入是的加载条*
![Screenshot pace](/images/pace.png)

*下拉框控件*
![Screenshot select2](/images/select2.png)

*表单验证*
![Screenshot validator](/images/validator.png)

## 配置
* xml:
```xml
<body>
    <xml>配置</xml>
    <content>内容</content>
</body>
```
* shell:
```shell
mvn clean package
```

## 交流和讨论
欢迎来我的[博客](http://blog.csdn.net/muraty)
http://blog.csdn.net/muraty 进行讨论
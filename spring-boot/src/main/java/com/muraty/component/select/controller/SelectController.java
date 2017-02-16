package com.muraty.component.select.controller;

import com.muraty.base.ui.Select2;
import com.muraty.component.select.service.SelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * select插件(select2)
 *
 * @author muraty
 */
@Controller
@RequestMapping("select")
public class SelectController {

    @Autowired private SelectService selectService;

    @RequestMapping("/{page}")
    String index(@PathVariable("page") String page) {
        return "component/select/" + page;
    }

    /**
     * 获得json数据
     */
    @RequestMapping("/data/s1")
    @ResponseBody
    List<Select2> t1() {
        List<Select2> list = new ArrayList<Select2>(3);

        list.add(new Select2("430000","湖南省"));
        list.add(new Select2("430100","长沙市"));
        list.add(new Select2("430102","芙蓉区"));

        return list;
    }


    /**
     * 从数据库获得数据
     */
    @RequestMapping("/data/db1")
    @ResponseBody
    List<Select2> db1() {
        return selectService.findAllSelect();
    }

    /**
     * 从数据库获得数据
     */
    @RequestMapping("/data/db2")
    @ResponseBody
    List<Select2> db2() {
        return selectService.findByCodeRule("AREA");
    }

    /**
     * 从数据库获得数据
     */
    @RequestMapping("/data/db3")
    @ResponseBody
    List<Select2> db3(@RequestParam("term")String pyShort) {
        return selectService.findByCodeRuleAndPyShortLike("AREA",pyShort);
    }

}

package com.muraty.component.form.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 表单验证(bootstrapValidator)
 *
 * @author muraty
 */
@Controller
@RequestMapping("form")
public class FormController {

    @RequestMapping("/{page}")
    String index(@PathVariable("page")String page){
        return "component/form/" + page;
    }



}

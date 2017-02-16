package com.muraty.component.tabs.controller;

import com.muraty.base.ILog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author muraty
 */
@Controller
@RequestMapping("tabs")
public class TabsController extends ILog{

    @RequestMapping("/{page}")
    String index(@PathVariable("page")String page){
        return "component/tabs/" + page;
    }

}

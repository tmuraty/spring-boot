package com.muraty.component.table.controller;

import com.muraty.base.ILog;
import com.muraty.base.ui.BootstrapTable;
import com.muraty.component.table.entity.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author muraty
 */
@Controller
@RequestMapping("table")
public class TableController extends ILog{

    @RequestMapping("/{page}")
    String index(@PathVariable("page")String page){
        return "component/table/" + page;
    }

    @RequestMapping("/data/t1")
    @ResponseBody
    BootstrapTable t1(){
        List<Data> list = new ArrayList<> (2);

        list.add(new Data(111L,111.1D,"string",true,new Date(),new Date()));
        list.add(new Data(222L,222.2D,"中文哦",false,new Date(),new Date()));
        list.add(new Data(333L,333.3D,"①Ⅱ叄",false,new Date(),new Date()));

        log.debug("list is {}",list);

        BootstrapTable table = new BootstrapTable();
        table.setTotal(10L);
        table.setRows(list);

        return table;
    }

}

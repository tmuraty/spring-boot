package com.muraty.component.tree.controller;

import com.muraty.base.ui.ZTree;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
 * 树插件(zTree)
 *
 * @author muraty
 */
@Controller
@RequestMapping("tree")
public class TreeController {

    @RequestMapping("/{page}")
    String index(@PathVariable("page")String page){
        return "component/tree/" + page;
    }

    /**
     * 获得json数据
     */
    @RequestMapping("/data/t1")
    @ResponseBody
    List t1() {

        List<ZTree> zTrees = new ArrayList<ZTree>();
        zTrees.add(new ZTree("000","","顶级节点"));
        zTrees.add(new ZTree("001","000","一级节点1"));
        zTrees.add(new ZTree("002","000","一级节点2"));
        zTrees.add(new ZTree("003","000","一级节点3"));

        zTrees.add(new ZTree("011","001","二级节点1"));
        zTrees.add(new ZTree("012","001","二级节点2"));

        return zTrees;
    }

}

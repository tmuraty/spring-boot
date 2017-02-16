package com.muraty.navigation.service;

import org.springframework.stereotype.Service;

@Service
public class NavService {

    /**
     * (可以)从数据库获取版本信息
     */
    public String version(){
        return "dev-1.0";
    }

}

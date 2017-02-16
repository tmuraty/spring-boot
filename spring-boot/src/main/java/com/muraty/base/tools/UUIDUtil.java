package com.muraty.base.tools;

import java.util.UUID;

public class UUIDUtil {

    private UUIDUtil(){}

    /**
     * 实体主键生成规则
     * @return String(32位)  eg. 0db1900a988449948076d489fed575ef
     */
    public static String UUID(){
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

}

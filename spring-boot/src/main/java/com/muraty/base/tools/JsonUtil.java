package com.muraty.base.tools;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * json
 */
public class JsonUtil {

    private static final Logger log = LoggerFactory.getLogger(JsonUtil.class);
    private static final ObjectMapper mapper;

    static {
        mapper = new ObjectMapper();
    }

    private JsonUtil() {}

    public static String toJson(Object o){
        String out = "";
        try {
            out = mapper.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            log.error("JsonUtil error is {}",e);
        }
        return out;
    }

    public static String toJsonFmt(Object o){
        String out = "";
        try {
            out = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(o);
        } catch (JsonProcessingException e) {
            log.error("JsonUtil error is {}",e);
        }
        return out;
    }

}

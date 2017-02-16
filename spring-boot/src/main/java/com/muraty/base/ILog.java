package com.muraty.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 抽象一个日志类
 *
 * @author muraty
 */
public abstract class ILog {

    protected Logger log = LoggerFactory.getLogger(getClass());

}

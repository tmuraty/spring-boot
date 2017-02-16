package com.muraty.component.select.service;

import com.muraty.base.ssh.IDao;
import com.muraty.base.ssh.IService;
import com.muraty.base.tools.StringUtil;
import com.muraty.base.ui.Select2;
import com.muraty.component.base.entity.BaseCode;
import com.muraty.component.select.dao.SelectDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
@CacheConfig(cacheNames = "ui_select2")
public class SelectService extends IService<BaseCode> {

    @Autowired private SelectDao selectDao;

    public IDao<BaseCode> dao() {
        return selectDao;
    }

    @Cacheable
    public List<Select2> findAllSelect() {
        return selectDao.findAllSelect();
    }

    @Cacheable
    public List<Select2> findByCodeRule(String codeRule) {
        return selectDao.findByCodeRule(codeRule);
    }

    public List<Select2> findByCodeRuleAndPyShortLike(String codeRule, String pyShort) {
        // 处理 null 值
        pyShort = StringUtil.trimToEmpty(pyShort);
        return selectDao.findByCodeRuleAndPyShortLike(codeRule, "%" + pyShort.toUpperCase() + "%");
    }

    /**
     * 清空缓存
     */
    @CacheEvict
    public void flush(){}

}

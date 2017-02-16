package com.muraty.component.select.dao;

import com.muraty.base.ui.Select2;
import com.muraty.component.base.dao.BaseCodeDao;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * 基础数据字典表
 */
public interface SelectDao extends BaseCodeDao {

    /**
     * 分页查询字典数据表 属于select的数据
     *
     * @return list<Select2>
     */
    @Query(value = "select new com.muraty.base.ui.Select2(b.coding,b.codeMean) "
            + " from BaseCode b")
    List<Select2> findAllSelect();

    /**
     * 根据 编码标准 查询所有 属于 select2 控件数据
     *
     * @param codeRule 编码标准
     * @return list<Select2>
     */
    @Query(value = "select new com.muraty.base.ui.Select2(b.coding,b.codeMean) "
            + " from BaseCode b where b.codeRule = :codeRule")
    List<Select2> findByCodeRule(
            @Param("codeRule") String codeRule);

    /**
     * 根据 编码标准 查询所有 属于 select2 控件数据 模糊拼音首字母
     *
     * @param codeRule 编码标准
     * @param pyShort  拼音首字母
     * @return list<Select2>
     */
    @Query(value = "select new com.muraty.base.ui.Select2(b.coding,b.codeMean) "
            + " from BaseCode b where b.codeRule = :codeRule and b.pyShort like :pyShort")
    List<Select2> findByCodeRuleAndPyShortLike(
            @Param("codeRule") String codeRule,
            @Param("pyShort") String pyShort);

}

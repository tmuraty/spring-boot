package com.muraty.base.ssh;

import com.muraty.base.ILog;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *  抽象出一个共有业务层
 *
 *  {@link IService} 设置查询排序条件按照 insertTime 数据插入时间
 *  继承了日志, 可直接记录日志
 *
 *  @author muraty
 */
@Service
@Transactional
public abstract class IService<E extends IEntity> extends ILog{

    /**
     * 默认排序 按照数据插入时间 降序 (后插入的数据先显示)
     */
    private final Sort sort = new Sort(Sort.Direction.DESC, "insertTime");

    /**
     * 指定通用业务接口的数据层接口
     */
    public abstract IDao<E> dao();

    /**
     * 保存 (有与数据库匹配的 id 则更新 )
     */
    public E saveOrUpdate(E e){
        return dao().save(e);
    }

    /**
     * 根据主键 id 查询实体
     */
    @Transactional(readOnly = true)
    public E findOne(String id) {
        return dao().findOne(id);
    }

    /**
     * 查询所有数据(测试或则开发时用,请勿在正式环境调用,防止数据泄漏)
     */
    @Transactional(readOnly = true)
    public List<E> findAll() {
        return dao().findAll(this.sort);
    }

    /**
     * 查询所有数据(传入排序条件)
     */
    @Transactional(readOnly = true)
    public List<E> findAll(Sort sort) {
        sort.and(this.sort);
        return dao().findAll(sort);
    }

}
package com.muraty.base.ssh;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 *  抽象出一个共有的dao
 *
 *  {@link IEntity} 设定了主键为string 的32位uuid所以这里给定主键为string
 *
 *  @author muraty
 */
@NoRepositoryBean
public interface IDao<Entity> extends JpaRepository<Entity,String> {}


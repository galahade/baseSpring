package com.young.demo.repository.mybatis.infrastructure.impl;

import com.young.demo.repository.mybatis.infrastructure.BaseDao;
import com.young.demo.repository.mybatis.model.LeparInOrdersQuene;
import lombok.Getter;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by young_mac on 16/4/26.
 */
public abstract class BaseDaoImpl<E> extends SqlSessionDaoSupport implements BaseDao<E, BigInteger> {

    @Getter
    private final String namespace;

    public BaseDaoImpl(String namespace) {
        this.namespace = namespace;
    }

    public int save(E o) {
        return getSqlSession().insert(namespace+".save", o);
    }

    public int deleteById(BigInteger id) {
        return 0;//getSqlSession().update(namespace+".delete", ISDELETE.DELETED.getValue());
    }

    public List<E> findAll() {
        return null;
    }

    public  E get(BigInteger id) {
        return (E) getSqlSession().selectOne(namespace+".get", id);
    }

    public int removeById(BigInteger id) {
        return getSqlSession().delete(namespace+".remove", id);
    }

    public int updateById(BigInteger id, E o) {
        return getSqlSession().update(namespace+".update", o);
    }

    public  int count(){
        return (Integer) getSqlSession().selectOne(namespace+".count");
    }

}

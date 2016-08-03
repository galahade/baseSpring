package com.young.demo.repository.mybatis.infrastructure;

import com.young.demo.repository.mybatis.infrastructure.MyBatisReadOnlyMapper;

import java.io.Serializable;


/**
 * Created by young_mac on 16/4/27.
 */
public interface MyBatisUpdateableMapper<E, K extends Serializable> {

    int save(E entity);

    int updateByPrimaryKey(K id, E entity);
}

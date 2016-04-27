package com.young.demo.repository.mybatis.infrastructure;

import java.io.Serializable;

/**
 * Created by young_mac on 16/4/27.
 */
public interface MyBatisDeleteableMapper<K extends Serializable> {

    int deleteByPrimaryKey(K id);
}

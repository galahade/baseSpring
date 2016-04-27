package com.young.demo.repository.mybatis.infrastructure;

import java.io.Serializable;
import java.util.List;

/**
 * Created by young_mac on 16/4/26.
 */
public interface BaseDao<E, K extends Serializable> {

    E get(K id);

    List<E> findAll();

    int save(E entity);

    /**
     * delete entity bean thoroughly
     * @param id
     * @return
     */
    int removeById(K id);

    /**
     * mark entity bean as deleted
     * @param id
     * @return
     */
    int deleteById(K id);

    int updateById(K id,E entity);

    int count();
}

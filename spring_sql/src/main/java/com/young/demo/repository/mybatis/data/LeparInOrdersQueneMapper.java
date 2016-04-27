package com.young.demo.repository.mybatis.data;

import com.young.demo.repository.mybatis.infrastructure.MyBatisReadOnlyMapper;
import com.young.demo.repository.mybatis.infrastructure.MyBatisUpdateableMapper;
import com.young.demo.repository.mybatis.model.LeparInOrdersQuene;

import javax.annotation.Resource;

/**
 * Created by young_mac on 16/4/27.
 */
public interface LeparInOrdersQueneMapper extends MyBatisReadOnlyMapper<LeparInOrdersQuene, LeparInOrdersQuene.LeparInOrdersQueneKey>, MyBatisUpdateableMapper<LeparInOrdersQuene, LeparInOrdersQuene.LeparInOrdersQueneKey> {
    @Override
    LeparInOrdersQuene getByPrimaryKey(LeparInOrdersQuene.LeparInOrdersQueneKey id);

    @Override
    int save(LeparInOrdersQuene entity);

    @Override
    int updateByPrimaryKey(LeparInOrdersQuene.LeparInOrdersQueneKey id, LeparInOrdersQuene entity);
}

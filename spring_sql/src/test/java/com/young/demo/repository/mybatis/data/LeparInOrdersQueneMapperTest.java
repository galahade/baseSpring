package com.young.demo.repository.mybatis.data;

import com.young.demo.repository.mybatis.model.LeparInOrdersQuene;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import javax.annotation.Resource;

/**
 * Created by young_mac on 16/4/27.
 */

@ContextConfiguration({ "classpath:spring/main.xml" })
public class LeparInOrdersQueneMapperTest extends AbstractJUnit4SpringContextTests {

    private  LeparInOrdersQueneMapper mapper = null;
    @Autowired
    SqlSessionTemplate sqlSession;

    @Before
    public void init() {
        this.mapper = sqlSession.getMapper(LeparInOrdersQueneMapper.class);
    }

    @After
    public void clean() {
        this.mapper = null;
    }

    @Test
    public void getByPrimaryKey() {
        LeparInOrdersQuene.LeparInOrdersQueneKey key = new LeparInOrdersQuene.LeparInOrdersQueneKey("47028",30);
        getOrderQueneById(key);
    }


    private LeparInOrdersQuene getOrderQueneById(LeparInOrdersQuene.LeparInOrdersQueneKey key) {

        LeparInOrdersQuene orderQuene = mapper.getByPrimaryKey(key);

        return orderQuene;
    }
}

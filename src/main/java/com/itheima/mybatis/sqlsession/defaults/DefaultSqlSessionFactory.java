package com.itheima.mybatis.sqlsession.defaults;

import com.itheima.mybatis.cfg.Configuration;
import com.itheima.mybatis.sqlsession.SqlSession;
import com.itheima.mybatis.sqlsession.SqlSessionFactory;

/**
 * @Author WangHao
 * @Date 2020/1/9 16:55
 * @Version 1.0
 **/
public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private Configuration cfg;

    public DefaultSqlSessionFactory(Configuration cfg){

        this.cfg = cfg;
    }
    /**
     * 用于创建新的连接
     * @return
     */
    @Override
    public SqlSession openSession() {

        return new DefaultSqlSession(cfg);
    }
}

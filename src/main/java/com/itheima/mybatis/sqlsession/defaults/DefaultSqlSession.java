package com.itheima.mybatis.sqlsession.defaults;

import com.itheima.mybatis.cfg.Configuration;
import com.itheima.mybatis.sqlsession.SqlSession;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.SQLException;

import com.itheima.mybatis.sqlsession.proxy.Mapperproxy;
import com.itheima.mybatis.utils.DataSourceUtil;

import javax.sql.DataSource;


/**
 * @Author WangHao
 * @Date 2020/1/9 16:58
 * @Version 1.0
 * SqlSession接口的实现类
 **/
public class DefaultSqlSession implements SqlSession {
    private Configuration cfg;
    private Connection connection;

    public DefaultSqlSession(Configuration cfg){
        this.cfg = cfg;
        connection = DataSourceUtil.getConnection(cfg);
    }
    @Override
    public <T> T getMapper(Class<T> daoInterfaceClass) {
        return (T) Proxy.newProxyInstance(daoInterfaceClass.getClassLoader(),
                new Class[]{daoInterfaceClass},new Mapperproxy(cfg.getMappers(),connection));

    }

    @Override
    public void close() {
        if(null != connection){
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        }
    }
}

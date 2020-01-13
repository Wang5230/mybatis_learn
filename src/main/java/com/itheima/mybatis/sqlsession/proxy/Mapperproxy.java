package com.itheima.mybatis.sqlsession.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.util.Map;

import com.itheima.mybatis.cfg.Mapper;
import com.itheima.mybatis.utils.Executor;

/**
 * @Author WangHao
 * @Date 2020/1/10 15:48
 * @Version 1.0
 **/
public class Mapperproxy implements InvocationHandler {

        private Map<String, Mapper> mappers;
        private Connection conn;
        public Mapperproxy(Map<String,Mapper> mappers,Connection conn){
            this.mappers = mappers;
            this.conn = conn;
        }
    /**
     * 用于对方法增强，增强其实就是调用selectlist方法
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //1.获取方法名
        String methodName = method.getName();
        //2.获取方法所在类的名称
        String className = method.getDeclaringClass().getName();
        //3.组合key
        String key = className+"."+methodName;
        //4.获取mappers中的Mapper对象
        Mapper mapper = mappers.get(key);
        //5.判断是否有mapper
        if (null == mapper){
            throw new IllegalArgumentException("参数有误");
        }
        return new Executor().selectList(mapper,conn);
    }
}

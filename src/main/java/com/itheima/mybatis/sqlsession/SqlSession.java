package com.itheima.mybatis.sqlsession;

/**
 * @Author WangHao
 * @Date 2020/1/9 15:44
 * @Version 1.0
 * 自定义mybatis中和数据库交互的核心类
 * 可以创建dao对象的代理对象
 **/
public interface SqlSession {
    /**
     *
     * @param daoInterfaceClass dao的接口字节码
     * @param <T>
     * @return
     */
    <T> T getMapper(Class<T> daoInterfaceClass);

    void close();
}

package com.itheima.mybatis.sqlsession;

/**
 * @Author WangHao
 * @Date 2020/1/9 15:41
 * @Version 1.0
 **/
public interface SqlSessionFactory {
    /**
     * 用于打开一个新的SqlSession对象
     */
    SqlSession openSession();
}

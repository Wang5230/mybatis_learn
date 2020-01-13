package com.itheima.mybatis.io;

import java.io.InputStream;

/**
 * @Author WangHao
 * @Date 2020/1/9 15:36
 * @Version 1.0
 * 使用类加载器读取配置文件
 **/
public class Resources {
    public static InputStream getResourceAsStream(String filePath){
        return Resources.class.getClassLoader().getResourceAsStream(filePath);
    }
}

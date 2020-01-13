package com.itheima.mybatis.cfg;

/**
 * @Author WangHao
 * @Date 2020/1/9 16:10
 * @Version 1.0
 * 用于封装的SQL语句喝结果类型的全限定类名
 **/
public class Mapper {
    private String queryString;
    private String resultType;

    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }
}

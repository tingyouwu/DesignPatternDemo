package com.wty.app.designpatterndemo.responsibilitychainpattern;

/**
 * @Desc 女性接口
 **/
public interface IWomen {
    //获得个人状况
    public int getType();
    //获得个人请示  出去逛街  约会  看电影
    public String getRequest();
}

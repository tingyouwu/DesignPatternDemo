package com.wty.app.designpatterndemo.iteratorpattern;

/**
 * @Desc 项目信息接口
 **/
public interface IProject {
    void add(String name,int num,int cost);
    String getProjectInfo();
    public IProjectIterator iterator();
}

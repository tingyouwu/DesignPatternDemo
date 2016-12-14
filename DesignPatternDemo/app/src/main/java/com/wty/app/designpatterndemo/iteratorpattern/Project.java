package com.wty.app.designpatterndemo.iteratorpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc 项目信息
 **/
public class Project implements IProject{

    private List<IProject> projectList = new ArrayList<>();

    private String name = "";
    private int num;//项目成员数量
    private int cost;//项目费用

    public Project(){

    }

    public Project(String name,int num,int cost){
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    @Override
    public void add(String name, int num, int cost) {
        this.projectList.add(new Project(name,num,cost));
    }

    @Override
    public String getProjectInfo() {
        String info = "";
        info = info + "项目名称：" + this.name + " 项目人数：" + this.num + " 项目费用：" + this.cost;
        return info;
    }

    @Override
    public IProjectIterator iterator() {
        return new ProjectIterator(this.projectList);
    }

}

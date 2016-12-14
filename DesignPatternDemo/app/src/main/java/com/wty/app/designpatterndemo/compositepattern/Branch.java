package com.wty.app.designpatterndemo.compositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc 树枝实现类
 **/
public class Branch implements IBranch{

    private String name = "";//名字
    private String position = "";//职位
    private int salary = 0;//工资

    //领导下边有哪些下级领导以及小兵
    List<ICorp> subordinateList = new ArrayList<>();

    public Branch(String name,String position,int salary){
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public void addSubordinate(ICorp corp) {
        this.subordinateList.add(corp);
    }

    @Override
    public List<ICorp> getSubordinate() {
        return this.subordinateList;
    }

    @Override
    public String getInfo() {
        String info = "";
        info = "姓名：" + this.name;
        info =  info + " 职位：" + this.position;
        info = info + " 工资：" + this.salary;
        return info;
    }

}

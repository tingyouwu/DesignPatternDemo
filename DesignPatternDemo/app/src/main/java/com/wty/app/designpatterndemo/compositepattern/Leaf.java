package com.wty.app.designpatterndemo.compositepattern;

/**
 * @Desc 树叶
 **/
public class Leaf implements ILeaf{

    private String name = "";//名字
    private String position = "";//职位
    private int salary = 0;//工资

    public Leaf(String name,String position,int salary){
        this.name = name;
        this.position = position;
        this.salary = salary;
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

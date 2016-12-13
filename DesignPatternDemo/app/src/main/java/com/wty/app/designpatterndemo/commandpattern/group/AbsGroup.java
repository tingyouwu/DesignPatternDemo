package com.wty.app.designpatterndemo.commandpattern.group;

/**
 * @Desc 抽象组
 **/
public abstract class AbsGroup {
    //甲乙双方分开办公，如果你需要和某个组讨论，首先得找到这个组
    public abstract void find();
    //被要求增加功能
    public abstract void add();
    //被要求删除功能
    public abstract void delete();
    //被要求修改功能
    public abstract void change();
    //被要求给出所有的变更计划
    public abstract void plan();
}

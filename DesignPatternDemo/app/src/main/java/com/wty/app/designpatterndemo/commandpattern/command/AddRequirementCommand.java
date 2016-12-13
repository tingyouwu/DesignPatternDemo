package com.wty.app.designpatterndemo.commandpattern.command;

/**
 * @Desc 增加需求命令
 **/
public class AddRequirementCommand extends AbsCommand{

    @Override
    public void execute() {
        //找到需求组
        super.rg.find();
        //增加需求
        super.rg.add();
        //给出计划
        super.rg.plan();
    }
}

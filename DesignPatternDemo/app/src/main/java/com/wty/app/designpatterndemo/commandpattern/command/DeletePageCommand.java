package com.wty.app.designpatterndemo.commandpattern.command;

/**
 * @Desc 增加需求命令
 **/
public class DeletePageCommand extends AbsCommand{

    @Override
    public void execute() {
        //找到美工组
        super.pg.find();
        //删除需求
        super.rg.delete();
        //给出计划
        super.rg.plan();
    }
}

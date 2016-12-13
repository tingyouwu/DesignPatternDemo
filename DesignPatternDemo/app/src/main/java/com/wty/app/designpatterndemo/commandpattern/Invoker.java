package com.wty.app.designpatterndemo.commandpattern;

import com.wty.app.designpatterndemo.commandpattern.command.AbsCommand;

/**
 * @Desc 负责人
 **/
public class Invoker {
    private AbsCommand command;
    public void setCommand(AbsCommand command){
        this.command = command;
    }
    public void action(){
        this.command.execute();
    }
}

package com.wty.app.designpatterndemo.commandpattern.command;

import com.wty.app.designpatterndemo.commandpattern.group.CodeGroup;
import com.wty.app.designpatterndemo.commandpattern.group.PageGroup;
import com.wty.app.designpatterndemo.commandpattern.group.RequirementGroup;

/**
 * @Desc 抽象命令类
 **/
public abstract class AbsCommand {
    protected RequirementGroup rg = new RequirementGroup();
    protected PageGroup pg = new PageGroup();
    protected CodeGroup cg = new CodeGroup();

    public abstract void execute();
}

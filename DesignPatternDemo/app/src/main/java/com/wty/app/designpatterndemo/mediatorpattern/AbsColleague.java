package com.wty.app.designpatterndemo.mediatorpattern;

/**
 * @Desc 抽象同事类
 **/
public abstract class AbsColleague {
    protected AbsMediator mediator;
    public AbsColleague(AbsMediator mediator){
        this.mediator = mediator;
    }
}

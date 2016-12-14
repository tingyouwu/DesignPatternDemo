package com.wty.app.designpatterndemo.statepattern.state;

import com.wty.app.designpatterndemo.statepattern.StateManger;

/**
 * @Desc 抽象电梯状态
 **/
public abstract class AbsLiftState {

    protected StateManger stateManger;

    public void setStateManger(StateManger stateManger){
        this.stateManger = stateManger;
    }

    public abstract void open();

    public abstract void close();

    public abstract void run();

    public abstract void stop();

}

package com.wty.app.designpatterndemo.statepattern.state;

import com.wty.app.designpatterndemo.statepattern.StateManger;

/**
 * @Desc 关闭状态
 **/
public class ClosingState extends AbsLiftState{

    @Override
    public void open() {
        super.stateManger.setLiftState(StateManger.openningState);
        super.stateManger.getLiftState().open();
    }

    @Override
    public void close() {

    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}

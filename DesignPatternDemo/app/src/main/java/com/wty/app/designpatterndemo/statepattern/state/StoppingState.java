package com.wty.app.designpatterndemo.statepattern.state;

import com.wty.app.designpatterndemo.statepattern.StateManger;

/**
 * @Desc 停止状态
 **/
public class StoppingState extends AbsLiftState{

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
        super.stateManger.setLiftState(StateManger.runningState);
        super.stateManger.getLiftState().run();
    }

    @Override
    public void stop() {

    }
}

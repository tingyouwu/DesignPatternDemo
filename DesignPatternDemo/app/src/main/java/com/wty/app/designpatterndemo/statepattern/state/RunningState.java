package com.wty.app.designpatterndemo.statepattern.state;

import com.wty.app.designpatterndemo.statepattern.StateManger;

/**
 * @Desc 运行状态
 **/
public class RunningState extends AbsLiftState{

    @Override
    public void open() {
    }

    @Override
    public void close() {

    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {
        super.stateManger.setLiftState(StateManger.stoppingState);
        super.stateManger.getLiftState().stop();
    }
}

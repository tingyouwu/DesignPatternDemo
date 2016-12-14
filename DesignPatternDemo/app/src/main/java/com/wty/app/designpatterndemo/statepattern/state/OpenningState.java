package com.wty.app.designpatterndemo.statepattern.state;

import com.wty.app.designpatterndemo.statepattern.StateManger;

/**
 * @Desc 打开状态
 **/
public class OpenningState extends AbsLiftState{

    @Override
    public void open() {

    }

    @Override
    public void close() {
        super.stateManger.setLiftState(StateManger.closeingState);
        super.stateManger.getLiftState().close();
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}

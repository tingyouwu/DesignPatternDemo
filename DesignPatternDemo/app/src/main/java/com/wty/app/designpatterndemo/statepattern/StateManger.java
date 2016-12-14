package com.wty.app.designpatterndemo.statepattern;

import com.wty.app.designpatterndemo.statepattern.state.AbsLiftState;
import com.wty.app.designpatterndemo.statepattern.state.ClosingState;
import com.wty.app.designpatterndemo.statepattern.state.OpenningState;
import com.wty.app.designpatterndemo.statepattern.state.RunningState;
import com.wty.app.designpatterndemo.statepattern.state.StoppingState;

/**
 * @Desc 管理状态
 **/
public class StateManger {
    public final static ClosingState closeingState = new ClosingState();
    public final static OpenningState openningState = new OpenningState();
    public final static RunningState runningState = new RunningState();
    public final static StoppingState stoppingState = new StoppingState();

    private AbsLiftState liftState;
    public AbsLiftState getLiftState(){
        return liftState;
    }

    public void setLiftState(AbsLiftState liftState){
        this.liftState = liftState;
        this.liftState.setStateManger(this);
    }

    public void open(){
        this.liftState.open();
    }

    public void close(){
        this.liftState.close();
    }

    public void run(){
        this.liftState.run();
    }

    public void stop(){
        this.liftState.stop();
    }

}

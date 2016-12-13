package com.wty.app.designpatterndemo.strategypattern;

/**
 * @Desc 抽象策略
 **/
public class Invoker {
    private IStrategy strategy;
    public Invoker(IStrategy strategy){
        this.strategy = strategy;
    }

    public void operate(){
        this.strategy.operate();
    }
}

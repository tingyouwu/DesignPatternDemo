package com.wty.app.designpatterndemo.strategypattern;

/**
 * @Desc 断后
 **/
public class BlockEnemyStrategy implements IStrategy{
    @Override
    public void operate() {
        System.out.println("断后门");
    }
}

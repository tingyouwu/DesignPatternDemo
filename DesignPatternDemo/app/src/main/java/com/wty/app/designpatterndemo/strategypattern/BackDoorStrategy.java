package com.wty.app.designpatterndemo.strategypattern;

/**
 * @Desc 走后门
 **/
public class BackDoorStrategy implements IStrategy{
    @Override
    public void operate() {
        System.out.println("走后门");
    }
}

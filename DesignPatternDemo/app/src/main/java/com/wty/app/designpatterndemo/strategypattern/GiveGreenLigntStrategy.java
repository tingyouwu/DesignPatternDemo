package com.wty.app.designpatterndemo.strategypattern;

/**
 * @Desc 开绿灯
 **/
public class GiveGreenLigntStrategy implements IStrategy{
    @Override
    public void operate() {
        System.out.println("开绿灯，放行");
    }
}

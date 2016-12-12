package com.wty.app.designpatterndemo.factorymethod.human;

import com.wty.app.designpatterndemo.factorymethod.IHuman;

/**
 * @Desc 黄种人
 **/
public class YellowHuman implements IHuman{

    @Override
    public void getColor() {
        System.out.println("黄色人种皮肤是黄色的");
    }

    @Override
    public void talk() {
       System.out.print("黄种人说汉语");
    }
}

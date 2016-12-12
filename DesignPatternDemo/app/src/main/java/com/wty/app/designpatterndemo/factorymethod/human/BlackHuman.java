package com.wty.app.designpatterndemo.factorymethod.human;

import com.wty.app.designpatterndemo.factorymethod.IHuman;

/**
 * @Desc 黑种人
 **/
public class BlackHuman implements IHuman{

    @Override
    public void getColor() {
        System.out.println("黑色人种皮肤是黑色的");
    }

    @Override
    public void talk() {
        System.out.print("黑种人说英语，听不懂");
    }
}

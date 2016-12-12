package com.wty.app.designpatterndemo.factorymethod.human;

import com.wty.app.designpatterndemo.factorymethod.IHuman;

/**
 * @Desc 白种人
 **/
public class WhiteHuman implements IHuman{

    @Override
    public void getColor() {
        System.out.println("白色人种皮肤是白色的");
    }

    @Override
    public void talk() {
        System.out.print("白种人说英语，听不懂");
    }
}

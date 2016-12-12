package com.wty.app.designpatterndemo.abstractfactory.human;

import com.wty.app.designpatterndemo.abstractfactory.IHuman;

/**
 * @Desc 黑色人种
 **/
public abstract class AbstractBlackHuman implements IHuman{

    public void getColor() {
        System.out.println("黑色人种皮肤是黑色的");
    }

    public void talk() {
        System.out.print("黑种人说英语，听不懂");
    }

}

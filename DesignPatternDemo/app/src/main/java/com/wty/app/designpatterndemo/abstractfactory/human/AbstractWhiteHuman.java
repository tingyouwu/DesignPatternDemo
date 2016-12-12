package com.wty.app.designpatterndemo.abstractfactory.human;

import com.wty.app.designpatterndemo.abstractfactory.IHuman;

/**
 * @Desc 白色人种
 **/
public abstract class AbstractWhiteHuman implements IHuman{

    public void getColor() {
        System.out.println("白色人种皮肤是白色的");
    }

    public void talk() {
        System.out.print("白种人说英语，听不懂");
    }

}

package com.wty.app.designpatterndemo.abstractfactory.human;

import com.wty.app.designpatterndemo.abstractfactory.IHuman;

/**
 * @Desc 黄色人种
 **/
public abstract class AbstractYellowHuman implements IHuman{

    public void getColor() {
        System.out.println("黄色人种皮肤是黄色的");
    }

    public void talk() {
        System.out.print("黄种人说汉语");
    }

}

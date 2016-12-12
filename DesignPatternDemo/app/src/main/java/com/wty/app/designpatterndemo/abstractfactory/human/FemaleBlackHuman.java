package com.wty.app.designpatterndemo.abstractfactory.human;

/**
 * @Desc 黑色女性人种
 **/
public class FemaleBlackHuman extends AbstractBlackHuman{

    @Override
    public void getSex() {
         System.out.println("黑人女性");
    }
}

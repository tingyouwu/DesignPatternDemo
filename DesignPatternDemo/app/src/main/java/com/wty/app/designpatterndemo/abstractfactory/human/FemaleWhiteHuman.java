package com.wty.app.designpatterndemo.abstractfactory.human;

/**
 * @Desc 白人女性人种
 **/
public class FemaleWhiteHuman extends AbstractBlackHuman{
    @Override
    public void getSex() {
         System.out.println("白人女性");
    }
}

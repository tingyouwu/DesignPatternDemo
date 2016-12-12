package com.wty.app.designpatterndemo.abstractfactory.human;

/**
 * @Desc 白人男性人种
 **/
public class MaleWhiteHuman extends AbstractBlackHuman{
    @Override
    public void getSex() {
         System.out.println("白人男性");
    }
}

package com.wty.app.designpatterndemo.abstractfactory.human;

/**
 * @Desc 黑人男性人种
 **/
public class MaleBlackHuman extends AbstractBlackHuman{
    @Override
    public void getSex() {
         System.out.println("黑人男性");
    }
}

package com.wty.app.designpatterndemo.abstractfactory.human;

/**
 * @Desc 黄人男性人种
 **/
public class MaleYellowHuman extends AbstractYellowHuman{
    @Override
    public void getSex() {
         System.out.println("黄人男性");
    }
}

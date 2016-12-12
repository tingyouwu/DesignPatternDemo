package com.wty.app.designpatterndemo.abstractfactory.human;

/**
 * @Desc 黄人女性人种
 **/
public class FemaleYellowHuman extends AbstractYellowHuman{
    @Override
    public void getSex() {
         System.out.println("黄人女性");
    }
}

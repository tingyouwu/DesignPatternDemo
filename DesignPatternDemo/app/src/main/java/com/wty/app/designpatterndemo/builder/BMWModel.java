package com.wty.app.designpatterndemo.builder;


/**
 * @Desc 宝马车
 **/
public class BMWModel extends AbstractCarModel{

    @Override
    public void start() {
        System.out.println("宝马车启动");
    }

    @Override
    public void stop() {
        System.out.println("宝马车停车");
    }

    @Override
    public void alarm() {
        System.out.println("宝马车鸣笛");
    }

    @Override
    public void engineBoom() {
        System.out.println("宝马车启动发动机");
    }
}

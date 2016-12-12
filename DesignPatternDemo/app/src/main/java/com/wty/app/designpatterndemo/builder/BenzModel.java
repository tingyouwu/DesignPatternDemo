package com.wty.app.designpatterndemo.builder;


/**
 * @Desc 奔驰车
 **/
public class BenzModel extends AbstractCarModel{

    @Override
    public void start() {
        System.out.println("奔驰车启动");
    }

    @Override
    public void stop() {
        System.out.println("奔驰车停车");
    }

    @Override
    public void alarm() {
        System.out.println("奔驰车鸣笛");
    }

    @Override
    public void engineBoom() {
        System.out.println("奔驰车启动发动机");
    }
}

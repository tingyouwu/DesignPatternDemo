package com.wty.app.designpatterndemo.templatemethod;


/**
 * @Desc 悍马H2模型
 **/
public class HummerH2Model extends AbstractHummerModel{

    @Override
    public void start() {
        System.out.println("悍马H2启动");
    }

    @Override
    public void stop() {
        System.out.println("悍马H2停车");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H2鸣笛");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H2引擎启动");
    }
}

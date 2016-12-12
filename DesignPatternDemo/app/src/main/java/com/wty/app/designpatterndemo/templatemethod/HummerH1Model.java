package com.wty.app.designpatterndemo.templatemethod;


/**
 * @Desc 悍马H1模型
 **/
public class HummerH1Model extends AbstractHummerModel{

    @Override
    public void start() {
        System.out.println("悍马H1启动");
    }

    @Override
    public void stop() {
        System.out.println("悍马H1停车");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H1鸣笛");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H1引擎启动");
    }
}

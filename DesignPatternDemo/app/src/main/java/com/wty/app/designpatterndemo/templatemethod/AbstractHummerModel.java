package com.wty.app.designpatterndemo.templatemethod;


/**
 * @Desc 抽象悍马模型
 **/
public abstract class AbstractHummerModel {

    public abstract void start();

    public abstract void stop();

    public abstract void alarm();

    public abstract void engineBoom();

    public void run(){
       //先发动汽车
       this.start();
       //引擎发动
       this.engineBoom();
       //鸣笛
       this.alarm();
       //到目的地停车
       this.stop();
    }

}

package com.wty.app.designpatterndemo.observerpattern.observer;

/**
 * @Desc 观察者1
 **/
public class LiSi implements IObserver{
    @Override
    public void update(String content) {
        System.out.println("李斯：观察到活动，向老板报告.....");
        this.reportToQinShiHuang(content);
    }

    private void reportToQinShiHuang(String content){
        System.out.println("报告老板，韩非子有活动了...."+content);
    }
}

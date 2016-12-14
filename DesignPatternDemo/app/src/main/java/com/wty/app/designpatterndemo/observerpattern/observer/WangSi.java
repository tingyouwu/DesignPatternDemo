package com.wty.app.designpatterndemo.observerpattern.observer;

/**
 * @Desc 观察者2
 **/
public class WangSi implements IObserver{
    @Override
    public void update(String content) {
        System.out.println("王思：观察到活动，向老板报告.....");
        this.reportToQinShiHuang(content);
    }

    private void reportToQinShiHuang(String content){
        System.out.println("报告老板，韩非子有活动了...."+content);
    }
}

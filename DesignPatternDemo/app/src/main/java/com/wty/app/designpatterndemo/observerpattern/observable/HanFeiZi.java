package com.wty.app.designpatterndemo.observerpattern.observable;

import com.wty.app.designpatterndemo.observerpattern.IHanFeiZi;
import com.wty.app.designpatterndemo.observerpattern.observer.IObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc 被观察者
 **/
public class HanFeiZi implements IObservable,IHanFeiZi{

    private List<IObserver> observerList = new ArrayList<>();

    @Override
    public void haveBreakfast() {
        System.out.print("韩非子开始吃饭....");
        this.notifyObservers("韩非子吃饭了");
    }

    @Override
    public void haveFun() {
        System.out.print("韩非子开始娱乐了....");
        this.notifyObservers("韩非子开始娱乐了");
    }

    @Override
    public void addObserver(IObserver observer) {
        this.observerList.add(observer);
    }

    @Override
    public void deleteObserver(IObserver observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObservers(String content) {
        for(IObserver observer:observerList){
            observer.update(content);
        }
    }
}

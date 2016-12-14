package com.wty.app.designpatterndemo.observerpattern.observable;

import com.wty.app.designpatterndemo.observerpattern.observer.IObserver;

/**
 * @Desc 被观察者接口
 **/
public interface IObservable {
    void addObserver(IObserver observer);
    void deleteObserver(IObserver observer);
    void notifyObservers(String content);
}

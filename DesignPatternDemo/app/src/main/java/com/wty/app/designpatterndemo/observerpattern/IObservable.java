package com.wty.app.designpatterndemo.observerpattern;

/**
 * @Desc 被观察者接口
 **/
public interface IObservable {
    void addObserver(IObserver observer);
    void deleteObserver(IObserver observer);
    void notifyObservers(String content);
}

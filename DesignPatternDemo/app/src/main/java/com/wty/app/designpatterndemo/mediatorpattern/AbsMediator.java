package com.wty.app.designpatterndemo.mediatorpattern;

/**
 * @Desc 抽象中介者
 **/
public abstract class AbsMediator {
    protected Purchase purchase;
    protected Sale     sale;
    protected Stock    stock;

    public AbsMediator(){
        purchase = new Purchase(this);
        sale = new Sale(this);
        stock = new Stock(this);
    }

    public abstract void execute(String str,Object... objects);
}

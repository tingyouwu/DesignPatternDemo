package com.wty.app.designpatterndemo.factorymethod;

/**
 * @Desc 抽象人类创建工厂
 **/
public abstract class AbstractHumanFactory {
   public abstract <T extends IHuman> T createHuman(Class<T> humanClass);
}

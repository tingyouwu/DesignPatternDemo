package com.wty.app.designpatterndemo.abstractfactory;

/**
 * @Desc 抽象人类创建工厂
 **/
public interface IHumanFactory {
   public IHuman createYellowHuman();
   public IHuman createBlackHuman();
   public IHuman createWhiteHuman();
}

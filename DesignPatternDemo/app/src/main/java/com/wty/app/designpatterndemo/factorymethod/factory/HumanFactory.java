package com.wty.app.designpatterndemo.factorymethod.factory;

import com.wty.app.designpatterndemo.factorymethod.AbstractHumanFactory;
import com.wty.app.designpatterndemo.factorymethod.IHuman;

/**
 * @Desc 抽象人类创建工厂
 **/
public class HumanFactory extends AbstractHumanFactory{

   @Override
   public <T extends IHuman> T createHuman(Class<T> humanClass) {
      IHuman iHuman = null;
      try {
         iHuman = (IHuman) Class.forName(humanClass.getName()).newInstance();
      } catch (InstantiationException e) {
         e.printStackTrace();
         System.out.println("人种生成失败!");
      } catch (IllegalAccessException e) {
         e.printStackTrace();
         System.out.println("人种生成失败!");
      } catch (ClassNotFoundException e) {
         e.printStackTrace();
         System.out.println("人种生成失败!");
      }
      return (T) iHuman;
   }
}

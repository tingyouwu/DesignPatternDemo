package com.wty.app.designpatterndemo.simplefactory;

import com.wty.app.designpatterndemo.factorymethod.IHuman;

/**
 * @Desc 简单抽象人类创建工厂
 **/
public class SimpleHumanFactory{

   public static <T extends IHuman> T createHuman(Class<T> humanClass) {
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

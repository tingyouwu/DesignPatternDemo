package com.wty.app.designpatterndemo.abstractfactory.factory;

import com.wty.app.designpatterndemo.abstractfactory.IHuman;
import com.wty.app.designpatterndemo.abstractfactory.IHumanFactory;
import com.wty.app.designpatterndemo.abstractfactory.human.MaleBlackHuman;
import com.wty.app.designpatterndemo.abstractfactory.human.MaleWhiteHuman;
import com.wty.app.designpatterndemo.abstractfactory.human.MaleYellowHuman;

/**
 * @Desc 男性工厂
 **/
public class MaleHumanFactory implements IHumanFactory{

   @Override
   public IHuman createYellowHuman() {
      return new MaleYellowHuman();
   }

   @Override
   public IHuman createBlackHuman() {
      return new MaleBlackHuman();
   }

   @Override
   public IHuman createWhiteHuman() {
      return new MaleWhiteHuman();
   }
}

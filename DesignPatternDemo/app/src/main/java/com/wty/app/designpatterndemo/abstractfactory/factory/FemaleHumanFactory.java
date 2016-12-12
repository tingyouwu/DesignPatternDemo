package com.wty.app.designpatterndemo.abstractfactory.factory;

import com.wty.app.designpatterndemo.abstractfactory.IHuman;
import com.wty.app.designpatterndemo.abstractfactory.IHumanFactory;
import com.wty.app.designpatterndemo.abstractfactory.human.FemaleBlackHuman;
import com.wty.app.designpatterndemo.abstractfactory.human.FemaleWhiteHuman;
import com.wty.app.designpatterndemo.abstractfactory.human.FemaleYellowHuman;

/**
 * @Desc 女性工厂
 **/
public class FemaleHumanFactory implements IHumanFactory{

   @Override
   public IHuman createYellowHuman() {
      return new FemaleYellowHuman();
   }

   @Override
   public IHuman createBlackHuman() {
      return new FemaleBlackHuman();
   }

   @Override
   public IHuman createWhiteHuman() {
      return new FemaleWhiteHuman();
   }
}

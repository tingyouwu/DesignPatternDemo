package com.wty.app.designpatterndemo.builder;


import java.util.ArrayList;

/**
 * @Desc 抽象小车建造者
 **/
public abstract class AbstractCarBuilder {

    public abstract void  setSequence(ArrayList<String> sequence);

    public abstract AbstractCarModel getCarModel();

}

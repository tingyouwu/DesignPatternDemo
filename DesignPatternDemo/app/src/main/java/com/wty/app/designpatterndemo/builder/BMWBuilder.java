package com.wty.app.designpatterndemo.builder;


import java.util.ArrayList;

/**
 * @Desc 宝马小车建造者
 **/
public class BMWBuilder extends AbstractCarBuilder{

    private BMWModel bmw = new BMWModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }

    @Override
    public AbstractCarModel getCarModel() {
        return this.bmw;
    }
}

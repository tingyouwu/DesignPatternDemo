package com.wty.app.designpatterndemo.builder;


import java.util.ArrayList;

/**
 * @Desc 奔驰小车建造者
 **/
public class BenzBuilder extends AbstractCarBuilder{

    private BenzModel benz = new BenzModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public AbstractCarModel getCarModel() {
        return this.benz;
    }
}

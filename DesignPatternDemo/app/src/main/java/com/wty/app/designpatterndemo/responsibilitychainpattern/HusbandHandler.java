package com.wty.app.designpatterndemo.responsibilitychainpattern;

/**
 * @Desc 丈夫
 **/
public class HusbandHandler extends AbsHandler{

    public HusbandHandler(){
        super(AbsHandler.HUSBAND_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("妻子的请示是："+women.getRequest());
        System.out.println("丈夫的答复是：同意");
    }
}

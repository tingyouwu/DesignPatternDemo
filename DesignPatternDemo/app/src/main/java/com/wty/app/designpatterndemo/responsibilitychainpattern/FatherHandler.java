package com.wty.app.designpatterndemo.responsibilitychainpattern;

/**
 * @Desc 父亲
 **/
public class FatherHandler extends AbsHandler{

    public FatherHandler(){
        super(AbsHandler.FATHER_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("女儿的请示是："+women.getRequest());
        System.out.println("父亲的答复是：同意");
    }
}

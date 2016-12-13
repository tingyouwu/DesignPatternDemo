package com.wty.app.designpatterndemo.responsibilitychainpattern;

/**
 * @Desc 儿子
 **/
public class SonHandler extends AbsHandler{

    public SonHandler(){
        super(AbsHandler.SON_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("母亲的请示是："+women.getRequest());
        System.out.println("儿子的答复是：同意");
    }
}

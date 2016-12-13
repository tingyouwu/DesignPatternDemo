package com.wty.app.designpatterndemo.mediatorpattern;

/**
 * @Desc 采购管理
 **/
public class Purchase extends AbsColleague{

    public Purchase(AbsMediator mediator) {
        super(mediator);
    }

    public void buyIBMcomputer(int number){
        super.mediator.execute("purchase.buy",number);
    }

    public void refuseBuyIBM(){
        System.out.println("不再采购IBM电脑");
    }
}

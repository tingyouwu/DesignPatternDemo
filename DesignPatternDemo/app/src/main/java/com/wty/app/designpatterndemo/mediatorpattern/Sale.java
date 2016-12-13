package com.wty.app.designpatterndemo.mediatorpattern;

import java.util.Random;

/**
 * @Desc 销售管理
 **/
public class Sale extends AbsColleague{

    public Sale(AbsMediator mediator) {
        super(mediator);
    }

    //销售电脑
    public void sellIBMcomputer(int number){
        super.mediator.execute("sale.sell",number);
        System.out.println("销售IBM电脑："+number+"台");
    }

    //反馈销售情况
    public int getSaleStatus(){
        Random random = new Random(System.currentTimeMillis());
        int salesStatus = random.nextInt(100);
        System.out.println("IBM电脑的销售情况为："+salesStatus);
        return salesStatus;
    }

    //折价处理
    public void offSale(){
        super.mediator.execute("sale.offsell");
    }
}

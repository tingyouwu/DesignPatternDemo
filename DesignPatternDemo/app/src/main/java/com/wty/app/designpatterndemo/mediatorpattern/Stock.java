package com.wty.app.designpatterndemo.mediatorpattern;

/**
 * @Desc 库存管理
 **/
public class Stock extends AbsColleague{

    //刚开始有100台电脑
    private static int COMPUTER_NUMBER = 100;

    public Stock(AbsMediator mediator) {
        super(mediator);
    }

    //库存增加
    public void increase(int number){
        COMPUTER_NUMBER = COMPUTER_NUMBER+number;
        System.out.println("库存数量为："+COMPUTER_NUMBER);
    }

    //库存降低
    public void decrease(int number){
        COMPUTER_NUMBER = COMPUTER_NUMBER - number;
        System.out.println("库存数量为："+COMPUTER_NUMBER);
    }

    //获得库存数量
    public int getStockNumber(){
        return COMPUTER_NUMBER;
    }

    //存货多了 通知采购人员不要采购 销售人员赶紧销售
    public void clearStock(){
        System.out.println("清理存货数量为："+COMPUTER_NUMBER);
        super.mediator.execute("stock.clear");

    }
}

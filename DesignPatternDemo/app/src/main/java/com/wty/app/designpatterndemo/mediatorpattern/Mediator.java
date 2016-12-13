package com.wty.app.designpatterndemo.mediatorpattern;

/**
 * @Desc 中介者
 **/
public class Mediator extends AbsMediator{

    @Override
    public void execute(String str, Object... objects) {
        if(str.equals("purchase.buy")){
            this.buyComputer((Integer) objects[0]);
        }else if(str.equals("sale.sell")){
            this.sellIBMcomputer((Integer) objects[0]);
        }else if(str.equals("sale.offsell")){
            this.offSell();
        }else if(str.equals("stock.clear")){
            this.clearStock();
        }
    }

    private void buyComputer(int number){
        int saleStatus = super.sale.getSaleStatus();
        if(saleStatus>80){
            //销售良好
            System.out.println("采购IBM电脑"+ number +"台");
            super.stock.increase(number);
        }else{
            int buyNumber = number/2;
            System.out.println("采购IBM电脑"+ buyNumber +"台");
        }
    }

    //销售电脑
    private void sellIBMcomputer(int number){
        if(super.stock.getStockNumber()<number){
            purchase.buyIBMcomputer(number);
        }
        System.out.println("销售IBM电脑"+number+"台");
        super.stock.decrease(number);
    }

    //折价处理
    public void offSell(){
        System.out.println("折价销售IBM电脑"+ super.stock.getStockNumber()+"台");
    }

    //存货多了 通知采购人员不要采购 销售人员赶紧销售
    public void clearStock(){
        super.sale.offSale();
        super.purchase.refuseBuyIBM();

    }
}

package com.wty.app.designpatterndemo.responsibilitychainpattern;

/**
 * @Desc 古代妇女
 **/
public class Women implements IWomen{

    /**
     * 通过一个int类型的参数来描述妇女的个人状况
     * 1 --- 未出嫁
     * 2 --- 出嫁
     * 3 --- 夫死
     **/
    private int type =0;
    private String request = "";

    public Women(int type,String request){
        this.type = type;
        this.request = request;
        switch (this.type){
            case AbsHandler.FATHER_LEVEL_REQUEST:
                this.request = "女儿的请求是：" + request;
                break;
            case AbsHandler.HUSBAND_LEVEL_REQUEST:
                this.request = "妻子的请求是：" + request;
                break;
            case AbsHandler.SON_LEVEL_REQUEST:
                this.request = "母亲的请求是：" + request;
                break;
        }
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}

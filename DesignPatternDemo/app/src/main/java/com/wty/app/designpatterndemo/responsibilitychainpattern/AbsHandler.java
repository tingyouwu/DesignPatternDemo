package com.wty.app.designpatterndemo.responsibilitychainpattern;

/**
 * @Desc 有处理权的人员接口
 **/
public abstract class AbsHandler {

    public final static int FATHER_LEVEL_REQUEST = 1;
    public final static int HUSBAND_LEVEL_REQUEST = 2;
    public final static int SON_LEVEL_REQUEST = 3;

    //能处理的级别
    private int level = 0;
    //责任传递 下一个责任人是谁
    private AbsHandler nextHandler;

    public AbsHandler(int level){
        this.level = level;
    }

    //要处理这个请求
    public final void HandleMessage(IWomen women){
        if(women.getType() ==  this.level){
            this.response(women);
        }else{
            if(this.nextHandler != null){
                this.nextHandler.HandleMessage(women);
            }else{
                System.out.println("没地方请示，按不同意处理");
            }
        }
    }

    //不属于我处理的  找下一个环节人
    public void setNext(AbsHandler handler){
        this.nextHandler = handler;
    }

    //有请示那当然要回应
    protected abstract void response(IWomen women);
}

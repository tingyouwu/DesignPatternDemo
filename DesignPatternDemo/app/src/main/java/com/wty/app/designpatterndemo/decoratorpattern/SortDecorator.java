package com.wty.app.designpatterndemo.decoratorpattern;

/**
 * @Desc 排名情况
 **/
public class SortDecorator extends AbsDecorator{

    public SortDecorator(AbsSchoolReport sr){
        super(sr);
    }

    private void reportSort(){
        System.out.println("我排名第二....");
    }

    @Override
    public void report(){
        this.reportSort();
        super.report();
    }

}

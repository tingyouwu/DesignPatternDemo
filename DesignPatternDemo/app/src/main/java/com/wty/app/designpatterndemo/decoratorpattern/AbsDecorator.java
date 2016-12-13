package com.wty.app.designpatterndemo.decoratorpattern;

/**
 * @Desc 抽象成绩单
 **/
public abstract class AbsDecorator extends AbsSchoolReport{

    private AbsSchoolReport report;//需要装饰的

    public AbsDecorator(AbsSchoolReport sr){
        this.report = sr;
    }

    public void report(){
        this.report.report();
    }

    public void sign(String name){
        this.report.sign(name);
    }

}

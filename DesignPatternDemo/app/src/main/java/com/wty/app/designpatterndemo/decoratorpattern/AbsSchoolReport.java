package com.wty.app.designpatterndemo.decoratorpattern;

/**
 * @Desc 抽象成绩单
 **/
public abstract class AbsSchoolReport {
    public abstract void report();
    public abstract void sign(String name);
}

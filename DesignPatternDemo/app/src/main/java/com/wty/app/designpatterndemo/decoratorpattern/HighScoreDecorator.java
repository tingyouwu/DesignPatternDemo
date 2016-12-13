package com.wty.app.designpatterndemo.decoratorpattern;

/**
 * @Desc 最高成绩修饰
 **/
public class HighScoreDecorator extends AbsDecorator{

    public HighScoreDecorator(AbsSchoolReport sr){
        super(sr);
    }

    private void reportHighScore(){
        System.out.println("这次考试语文最高....");
    }

    @Override
    public void report(){
        this.reportHighScore();
        super.report();
    }

}

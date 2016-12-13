package com.wty.app.designpatterndemo.decoratorpattern;

/**
 * @Desc 四年级成绩单
 **/
public class FouthGradeSchoolReport extends AbsSchoolReport{
    @Override
    public void report() {
        System.out.println("尊敬的xxx家长：");
        System.out.println(".....");
        System.out.println("语文 11 数学 22 体育 90");
        System.out.println("......");
        System.out.println("   家长签名:   ");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签名:"+name);
    }
}

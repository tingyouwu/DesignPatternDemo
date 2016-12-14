package com.wty.app.designpatterndemo.adapterpattern;

/**
 * @Desc 员工
 **/
public class UserInfo implements IUserInfo{

    @Override
    public String getUserName() {
        System.out.println("姓名叫做......");
        return null;
    }

    @Override
    public String getHomeAddress() {
        System.out.println("家庭地址在......");
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.println("手机号码是......");
        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        System.out.println("办公室电话是......");
        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.println("职位是大boss......");
        return null;
    }

    @Override
    public String getHomeTelNumber() {
        System.out.println("家里电话号码是......");
        return null;
    }
}

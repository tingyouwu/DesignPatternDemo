package com.wty.app.designpatterndemo.adapterpattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @Desc 劳务公司员工
 **/
public class OuterUser implements IOuterUser{
    @Override
    public Map getUserBaseInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("username","这个员工叫王强");
        baseInfoMap.put("mobilenumber","电话号码是.....");
        return baseInfoMap;
    }

    @Override
    public Map getUserOfficeInfo() {
        HashMap officeinfo = new HashMap();
        officeinfo.put("jobPosition","职位是大堂经理......");
        officeinfo.put("officeTelNumber","办公电话是.....");
        return officeinfo;
    }

    @Override
    public Map getUserHomeInfo() {
        HashMap homeinfo = new HashMap();
        homeinfo.put("homeTelNumber","家庭电话是......");
        homeinfo.put("homeAddress","家庭地址是.....");
        return homeinfo;
    }
}

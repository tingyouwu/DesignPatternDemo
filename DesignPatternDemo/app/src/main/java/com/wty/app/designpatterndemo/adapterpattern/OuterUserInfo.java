package com.wty.app.designpatterndemo.adapterpattern;

import java.util.Map;

/**
 * @Desc 劳务公司员工
 **/
public class OuterUserInfo extends OuterUser implements IUserInfo{

    private Map baseinfo = super.getUserBaseInfo();
    private Map homeinfo = super.getUserHomeInfo();
    private Map officeinfo = super.getUserOfficeInfo();

    @Override
    public String getUserName() {
        String username = (String) this.baseinfo.get("userName");
        return username;
    }

    @Override
    public String getHomeAddress() {
        String homeaddress = (String) this.homeinfo.get("homeAddress");
        return homeaddress;
    }

    @Override
    public String getMobileNumber() {
        String mobilenumber = (String) this.baseinfo.get("mobileNumber");
        return mobilenumber;
    }

    @Override
    public String getOfficeTelNumber() {
        String officetelnumber = (String) this.officeinfo.get("officeTelNumber");
        return officetelnumber;
    }

    @Override
    public String getJobPosition() {
        String jobposition = (String) this.officeinfo.get("jobPosition");
        return jobposition;
    }

    @Override
    public String getHomeTelNumber() {
        String username = (String) this.baseinfo.get("userName");
        return username;
    }
}

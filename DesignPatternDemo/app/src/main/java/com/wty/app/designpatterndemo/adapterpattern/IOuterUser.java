package com.wty.app.designpatterndemo.adapterpattern;

import java.util.Map;

/**
 * @Desc 劳务公司员工
 **/
public interface IOuterUser {
    Map getUserBaseInfo();
    Map getUserOfficeInfo();
    Map getUserHomeInfo();
}

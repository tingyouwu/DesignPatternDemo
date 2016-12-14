package com.wty.app.designpatterndemo.compositepattern;

import java.util.List;

/**
 * @Desc 树枝接口
 **/
public interface IBranch extends ICorp{
    //能够增加树叶节点或者树枝节点
    public void addSubordinate(ICorp corp);
    //我还要能够获得下属的信息
    public List<ICorp> getSubordinate();
}

package com.wty.app.designpatterndemo.agentpattern;

/**
 * @Desc 抽象游戏人
 **/
public interface IGamePlayer {
    //登陆游戏
    public void login(String user,String password);
    public void killBoss();
    public void upgrade();
}

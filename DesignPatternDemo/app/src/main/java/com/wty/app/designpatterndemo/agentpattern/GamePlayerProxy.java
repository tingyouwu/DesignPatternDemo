package com.wty.app.designpatterndemo.agentpattern;

/**
 * @Desc 游戏人代理
 **/
public class GamePlayerProxy implements IGamePlayer{

    private IGamePlayer gamePlayer = null;

    public GamePlayerProxy(IGamePlayer player){
        this.gamePlayer = player;
    }

    @Override
    public void login(String user, String password) {
       this.gamePlayer.login(user,password);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
       this.gamePlayer.upgrade();
    }
}

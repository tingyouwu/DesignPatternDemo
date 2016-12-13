package com.wty.app.designpatterndemo.agentpattern;

/**
 * @Desc 游戏人
 **/
public class GamePlayer implements IGamePlayer{

    private String name = "";

    public GamePlayer(String name){
        this.name = name;
    }

    @Override
    public void login(String user, String password) {
        System.out.println("登陆名为"+user+"的用户,"+this.name+"登陆成功");
    }

    @Override
    public void killBoss() {
        System.out.println("在打怪");
    }

    @Override
    public void upgrade() {
        System.out.println("又升了一级");
    }
}

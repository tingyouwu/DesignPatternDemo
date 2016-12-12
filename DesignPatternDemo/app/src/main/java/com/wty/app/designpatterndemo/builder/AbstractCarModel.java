package com.wty.app.designpatterndemo.builder;


import java.util.ArrayList;
import java.util.List;

/**
 * @Desc 抽象小车模型
 **/
public abstract class AbstractCarModel {

    private List<String> sequence = new ArrayList<>();

    public abstract void start();

    public abstract void stop();

    public abstract void alarm();

    public abstract void engineBoom();

    final public void run(){
       for (int i= 0;i<=this.sequence.size();i++){
           String actionName = this.sequence.get(i);
           if(actionName.equalsIgnoreCase("start")){
               this.start();
           }else if(actionName.equalsIgnoreCase("stop")){
               this.stop();
           }else if(actionName.equalsIgnoreCase("alarm")){
               this.alarm();
           }else if(actionName.equalsIgnoreCase("engineboom")){
               this.engineBoom();
           }
       }
    }

    final public void setSequence(ArrayList<String> sequence){
        this.sequence = sequence;
    }

}

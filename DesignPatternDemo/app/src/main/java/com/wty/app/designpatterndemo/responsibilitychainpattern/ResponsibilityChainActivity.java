package com.wty.app.designpatterndemo.responsibilitychainpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.wty.app.designpatterndemo.R;
import com.wty.app.designpatterndemo.strategypattern.BackDoorStrategy;
import com.wty.app.designpatterndemo.strategypattern.BlockEnemyStrategy;
import com.wty.app.designpatterndemo.strategypattern.GiveGreenLigntStrategy;

import java.util.ArrayList;
import java.util.Random;

public class ResponsibilityChainActivity extends AppCompatActivity {

    TextView tv_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_content = (TextView) findViewById(R.id.tv_content);

        Random rand = new Random();
        ArrayList<IWomen> arrayList = new ArrayList<>();
        for(int i = 0;i<5;i++){
            arrayList.add(new Women(rand.nextInt(4),"我要出去逛街"));
        }

        AbsHandler father = new FatherHandler();
        AbsHandler husband = new HusbandHandler();
        AbsHandler son = new SonHandler();
        father.setNext(husband);
        husband.setNext(son);
        for(IWomen women:arrayList){
            father.HandleMessage(women);
        }
    }
}

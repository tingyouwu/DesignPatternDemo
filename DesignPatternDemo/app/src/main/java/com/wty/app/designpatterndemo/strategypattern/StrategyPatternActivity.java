package com.wty.app.designpatterndemo.strategypattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.wty.app.designpatterndemo.R;
import com.wty.app.designpatterndemo.commandpattern.*;
import com.wty.app.designpatterndemo.factorymethod.IHuman;
import com.wty.app.designpatterndemo.factorymethod.human.BlackHuman;
import com.wty.app.designpatterndemo.factorymethod.human.WhiteHuman;
import com.wty.app.designpatterndemo.factorymethod.human.YellowHuman;
import com.wty.app.designpatterndemo.simplefactory.SimpleHumanFactory;

public class StrategyPatternActivity extends AppCompatActivity {

    TextView tv_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_content = (TextView) findViewById(R.id.tv_content);

        Invoker invoker = new Invoker(new BackDoorStrategy());
        invoker.operate();

        Invoker invoker1 = new Invoker(new GiveGreenLigntStrategy());
        invoker1.operate();

        Invoker invoker2 = new Invoker(new BlockEnemyStrategy());
        invoker2.operate();
    }
}

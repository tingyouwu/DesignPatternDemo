package com.wty.app.designpatterndemo.factorymethod;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.wty.app.designpatterndemo.R;
import com.wty.app.designpatterndemo.factorymethod.factory.HumanFactory;
import com.wty.app.designpatterndemo.factorymethod.human.BlackHuman;
import com.wty.app.designpatterndemo.factorymethod.human.WhiteHuman;
import com.wty.app.designpatterndemo.factorymethod.human.YellowHuman;

public class FactoryMethodActivity extends AppCompatActivity {

    TextView tv_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_content = (TextView) findViewById(R.id.tv_content);

        AbstractHumanFactory factory = new HumanFactory();
        //第一次造白人
        IHuman whiteHuman = factory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        IHuman blackHuman = factory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();

        IHuman yellowHuman = factory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}

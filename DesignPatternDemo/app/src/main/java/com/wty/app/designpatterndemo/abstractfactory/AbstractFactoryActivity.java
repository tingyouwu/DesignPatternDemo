package com.wty.app.designpatterndemo.abstractfactory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.wty.app.designpatterndemo.R;
import com.wty.app.designpatterndemo.abstractfactory.factory.FemaleHumanFactory;
import com.wty.app.designpatterndemo.abstractfactory.factory.MaleHumanFactory;

public class AbstractFactoryActivity extends AppCompatActivity {

    TextView tv_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_content = (TextView) findViewById(R.id.tv_content);
        IHumanFactory femaleHumanFactory = new FemaleHumanFactory();
        IHumanFactory maleHumanFactory = new MaleHumanFactory();

        IHuman maleYellowHuman = maleHumanFactory.createYellowHuman();
        maleYellowHuman.getColor();
        maleYellowHuman.getSex();
        maleYellowHuman.talk();

        IHuman femaleBlackHuman = femaleHumanFactory.createBlackHuman();
        femaleBlackHuman.getSex();
        femaleBlackHuman.getColor();
        femaleBlackHuman.talk();

    }
}

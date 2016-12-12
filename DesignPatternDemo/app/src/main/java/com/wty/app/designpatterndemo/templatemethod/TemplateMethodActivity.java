package com.wty.app.designpatterndemo.templatemethod;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.wty.app.designpatterndemo.R;
import com.wty.app.designpatterndemo.factorymethod.IHuman;
import com.wty.app.designpatterndemo.factorymethod.human.BlackHuman;
import com.wty.app.designpatterndemo.factorymethod.human.WhiteHuman;
import com.wty.app.designpatterndemo.factorymethod.human.YellowHuman;
import com.wty.app.designpatterndemo.simplefactory.SimpleHumanFactory;

public class TemplateMethodActivity extends AppCompatActivity {

    TextView tv_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_content = (TextView) findViewById(R.id.tv_content);

        AbstractHummerModel h1 = new HummerH1Model();
        h1.run();

        AbstractHummerModel h2 = new HummerH2Model();
        h2.run();
    }
}

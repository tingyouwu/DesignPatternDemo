package com.wty.app.designpatterndemo.builder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.wty.app.designpatterndemo.R;
import com.wty.app.designpatterndemo.templatemethod.AbstractHummerModel;
import com.wty.app.designpatterndemo.templatemethod.HummerH1Model;
import com.wty.app.designpatterndemo.templatemethod.HummerH2Model;

import java.util.ArrayList;

public class BuilderActivity extends AppCompatActivity {

    TextView tv_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_content = (TextView) findViewById(R.id.tv_content);

        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("start");
        sequence.add("stop");

        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequence(sequence);
        BenzModel benz = (BenzModel) benzBuilder.getCarModel();
        benz.run();

    }
}

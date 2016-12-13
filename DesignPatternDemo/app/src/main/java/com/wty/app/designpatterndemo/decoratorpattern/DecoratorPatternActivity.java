package com.wty.app.designpatterndemo.decoratorpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.wty.app.designpatterndemo.R;
import com.wty.app.designpatterndemo.strategypattern.BackDoorStrategy;
import com.wty.app.designpatterndemo.strategypattern.BlockEnemyStrategy;
import com.wty.app.designpatterndemo.strategypattern.GiveGreenLigntStrategy;

public class DecoratorPatternActivity extends AppCompatActivity {

    TextView tv_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_content = (TextView) findViewById(R.id.tv_content);

        AbsSchoolReport sr;
        sr = new FouthGradeSchoolReport();
        sr = new HighScoreDecorator(sr);
        sr = new SortDecorator(sr);
        sr.report();
        sr.sign("老三");
    }
}

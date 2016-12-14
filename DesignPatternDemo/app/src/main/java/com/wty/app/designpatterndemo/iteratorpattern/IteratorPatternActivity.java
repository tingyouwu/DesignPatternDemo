package com.wty.app.designpatterndemo.iteratorpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.wty.app.designpatterndemo.R;
import com.wty.app.designpatterndemo.strategypattern.BackDoorStrategy;
import com.wty.app.designpatterndemo.strategypattern.BlockEnemyStrategy;
import com.wty.app.designpatterndemo.strategypattern.GiveGreenLigntStrategy;

public class IteratorPatternActivity extends AppCompatActivity {

    TextView tv_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_content = (TextView) findViewById(R.id.tv_content);

        IProject project = new Project();
        project.add("星球大战项目",11,100000);
        project.add("星球大战项目1",2,200000);
        project.add("金刚狼项目1",2,200000);

        IProjectIterator projectIterator = project.iterator();
        while(projectIterator.hasNext()){
            IProject p = (IProject) projectIterator.next();
            System.out.println(p.getProjectInfo());
        }

    }
}

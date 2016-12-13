package com.wty.app.designpatterndemo.commandpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.wty.app.designpatterndemo.R;
import com.wty.app.designpatterndemo.commandpattern.command.AbsCommand;
import com.wty.app.designpatterndemo.commandpattern.command.AddRequirementCommand;
import com.wty.app.designpatterndemo.commandpattern.command.DeletePageCommand;
import com.wty.app.designpatterndemo.factorymethod.AbstractHumanFactory;
import com.wty.app.designpatterndemo.factorymethod.IHuman;
import com.wty.app.designpatterndemo.factorymethod.factory.HumanFactory;
import com.wty.app.designpatterndemo.factorymethod.human.BlackHuman;
import com.wty.app.designpatterndemo.factorymethod.human.WhiteHuman;
import com.wty.app.designpatterndemo.factorymethod.human.YellowHuman;

public class CommandPatternActivity extends AppCompatActivity {

    TextView tv_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_content = (TextView) findViewById(R.id.tv_content);

        Invoker xiaoming = new Invoker();
        AbsCommand command = new AddRequirementCommand();
        xiaoming.setCommand(command);
        xiaoming.action();

        AbsCommand command1 = new DeletePageCommand();
        xiaoming.setCommand(command1);
        xiaoming.action();
    }
}

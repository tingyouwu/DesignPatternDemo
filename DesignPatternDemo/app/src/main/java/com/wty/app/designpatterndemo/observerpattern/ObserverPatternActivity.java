package com.wty.app.designpatterndemo.observerpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.wty.app.designpatterndemo.R;
import com.wty.app.designpatterndemo.observerpattern.observable.HanFeiZi;
import com.wty.app.designpatterndemo.observerpattern.observer.IObserver;
import com.wty.app.designpatterndemo.observerpattern.observer.LiSi;
import com.wty.app.designpatterndemo.observerpattern.observer.WangSi;

public class ObserverPatternActivity extends AppCompatActivity {

    TextView tv_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_content = (TextView) findViewById(R.id.tv_content);
        IObserver lisi = new LiSi();
        IObserver wangsi = new WangSi();
        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.addObserver(lisi);
        hanFeiZi.addObserver(wangsi);

        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }
}

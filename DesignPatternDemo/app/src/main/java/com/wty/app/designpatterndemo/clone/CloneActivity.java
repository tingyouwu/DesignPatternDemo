package com.wty.app.designpatterndemo.clone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.wty.app.designpatterndemo.R;
import com.wty.app.designpatterndemo.factorymethod.IHuman;
import com.wty.app.designpatterndemo.factorymethod.human.BlackHuman;
import com.wty.app.designpatterndemo.factorymethod.human.WhiteHuman;
import com.wty.app.designpatterndemo.factorymethod.human.YellowHuman;
import com.wty.app.designpatterndemo.simplefactory.SimpleHumanFactory;

import java.util.Random;

public class CloneActivity extends AppCompatActivity {

    private static int MAX_COUNT = 6;
    TextView tv_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_content = (TextView) findViewById(R.id.tv_content);

        int i =0;
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("xxx银行版权所有");
        while(i<MAX_COUNT){
            Mail cloneMail = mail.clone();
            cloneMail.setAppellation(getRandString(5)+"先生（女士）");
            cloneMail.setReceiver(getRandString(5)+"@"+getRandString(8)+".com");
            sendMail(mail);
            i++;
        }

    }

    private static void sendMail(Mail mail){
        System.out.println("标题:"+mail.getSubject()+"   收件人:"+mail.getReceiver()+"  发送成功!");
    }

    private static String getRandString(int maxlength){
        String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();
        for(int i =0;i<maxlength;i++){
            sb.append(source.charAt(rand.nextInt(source.length())));
        }
        return sb.toString();
    }

}

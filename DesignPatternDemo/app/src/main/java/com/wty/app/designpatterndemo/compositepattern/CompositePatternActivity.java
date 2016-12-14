package com.wty.app.designpatterndemo.compositepattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.wty.app.designpatterndemo.R;
import com.wty.app.designpatterndemo.templatemethod.AbstractHummerModel;
import com.wty.app.designpatterndemo.templatemethod.HummerH1Model;
import com.wty.app.designpatterndemo.templatemethod.HummerH2Model;

import java.util.List;

public class CompositePatternActivity extends AppCompatActivity {

    TextView tv_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_content = (TextView) findViewById(R.id.tv_content);
        //首先组装一个组织结构出来
        Branch CEO = compositeCorpTree();
        System.out.println(CEO.getInfo());
        System.out.println(getTreeInfo(CEO));
    }

    public Branch compositeCorpTree(){
        //首先来个总经理
        Branch root = new Branch("习大大","总经理",100000);
        //再来三个部门经理
        Branch developDep = new Branch("王大麻子","开发经理",10000);
        Branch salesDep = new Branch("赵大孙子","销售经理",20000);
        Branch financeDep = new Branch("张大疯子","财务经理",30000);

        Branch firstDepGroup = new Branch("吴潇潇","开发一组组长",5000);
        Branch secondDepGroup = new Branch("独孤九剑","开发二组组长",6000);

        //生产小兵
        Leaf a = new Leaf("a","开发人员",2000);
        Leaf b = new Leaf("b","开发人员",2000);
        Leaf c = new Leaf("c","开发人员",2000);
        Leaf d = new Leaf("d","开发人员",2000);
        Leaf e = new Leaf("e","开发人员",2000);
        Leaf f = new Leaf("f","销售人员",2000);
        Leaf g = new Leaf("g","销售人员",2000);
        Leaf h = new Leaf("h","销售人员",2000);
        Leaf i = new Leaf("i","CEO秘书",8000);

        //开始构建组织  ceo 下面有三个经理 加 1个秘书
        root.addSubordinate(developDep);
        root.addSubordinate(salesDep);
        root.addSubordinate(financeDep);
        root.addSubordinate(i);

        //研发经理下面
        developDep.addSubordinate(firstDepGroup);
        developDep.addSubordinate(secondDepGroup);

        //各个小组
        firstDepGroup.addSubordinate(a);
        firstDepGroup.addSubordinate(b);

        secondDepGroup.addSubordinate(c);
        secondDepGroup.addSubordinate(d);
        secondDepGroup.addSubordinate(e);

        salesDep.addSubordinate(f);
        salesDep.addSubordinate(g);
        salesDep.addSubordinate(h);

        return root;
    }

    //遍历
    public String getTreeInfo(Branch root){
        List<ICorp> sublist = root.getSubordinate();
        String info = "";
        for(ICorp corp:sublist){
            if(corp instanceof Leaf){
                info = info + corp.getInfo()+"\n";
            }else{
                info = info + corp.getInfo() + getTreeInfo((Branch) corp);
            }
        }
        return info;
    }
}

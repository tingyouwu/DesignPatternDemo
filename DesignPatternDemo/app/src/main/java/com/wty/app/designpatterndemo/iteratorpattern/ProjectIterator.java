package com.wty.app.designpatterndemo.iteratorpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc 项目迭代器
 **/
public class ProjectIterator implements IProjectIterator{

    private List<IProject> projectList = new ArrayList<>();
    private int currentItem = 0;

    public ProjectIterator(List<IProject> projectList){
        this.projectList = projectList;
    }

    @Override
    public boolean hasNext() {
        if(this.currentItem>=projectList.size() || this.projectList.get(this.currentItem) == null)
            return false;
        return true;
    }

    @Override
    public IProject next() {
        return this.projectList.get(currentItem++);
    }

    public void remove(){

    }

}

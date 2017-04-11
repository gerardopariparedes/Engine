package com.teclab.pari.pariengine;

import android.graphics.Canvas;
import android.support.v7.app.ActionBar;
import android.view.Display;
import android.view.MotionEvent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Heat on 01/11/2016.
 */
public abstract class DisplayContainer extends DisplayObject{

    private List<DisplayObject> children;

    public DisplayContainer(Resources resources){
        super(resources);
        children = new ArrayList();
        numChildren=0;
    }

    @Override

    public void onDraw(){
        for(int i=0;i<numChildren;i++)
            ((DisplayObject)children.get(i)). OnDraw();
    }
    public int addChild(DisplayObject child) {
        children.add(child);
        child.parent = this;
        numChildren = children.size();
        return numChildren;
    }
    public int addChild(DisplayObject child, int index) {
        children.add(index,child);
        child.parent = this;
        numChildren = children.size();
        return numChildren;
    }
    public boolean contains(DisplayObject child) {
        return children.contains(child);
    }
    public DisplayObject getChildAt(int index) {
        return (DisplayObject) children.get(index);

    }

    public int getChildIndex(DisplayObject child) {
        return children.indexOf(child);
    }

    public void removeChild(DisplayObject child)
    {

        children.remove(child);
    }
    public void removeChild(DisplayObject boolean_dispose)
    {

    children.remove(child);
    if(_dispose)
            child.dispose();
}
    public DisplayObject removeChildAt(int index)
    {
        return (DisplayObject)children.remove(index);
    }
    public void removeChildAt(int index, boolen_dispose){

        if(_dispose)
            ((DisplayObject)children.get(index).dispose():
        children.remove(index);

    }
    public void removeChildrens()
    {
        children.clear();
}
    public void removeChildrens(boolean_dispose)
    {
        if(_dispose)
        {
            for(int i=0;i<numChildren;i++)
                ((DisplayObject)children.get(i)).dispose();

        }
        children.clear();
    }
    public void removeChildrens(int begin,int end)
    {
        for(int i=end; i>begin;i--)
            children.remove(i);

    }
    public void removeChildrens(int begin, int end, boolean_dispose)
    {
        for(int i=end; i> begin;i--)
        {
            if(_dispose)
                ((DisplayObject)children.get(i)).dispose();
            children.remove(i);

        }
    }
    public void setChildrenIndex(DisplayObject child, int index) {
        children.remove(child);
        children.add(index, child);

    }
    public void sortChildren(Comparator comparator)
    {
        Collections.sort(children, comparator);

    }
    public void swapChildren(DisplayObject child, DisplayObject child2)
    {
        int index1= children.indexOf(child1);
        int index2= children.indexOf(child2);
        Collections.swap(children,index1,index2);

    }
    public void swapChildrenA(int index1,int index2)
    {
        Collections.swap(children,index1,index2);

    }
    public void dispose()
    {
        for (int i=0;i<numChildren;i++)
        {
            ((DisplayObject)children.get(i)).dispose();
            children.set(i,null);
        }
        children.clear();
        super.dispose();
    }

}



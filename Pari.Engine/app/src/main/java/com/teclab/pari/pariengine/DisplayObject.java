package com.teclab.pari.pariengine;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.animation.Transformation;

/**
 * Created by Heat on 01/11/2016.
 */
public class DisplayObject {

    public int x,y;
    public DisplayObject parent;
    public Resources resources;
     public int height;
    public float opacity;

    public int pivotX;
    public int pivotY;
    public int rotation;
    public float scaleX;
    public float scaleY;
    public Transformation transformation;
    public boolean visible;
    public int width;
    public int X;
    public int Y;



    public DisplayObject(Resources resources){
        this.resources = resources;
    }
  public  void dispatchEvent(Event e){

  }
    public void dispatchEvent(srting type){

    }
    public void dispose(){

    }
    //public Point globalToLocal(Point p){}


    //public Point localToGlobal(Point p){}


   // public abstract void onDraw(){}


    public void primaryOperations() {
    }
public void touchDown(Point p,int index){

}
public void touchMove(Point p, int index){

}
    public void touchUp(Point p, int index){

    }
    public void update(){

    }

    public void onTouchEvent(MotionEvent event) {

    }
}

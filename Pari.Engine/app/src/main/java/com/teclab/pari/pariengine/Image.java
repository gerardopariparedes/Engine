package com.teclab.pari.pariengine;

import android.graphics.Bitmap;
import android.graphics.Canvas;


public class Image extends DisplayObject {

    private Bitmap bmp;

    String key;


    public void Image(String _key, String _tag, int Source, Resource _resources)
    {

        this.resources = _resource;
        this.key = _key;
        resources.LoadTexture(this.key, Source);


    }


    public void onDraw() {
      Paint p =new Paint();
        canvas.drawBitmap(  resources.getTexture(key), this.x,this.y, p);

        (int)(leftcorner=this.x-(width*0.5f));
    }

}
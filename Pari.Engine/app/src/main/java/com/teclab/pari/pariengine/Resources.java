package com.teclab.pari.pariengine;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by Heat on 02/11/2016.
 */
public class Resources {
    private HashMap texturePool;
    public SoundManager sounds;
    public Context mContext;
    public int fps;
    public Canvas canvas;
    public PointF aspect;
    private String hashkey;
    private GameView view;

    public Resources(Context_ context)
    {
        fps=32;
        hashkey="";
        mContext= _context;
        texturePool=new HashMap();
        sounds=new SoundManager(_context);

    }
    public void loadTexture(Sting key, int resource)
    {
        if(!texturePool.containsKey(key))
        {
            Bitmap bmp =null;
            bmp=BitmapFactory.decodeResource(mContext.get.Resources(), resource);
                    texturePool.put(key, bmp);

        }
    }
    public void unloadTexture(String key)
    {
        ((Bitmap)texturePool.get(key)).recycle();
        texturePool.remove(key);

    }
    public Bitmap getTexture(String key)
    {
        return (Bitmap)texturePool.get(key);

    }
    public boolean isOnline()
    {
        ConnectivituManager cm=(ConnectivityManager)mContext.getSystemService("connective");
        NetworkInfo netInfo=cm.getActiveNetworkInfo();
        return netInfo !=null && netInfo.isConnectedOrConnecting();
    }



























    private HashMap<String,Bitmap> pool;

    public Resources(GameView view){
        this.view = view;
        pool  = new HashMap<String, Bitmap>();
    }

    public Bitmap getBmp(String resource){
        if(!this.pool.containsKey(resource)){
            this.pool.put(resource, BitmapFactory.decodeResource(this.view.getResources(),this.view.getResources().getIdentifier(resource , "drawable", this.view.getContext().getPackageName())));
        }

        return this.pool.get(resource);
    }

    public Bitmap removeBmp(String resource){
        return this.pool.remove(resource);
    }

}

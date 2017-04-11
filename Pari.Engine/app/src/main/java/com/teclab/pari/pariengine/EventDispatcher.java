package com.teclab.pari.pariengine;

import java.util.ArrayList;

/**
 * Created by Alumno on 11/04/2017.
 */

public class EventDispatcher {
    private List listeners;


    public EventDispatcher(){
        listeners=new ArrayList();
    }

    public void addEventListener(String type){
        listeners.add(type);
    }

    public void dispatchEvent(Event e){
        if(e.target==null)
            e.target=this;
        for(int i=0;i<listeners.size();i++)
            if(((String)listeners.get(i)).equals(type))
                recieveEvent(e);

    }
    public void dispatchEvent(String type){

        Event e=new Event(type);
        if(e.target==null)
            e.target=this;
        for(int i=0;i<listeners.size();i++)
            if(((String)listeners.get(i)).equals(type))
                recieveEvent(e);

    }
    public void dispose(){
        listeners.clear();
    }
    public recieveEvent(Event e){

    }
    public removeEventListener(String type){
        listeners.clear();

    }
    public removeEventListeners(){
        listeners.remove(type);

    }

}

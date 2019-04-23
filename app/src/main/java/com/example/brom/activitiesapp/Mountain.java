package com.example.brom.activitiesapp;

import android.location.Location;

public class Mountain {
    //Skapa statements här
    private String name;
    private String location;
    private int height;

    //standard konstruktor
    public Mountain(){
        name="Saknar namn";
        location="Saknar Plats";
        height=-1;
    }

    public Mountain(String n, String l,int h){
        name=n;
        location=l;
        height=h;
    }

    public String info(){
        String tmp=new String();
        tmp+=name+" is located in mountain range "+location+" and reaches "+height+"m";
        return tmp;
    }

    public void setHeight (int h) {height = h;}

    public int getHeight(){return height;}

    public void setLocation (String l) { location = l;}

    public String getLocation(){return location;}

    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return name;
    }



}

package com.techsect.clashmate.models;

import com.techsect.clashmate.commons.Constants;

/**
 * Created by hitenpratap on 4/8/15.
 */
public class SliderMenuItem {

    private String title;
    private int icon;
    private String count = "0";
    private boolean isCounterVisible = false;

    public SliderMenuItem(){}

    public SliderMenuItem(String title, int icon){
        this.title = title;
        this.icon = icon;
    }

    public SliderMenuItem(String title, int icon, boolean isCounterVisible, String count){
        this.title = title;
        this.icon = icon;
        this.isCounterVisible = isCounterVisible;
        this.count = count;
    }

    public String getTitle(){
        return this.title;
    }

    public int getIcon(){
        return this.icon;
    }

    public String getCount(){
        return this.count;
    }

    public boolean getCounterVisibility(){
        return this.isCounterVisible;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setIcon(int icon){
        this.icon = icon;
    }

    public void setCount(String count){
        this.count = count;
    }

    public void setCounterVisibility(boolean isCounterVisible){
        this.isCounterVisible = isCounterVisible;
    }

}

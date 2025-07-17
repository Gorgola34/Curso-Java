package com.cdsb.serializacion.Example;
public class Bike {

    public String color;
    public String model;
    public int gears;
    public boolean isCustomizable;

    public Bike(){

    }

    public Bike(String color, String model, int gears,boolean isCustomizable){
        this.color=color;
        this.model=model;
        this.gears=gears;
        this.isCustomizable=isCustomizable;
    }

}

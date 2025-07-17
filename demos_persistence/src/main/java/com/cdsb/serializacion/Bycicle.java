package com.cdsb.serializacion;

public class Bycicle {

     public String brand;
     public String model;
     public String color;
     public int gears;
     public  boolean isCustomizable;

    public Bycicle(){
        //Constructor por defecto para la serialización
    }

    public Bycicle(String brand, String model, String color, int gears,boolean isCustomizable){
        this.brand=brand;
        this.model=model;
        this.color=color;
        this.gears=gears;
        this.isCustomizable=isCustomizable;
    }

    @Override
    public String toString() {
        return "Bycicle [brand=" + brand + ", model=" + model + ", color=" + color + ", gears=" + gears
                + ", isCustomizable=" + isCustomizable + "]";
    }




}

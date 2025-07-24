package Demos.OOP.House;

import java.util.ArrayList;

public class House {

    public static ArrayList<Room> list= new ArrayList<>();

    public void add(){
        list.add(new Room("Salon"));
        list.add(new Room("Cocina"));
        list.add(new Room("Desvan"));
    }

    public ArrayList<Room> getRoom(){
        return list;
    }

}

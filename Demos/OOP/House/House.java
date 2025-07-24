package Demos.OOP.House;

import java.util.ArrayList;

public class House {

    public static ArrayList<Room> list= new ArrayList<>();

    public void add(){
        list.add(new Room("Salón"));
        list.add(new Room("Cocina"));
        list.add(new Room("Desvan"));
        list.add(new Room("Garaje"));
        list.add(new Room("Baño"));
        list.add(new Room("Dormitorio"));
        list.add(new Room("Despacho"));
    }

    public void addRoom(Room room){
        list.add(room);
    }

    public ArrayList<Room> getRoom(){
        return list;
    }

}

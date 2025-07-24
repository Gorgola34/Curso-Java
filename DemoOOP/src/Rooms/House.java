package Rooms;
import java.util.*;

public class House {

    private ArrayList<Room> list= new ArrayList<>();



    public House (){
        list.add(new Room("Cocina"));
        list.add(new Room("Sala de estar"));
        list.add(new Room("Dormitorio"));

    }

    public ArrayList<Room> getRooms(){
        return list;
    }

}


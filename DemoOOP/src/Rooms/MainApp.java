package Rooms;
import java.util.ArrayList;

public class MainApp {

     public static void showRooms(ArrayList<Room> list){
        for(Room l:list){
            System.out.println(l.getName());
        }

    }

    public static void main(String[] args) {
        House h= new House();
        ArrayList<Room> list = h.getRooms();
        showRooms(list);


    }

}

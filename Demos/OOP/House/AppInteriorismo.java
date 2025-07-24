package Demos.OOP.House;

public class AppInteriorismo {

    public static void main(String[] args) {
        House h1= new House();

       h1.add();

   for(Room r:h1.getRoom()){
    System.out.println(r.getName());
   }

       }
        

    }



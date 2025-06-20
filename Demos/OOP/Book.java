package Demos.OOP;
import java.util.ArrayList;

public class Book {
    public static int idb=0;
    public static ArrayList<Book> listBook=new ArrayList<>();
    int id;
    String title;
    String author;
    int year;

    public Book(String title,String author,int year){
        idb++;
        this.id=idb;
        this.title=title;
        this.author=author;
        this.year=year;
        listBook.add(this);
    }
    public static void show(){
        for(Book b:listBook){
            System.out.println(b.title);
        }
    }
   

    
    
}

package Demos.OOP;
import java.util.*;

public class Book {

    public static ArrayList<Book> library= new ArrayList<>();
    public static int num=0;
    int id;
    String title;
    String author;
    boolean lend;

    public Book(String title, String author, boolean lend){

        num++;
        this.id=num;
        this.title=title;
        this.author=author;
        this.lend=lend;

        library.add(this);

    }

    public static void seek(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduzca autor");
        String seekAuthor=scanner.nextLine();
        for(Book b: library){
            if(b.author.contains(seekAuthor)){
                System.out.println(b.title);
               
            }
        }

    }
    public static void showLibrary(){
       
        for(Book b: library){
             String message=b.lend?"Si":"No";
            System.out.println("""
                    Id   %s
                    Title %s
                    Author %s
                    ¿Prestado? %s
                    """.formatted(b.id,b.title,b.author,message));
        }
    }

     

}

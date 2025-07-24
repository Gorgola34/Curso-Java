package Demos.OOP;
import java.util.*;

public class Book {

    public static int num=0;
    public static List<Book> bookList= new ArrayList<>();

    int id;
    String title;
    String author;
    Type type;
    boolean isBorrowed;

    public Book(String tittle, String author, Type type, boolean isBorrowed){
        num++;
        this.id=num;
        this.title=tittle;
        this.author=author;
        this.type=type;
        this.isBorrowed=isBorrowed;
        bookList.add(this);

    }
    public static void seekAuthor(){
        Scanner scanner= new Scanner(System.in);
            String seek=scanner.nextLine();
        for(Book b:bookList){
            
            if(b.author.equalsIgnoreCase(seek)){
                System.out.println(b.title);
            }
        }
    }
    public  boolean lend(){
        for(Book b:bookList){
            if(!b.isBorrowed){
                b.isBorrowed=true;
                return true;
            }
        }
        return false;
    }
    public  boolean returnBook(){
        for(Book b:bookList){
            if(b.isBorrowed){
                b.isBorrowed=false;
                return true;
            }
        }
        return false;
    }
    public static void showBooks(){
        for(Book b: bookList){
            String message=b.isBorrowed?"Si":"No";
            System.out.println("""
                    Id      %s
                    Title   %s
                    Author  %s
                    Type    %s
                    ¿Prestado?   %s
                    """.formatted(b.id,b.title,b.author,b.type,message));
        }
    }


    
}

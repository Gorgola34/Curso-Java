package Demos.OOP;
import java.util.*;

public class Book {

    public static ArrayList<Book> x= new ArrayList<>();
    public static int num=0;

    int id;
    String title;
    String author;
    Type type;
    boolean isBorrowed;

    public Book(String title,String author, Type type, boolean isBorrowed){

        num++;
        this.id=num;
        this.title=title;
        this.author=author;
        this.type=type;
        this.isBorrowed=isBorrowed;

        x.add(this);
    }
    public static void seekAuthor(){
        Scanner scanner=new Scanner(System.in);
        String seek = scanner.nextLine();
        scanner.close();
        for(Book b:x){
            if(b.author.equals(seek)){
                System.out.println(b.title);
                System.out.println(b.isBorrowed);
            }
        }
    }

    public static boolean lend(){
        for(Book b:x){
            if(b.isBorrowed=false){
                return true;
            }
        }
        return false;
    }

    public static boolean returnBook(){
        for(Book b:x){
            if(b.isBorrowed=true){
                return true;
            }
        }
        return false;
    }

    public static void show(){
        for(Book b:x){
            String message=b.isBorrowed?"Si":"No";
            System.out.println("""

            Id        %s
            Title     %s
            Author    %s
            Type      %s
            ¿Borrowed? %s
                    
                    """.formatted(b.id,b.title,b.author,b.type,message));
        }
    }

    

     

}

package Demos.OOP;
public class Library {

    public static void main(String[] args) {

        Book b1= new Book("Adventures", "JP", Type.Novela, false);
        Book b2=new Book("Panic at home", "MaRy L",Type.Comic,true);

        Book.seekAuthor();
        System.out.println("---------");
        System.out.println(b1.lend());
        System.out.println(b1.returnBook());
        System.out.println("---------------");
        Book.show();

       
    }

    

 
       
    }



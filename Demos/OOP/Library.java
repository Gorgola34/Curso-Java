package Demos.OOP;

public class Library {

    public static void main(String[] args) {
        Book b1= new Book("Adventures", "JKR", Type.Novela, true);
        Book b2= new Book("Panic at b", "Mayu", Type.Biografía, true);

        Book.seekAuthor();
        System.out.println("----------");
        System.out.println(b1.lend());
        System.out.println("----------");
       System.out.println(b2.returnBook());
        System.out.println("----------");
        Book.showBooks();
    }
    
}

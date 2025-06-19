package Demos.ExtraExercises;

public class Book {

    String title;
    String author;
    int publicationYear;

    public Book(String title, String author, int publicationYear){
        this.title=title;
        this.author=author;
        this.publicationYear=publicationYear;
        

    }
    public void showInfo(){
        System.out.printf("El titulo del libro es: %s, el autor es: %s y se publicó en el año: %s", title,author,publicationYear);
    }

    
}

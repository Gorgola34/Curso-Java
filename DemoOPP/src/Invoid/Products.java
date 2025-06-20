package Invoid;

public class Products {

    private String description;
    private double price;


    public Products(String description, double price){
        this.description=description;
        this.price=price;
    }
    public void showProducts(){
        System.out.println("""
                Description    %s
                Price          %s
                """.formatted(description,price));
    }

}

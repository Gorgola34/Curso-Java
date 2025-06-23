package Invoid;
import java.util.*;
public class Invoid {

    public static ArrayList<Item> itemList = new ArrayList<>();
    private Pay pay;
    private double totalPrice;
    private String client;
    private double iva;


    public Invoid(Pay pay, String client, double iva,double totalPrice){
        this.pay=pay;
        this.client=client;
        this.iva=iva;
        this.totalPrice=totalPrice;
        
    }

    public void showInvoid(){
        System.out.println("""
                Pay     %s  EU
                Client  %s  EU
                IVA     %s  EU
                Price   %s  EU
               
                """.formatted(pay,client,iva,totalPrice));
    }

     public static double total(double iva,double totalPrice){
        double total=iva*totalPrice;
        return total;
    }
   

}

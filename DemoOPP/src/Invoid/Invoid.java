package Invoid;

public class Invoid {
    private Pay pay;
    private double price;
   private String client;
    private double iva;


    public Invoid(Pay pay, String client, double iva,double price){
        this.pay=pay;
        this.client=client;
        this.iva=iva;
        this.price=price;
    }

    

    public void showInvoid(){
        System.out.println("""
                Pay     %s  EU
                Client  %s  EU
                IVA     %s  EU
                Price   %s  EU
               
                """.formatted(pay,client,iva,price));
    }

     public static double total(double iva,double price){
        double total=iva*price;
        return total;
    }
   

}

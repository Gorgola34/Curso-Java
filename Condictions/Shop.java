package Condictions;
import java.util.Scanner;
public class Shop {

    public static void main(String[] args) {
       int priceTroussers=10;
       int priceShirts=15;
       Scanner scanner=new Scanner(System.in);
       System.out.println("Dime el numero de camisetas");
       int shirtsPackage=scanner.nextInt();
       System.out.println("Dime el numero de pantalones");
       int troussersPackage=scanner.nextInt();
       int totalPackages=shirtsPackage+troussersPackage;

       double discount=0;
       int shippment=0;

       if(totalPackages<5){
            System.out.println("No hay venta");
            return;
       } else if(totalPackages<10){
            discount=0.05;
            shippment=10;
       } else if(totalPackages<20){
            discount=0.1;
            shippment=5;
       } else{
            discount=0.15;
       }

       double totalPrice=(troussersPackage*priceTroussers)+(shirtsPackage*priceShirts);
       double totalShippment=totalPackages*shippment;
       double totalDiscount=totalPackages*discount;
       double fullPrice=totalPrice+totalShippment+totalDiscount;

       if(fullPrice>1000){
        discount=0.1;
       }else{
        System.out.println("No se ha llegado, queda: " + (1000-fullPrice));
       }
       double extraDiscount=fullPrice-(fullPrice*discount);


       System.out.println("""
        Precio total  %.2f
        Coste del envío %.2f
        Descuento aplicado %.2f
        ------------------------
        Total de la compra %.2f
        ------------------------
        Total con la promoción %.2f
               
               """.formatted(totalPrice,totalShippment,totalDiscount,fullPrice,extraDiscount));





    }
    
}

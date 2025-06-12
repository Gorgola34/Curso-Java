package Conditions;
import java.util.*;
public class Shop2Modify {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Camisetas: ");
        int shirts=scanner.nextInt();
        System.out.println("Troussers");
        int troussers=scanner.nextInt();
        double PriceTroussers=2;
        double PriceShirts=14;
        double TotalPrice=PriceTroussers+PriceShirts;

        int clothes=shirts+troussers;
        double discount1=0.05;
        double discount2=0.1;
        double discount3=0.15;
        int shippment1=10;
        int shipment2=5;

    double total=clothes*TotalPrice;
        double TotalDiscount=total-(clothes*discount1);
        double TotalDiscount2=total-(clothes*discount2);
        double TotalDiscount3=total-(clothes*discount3);
        int TotalShipment1=clothes*shippment1;
        int TotalShipment2=clothes*shipment2;
        double FullPrice=0;
        System.out.println("Precio con descuento y costes de envio: ");

        if(clothes<5){
            System.out.println("No venta");
            return;
        }else if(clothes<10){
            FullPrice=TotalDiscount + TotalShipment1;
            System.out.println(FullPrice);
            
        }else if(clothes<20){
            FullPrice=TotalDiscount2 + TotalShipment2;
            System.out.println(FullPrice);
        }else {
            FullPrice=TotalDiscount3;
            System.out.println(FullPrice);
        }

        if(FullPrice<1000){
              double x=1000-FullPrice;
            System.out.println("Falta para llegar a la promoción:  " + x);
          

        }else { 
            double FullPriceDiscount=FullPrice-(FullPrice*0.2);
            System.out.println("Descuento a compras mayores de 1000");
            System.out.println(FullPriceDiscount);

        }


        
    }
    
}

package Conditions;
import java.util.*;
public class Shop {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introducir paquetes: ");
        int packages=scanner.nextInt();
        scanner.close();
        double price=20;
        double discount=0;
        int shippment=0;
        
       if(packages<5){
        System.out.println("No venta");
        return;
       }else if(packages<10){
         discount=0.05;
         shippment=10;
       }else if(packages<20){
         discount=0.10;
         shippment=15;
       }else{
          discount=0.15;

       }
        double FullPrice=price*packages;
        double DiscountFull=FullPrice*discount;
        double FullShipment=FullPrice*shippment;
        double total= FullPrice +DiscountFull + FullShipment;

        System.out.println("""
            Precio total producto %.2f EU
            Descuento aplicado %.2f EU
            Gastos de envio %.2f EU
            -----------------------
            TOTAL                %.2f EU
                
                """.formatted(FullPrice, DiscountFull,FullShipment, total));
        
    }

    
        
    }

    


package Demos.Condictions;
import java.util.*;
public class Shop {

    public static int scannerby(){
        Scanner scanner= new Scanner(System.in);
        int packages=scanner.nextInt();
        return packages;

    }
    public static void main(String[] args) {
        int packages=scannerby();
        int price=5;
        double discount=0;
        int shippment=0;
        if(packages<5){
            System.out.println("No hay venta");
            return;
        }else if(packages<10){
            discount=0.05;
            shippment=10;
        }else if(packages<20){
            discount=0.1;
            shippment=5;
        }else{
            discount=0.15;
        }
        double pricePack=price*packages;
        double totalShip=packages*shippment;
        double discountPack=pricePack*discount;
        double totalPrice=pricePack+totalShip-discountPack;
        double totalPromotion;

        if(totalPrice>1000){
            discount=0.1;
             totalPromotion=totalPrice -(totalPrice*discount);
             System.out.println("""
                PAGAR     %s
                ENVIO     %S
                DESCUENTO %S
                ----------------
                TOTAL      %s
                ----------------
                TOTAL PROMOCION  %s
                """.formatted(pricePack,totalShip,discountPack,totalPrice,totalPromotion));
        }else{
            
             System.out.println("""
                PAGAR     %s
                ENVIO     %S
                DESCUENTO %S
                ----------------
                TOTAL      %s
                ----------------
                NO HAY PROMOCION
                """.formatted(pricePack,totalShip,discountPack,totalPrice));
        }

        
    }
    
}

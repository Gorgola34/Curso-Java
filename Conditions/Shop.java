package Conditions;
import java.util.*;
public class Shop {

    public static void main(String[] args) {
        int price=5;
        String[] x={
            "No se puede realizar la venta",
            "Se te aplica un 5% de descuento y el coste de envío es de 10 euros/paquete " + (15-(15*0.05)),
            "Se te aplica un 10% descuento y coste envío es de 5 euros/paquete" + (10 -(10*0.1)),
            "Se te aplica un 15% descuento y envío gratuito " + (5-(5*0.15))
        };
        int index;
        Scanner scanner=new Scanner(System.in);
        int packages=scanner.nextInt();
        scanner.close();
        if(packages<5){
            index=0;      
        }else if(packages<10){
            index=1;
        }else if(packages>=10&&packages<=20){
            index=2;
        }else{
            index=3;
        }
        System.out.println(x[index]);

        }
        
    }

    


package Funciones;
import java.util.*;
public class Volumen {

    public static double scannerBy(){
        Scanner scanner=new Scanner(System.in);
        double r=scanner.nextInt();
        return r;

    }

    public static double scannerBy2(){
        Scanner scanner=new Scanner(System.in);
        double h=scanner.nextInt();
        return h;
    }

    public static double volumen(double h,double r){
         final double pi=3.14;
        double v=(pi*r*r*h)/3;
        return v;
    }


    public static void main(String[] args) {
        double r=scannerBy();
        double h=scannerBy2();
        System.out.println(volumen(h,r));
        
    }
    
}

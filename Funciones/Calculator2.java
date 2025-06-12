package Funciones;

public class Calculator2 {

    public static double op(double n){
        double result= n*n*n;
        return result;
    }
    public static double op(double b,double h){
        double result=b*h;
        return result;
    }
    public static double multiply(double  n,double n2){
        double result=n*n2;
        return result;

    }

    public static void showOperation(double result){
        System.out.println("Resultado: " + result);
    }

    public static void main(String[] args) {
        showOperation((op(5)));
        showOperation((op(3,5)));
        showOperation((multiply(4, 6)));
        
    }

    
        
       
        
    }

    


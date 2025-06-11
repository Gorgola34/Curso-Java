package Operators;

public class AgeGreeting {

    public static void main(String[] args) {
         if(args.length==0) {
            System.out.println("Se acabo, dime la edad");
            return;
        }
        int age=Integer.valueOf(args[0]);
        if(age>=0&&age<18){
            System.out.println("Niño");
        }else if(age>=18&&age<=33){
            System.out.println("Joven");
        }else if(age>=34&&age<65){
            System.out.println("Adulto");
        }else{
            System.out.println("Jubilado");
        }

   
    
}
}

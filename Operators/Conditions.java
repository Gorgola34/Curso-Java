package Operators;

public class Conditions {

    public static void main(String[] args) {

        if(args.length==0) {
            System.out.println("Se acabo, dime la edad");
        }else{
            int age=Integer.valueOf(args[0]);
            System.out.println("Tu edad es " + age);
        }

        
        
    }

    
    
    
}

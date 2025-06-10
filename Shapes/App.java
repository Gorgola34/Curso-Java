package Shapes;

import Funciones.Calculator;

public class App {

    public static void main(String[] args) {


        int[] numbers={101,299,345};
        System.out.println(numbers.length);
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

         System.out.println("-------");

            System.out.println(args[0]);
            System.out.println(args[1]);
            int num1=Integer.valueOf(args[0]);
            int num2 =Integer.valueOf(args[1]);
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(args.length);
            int result= Calculator.multiply(num1, num2);
            System.out.println(result);
            int result2=Calculator.subtraction(num1,num2);
            System.out.println(result2);

           
        }
       
            
        }
    

    


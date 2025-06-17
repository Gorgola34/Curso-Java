package IterationWhile;
import java.util.Random;

public class BucleWhile {

    public static void whileSampleWithCounter(){
        boolean sentinel= true;
        int i=0;

         while(sentinel){
            i++;
            Random random= new Random();
            int number= random.nextInt(9);
            if(number%2==0){
                continue;
            }
            System.out.printf("Número %s = %s", i, number);
            System.out.println("Número" + number);
            if(number== 7){
                sentinel=false;  
            }
         }

    }

    public static void whilesecuencia(){
        int x=10;
        while(x>=0){
            System.out.println("Valor" + x);
            x--;
        }
    }

    public static void forSample(){

        int number=0;
        
        for(int i=0;i!=7; i++){
            Random random= new Random();
            number= random.nextInt(9);
            if(number%2==0){
                continue;
            }   
        }
        }
        public static void main(String[] args) {

            whilesecuencia();

            String sample= "Hola";
            sample.charAt(2);
            // sample.

            String [] samples;  
        }
    }


    


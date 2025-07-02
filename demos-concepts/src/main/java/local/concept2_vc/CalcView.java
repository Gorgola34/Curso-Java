package local.concept2_vc;

import java.util.Scanner;

public class CalcView extends Calc {

    public void show(){
        Scanner scanner= new Scanner(System.in);
        
        boolean want=true;
        while (want) {
            System.out.println("¿Seguir jugando?");
            int answer=scanner.nextInt();
            if(answer==0){
                want=false;

            } else if(answer==1){
                System.out.println("Dime el primer numero");
                
            }else if(answer==2){}
            System.out.println("Dime el segundo numero");
            
            }

             System.out.println("Gracias por jugar");
            
        }
      
        }



    







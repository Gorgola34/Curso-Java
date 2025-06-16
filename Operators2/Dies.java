package Operators2;
import java.util.Random;
public class Dies {

    public static int secuencia(){
        Random random=new Random();
        int s=random.nextInt(7);
        return s;

    }
    
    

    public static void main(String[] args) {
        for(int i=1;i<=3;i++){
             System.out.println(secuencia());

        }
       
        
    }

}
    


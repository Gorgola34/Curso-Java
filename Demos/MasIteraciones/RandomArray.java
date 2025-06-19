package Demos.MasIteraciones;

import java.util.Random;
public class RandomArray {

    public static void main(String[] args) {

        int [][] numbers=new int [4][4];
        Random random=new Random();
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers[i].length;j++){
                numbers[i][j]=random.nextInt(20);

            }
            

        }
        for(int[] row:numbers){
            for(int j:row)
            System.out.println(j);

        }
        
    }
    
}

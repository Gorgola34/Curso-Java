package Demos.ExtraExercises;
public class PrintArray {

    public static void main(String[] args) {

        int [][] x= new int [3][3];
        x [0][0]=2;
        x [0][1]=6;
        x [0][2]=10;
        x [1][0]=30;
        x [1][1]=45;
        x [1][2]=100;
        x [2][0]=80;
        x [2][1]=40;
        x [2][2]=50;

        System.out.println(x[0][0]);
        System.out.println(x[1][1]);
        System.out.println(x[2][2]);
        System.out.println("-----------");
        System.out.println(x [0][2]);
        System.out.println(x [1][1]);
        System.out.println(x [2][0]);
        System.out.println("--------");
        for(int[] row:x){
            for(int j:row){
                System.out.print(" " + j);
            }

        }
        
    }
    
}

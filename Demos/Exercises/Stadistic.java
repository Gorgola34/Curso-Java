package Demos.Exercises;

public class Stadistic {

    public static int sum(int [] data){
        
        int sum=0;
        for(int i=0;i<=data.length;i++){
            sum+=i;
        }
        return sum;

    }
    public static double averageArray(int[] data){
        double average =(double)sum(data)/data.length;
        return average;
    }

    public static void main(String[] args) {
        int [] data={2,4,5,6,7,8};
        System.out.println("La media es:" + averageArray(data));
        
    }
    
}

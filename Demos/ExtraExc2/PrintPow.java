package Demos.ExtraExc2;
import java.util.*;
public class PrintPow {

    public static int scannerby(){
        Scanner scanner= new Scanner(System.in);
        int n=scanner.nextInt();
        return n;
    }
    public void showPow(int n){
        for(int i=0;i<=10;i++){
            System.out.printf("%s ^ %s\n",n,i);

        }
    }
    public static void main(String[] args) {
        PrintPow pp= new PrintPow();
        int n=scannerby();
        pp.showPow(n);

    }
    
}

package IterationWhile;
import java.util.Scanner;
public class factorizar {


        public static int scannerBy(){
            Scanner scanner=new Scanner(System.in);
            int n=scanner.nextInt();
            scanner.close();
            return n;

        }
        public static int factorizar(int n){

            int factorizar=1;
            for(int i=factorizar;i<=n;i++){
                factorizar*=i;
            }
            return factorizar;

        }

        public static void main(String[] args) {
            int n=scannerBy();
            System.out.println(factorizar(n));
        }



        
    }



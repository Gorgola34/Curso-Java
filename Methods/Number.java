package Methods;
public class Number {

    double num;

    public Number(){

    }
    public static boolean esPar(double num){
        if(num%2==0){
            return true;

        }
        return false;
        

    }
    public static boolean esPrimo(double num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static double Factorial(double num){
        int factorial=1;
        for(int i=factorial;i<=num;i++){
            factorial*=i;
            
        }
        return factorial;
        }
        public static double Raiz(double num){
            double r=Math.sqrt(num);
                return r;
            }
            public static double Suma_digitos(double num){
                double suma=0;
                while(num>0){
                    suma+=num%10;
                    num/=10;
                }
                return suma;
            }

        }
      
    


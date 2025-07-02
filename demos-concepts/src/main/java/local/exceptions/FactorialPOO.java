package local.exceptions;

public class FactorialPOO {

   public static final int n=10;

   public int factorial(){
    int factor=1;
    for(int i=factor;i<=n;i++){
        factor*=i;
    }
    return factor;

   }
   public void tryCatch(){
    try {
        if(n<0){
            throw new IllegalArgumentException();
        }
        if(n>20){
            throw new IndexOutOfBoundsException();
        }

    } catch (IllegalArgumentException e) {
        System.out.println("No numeros negativos como " + n);
    }catch(IndexOutOfBoundsException e){
        System.out.println("No numeros mas grandes de 20");
    }finally{
        System.out.println("Programa iniciado");
    }

    }

   public static void main(String[] args) {
    FactorialPOO f = new FactorialPOO();
    System.out.println(f.factorial());
    f.tryCatch();
   }
    
}

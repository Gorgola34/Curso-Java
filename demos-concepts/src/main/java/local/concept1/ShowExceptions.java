package local.concept1;

//Ejemplos de expecciones runtime
//provocadas para probarlas
//!! Código con errores
// IndexOutOfBoundsException
// NullPointerException
public class ShowExceptions {

    public static void make(){
         String name="Pepe";
         System.out.println(name.charAt(10));
    }


    public static void main(String[] args) {
        ShowExceptions se= new ShowExceptions();
        se.make();
    }
   
}

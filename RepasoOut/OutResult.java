package RepasoOut;

public class OutResult {
    // Formas de imprimir en consola
    public static void main(String[] args) {

        String car="Rojo";
        int carAge=10;
        String name="Maria";
        System.out.printf("Hola %s, tú coche es de color %s y tiene %s años",name,car,carAge);
        System.out.println();
        String result="Hola"+name+", tú coche es de color"+ car+" y tiene" +carAge+ "años";
        System.out.println(result);
        

        
    }
    
}

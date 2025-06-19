package Demos.RepasoOut;


public class Out {
    // Formas de imprimir en pantalla guardándolo en variable

    public static void main(String[] args) {

        String name="Pepe";
        String surname= "Perez";
        int age=33;

        System.out.println("Hola " + name +" "+ surname + "\n ¿Como estás a tus"+""+" " +age+" " +"años");
        System.out.printf("Hola %s %s\n como estás a tus %s años", name, surname, age);
        //Template String
        System.out.println();
        System.out.println("------");
        System.out.println("""
                Hola %s %s
                ¿Como estás a tus %s años?
                """.formatted(name,surname,age));
        
    }
    
}

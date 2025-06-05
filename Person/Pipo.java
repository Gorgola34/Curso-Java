package Person;

public class Pipo {

    public static void main(String[] args) {
        int age=23;
        double height=1.84;
        String name="Pipo";
        double weight=64.6;
        boolean hasHouse=true;
        short birthYear=2010;
        char letter='M';
        System.out.println("""
                Nombre: %s
                Edad %s
                Peso: %s
                Altura: %s
                ¿Tiene una casa?: %s
                Año de nacimiento: %s
                Letra favorita %s
                """.formatted(name,age,weight,height,hasHouse,birthYear,letter));

    }
    
}

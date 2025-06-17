package MasIteraciones;
import java.util.Scanner;
public class MatrixUser {

    public static String scannerBy(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dime el animal");
        String name=scanner.nextLine();
        return name;    
        }

        public static void show(){

        String [][] animals= new String[2][2];
        animals[0][0]=scannerBy();
        animals[0][1]=scannerBy();
        animals[1][0]=scannerBy();
        animals[1][1]=scannerBy();
        System.out.println("----------");

        System.out.println("Aqui tienes tus animales");

        for(String[] animal:animals){
            for(String i:animal){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        show();

    }
        
        
    }


    


    



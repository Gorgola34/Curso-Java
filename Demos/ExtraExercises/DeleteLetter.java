package Demos.ExtraExercises;
import java.util.*;
public class DeleteLetter {

    public static String scanner(){
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        scanner.close();
        return name;
    }
    public static String delete(String name){
        String result="";
        for(int i=1;i<=name.length()-2;i++){
            result+=name.charAt(i);

        }
        return result;
    }
    public static void main(String[] args) {
        String name=scanner();
        name=name.toLowerCase();
        System.out.println(delete(name));
    }

   

    }
    


package Demos.ExtraExercises;
import java.util.*;
public class StringRun {

    public static String scannerby(){
        Scanner scanner= new Scanner(System.in);
        String name=scanner.nextLine();
        return name;
    }
    public static String reverse(String name){
        String result="";
        for(int i=name.length()-1;i>=0;i--){
            result+=name.charAt(i);

        }
        return result;
    }
    public static String space(String name){
        String result="";
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)==' '){
                continue;
            }
            result+=name.charAt(i);
        }
        return result;
    }
    public static String delete(String name){
        String result="";
        for(int i=1;i<name.length()-1;i++){
            result+=name.charAt(i);

        }
        return result;
    }
    public static void main(String[] args) {
        String name=scannerby();
        name=name.toLowerCase();
        String removed=space(name);
        String reversed=reverse(removed);
        System.out.println(delete(name));
       

        if(removed.equals(reversed)){
            System.out.println("PALINDROMO");
        }else{
            System.out.println("NO PALINDROMO");
        }
    }
    
}

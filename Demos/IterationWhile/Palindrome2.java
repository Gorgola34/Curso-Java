package Demos.IterationWhile;
import java.util.*;
public class Palindrome2 {

    public static String scannerBy(){
        Scanner scanner= new Scanner(System.in);
        String name=scanner.nextLine();
        scanner.close();
        return name;

    }

    public static String reverse(String name){
        String result="";
        for(int i=name.length()-1;i>=0;i--){
            result= result + name.charAt(i);
            
        }
        return result;

    }
    public static String spaces(String name){
        String result="";
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)==' '){
                continue;
            }
            result +=name.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        String name=scannerBy();
        name=name.toLowerCase();
        String limpio=spaces(name);
        String reverse=reverse(limpio);

        if(limpio.equals(reverse)){
            System.out.println("Es palíndromo");
        }else{
            System.out.println("No es palindromo");
        }
        
    }
    
}

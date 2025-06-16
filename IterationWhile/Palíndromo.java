package IterationWhile;

public class Palíndromo {

    public static String removeSpaces(String name){
        String result="";
        for(int i=0;i<= name.length();i++){
            if (name.charAt(i)==' '){
                continue;

            }
            result += name.charAt(i);
        }
        return result;
    }

    public static String reverse(String name){
            String result ="";
            for(int i=name.length()-1;i>=0;i--){
                result = result + name.charAt(i);
                
            }

            return result;
        }
    public static boolean isPalindrome(String name){
        String text=name.toLowerCase();
        String noSpaces= removeSpaces(text);
        String reverseText=reverse(noSpaces);
        removeSpaces(text);
        reverse(text);
        return noSpaces.equals(text);
    }
    public static void showPalindrome(String text){
        if(isPalindrome(text)){
            System.out.println("Es palindromo");
        }else{
            System.out.println("no es palindromo");
        }
    }

            public static void main(String[] args) {
                String text= "Oso baboso";
                String reverse=reverse(text);
                System.out.println(reverse);
                showPalindrome("RATA ATA");
                
            }

        }

       

        
    




    

    
    


    

    
    


package IterationWhile;

public class ManageString {

    public static String removeFirstLast(String object){
        String result="";
        for(int i=1;i>= object.length()-1;i++){
            result= result + object.charAt(i);           
        }    
        return result;
    }


    public static void countDown(){
            for(int i=10; i>=0; i--){
                System.out.println(i);
            }

        }

    public static String reverse(String object){
         String result="";
        for(int i=object.length()-1;i>=0;i--){
            result= result + object.charAt(i);           
        }    
        return result;
    }


    public static void main(String[] args) {
        String test="Oso baboso";
        String remove=removeFirstLast(test);
        String reverse=reverse(test);
        countDown();
        System.out.println(reverse);
        System.out.println(remove);  
    }

}

    

    
    


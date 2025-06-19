package Demos.IterationWhile;

public class Reverse {

    public static String reverse(String name){
        String result="";
        for(int i=name.length()-1;i>=0;i--){
            result=result + name.charAt(i);

        }
        return result;
        

    }
    
public static void main(String[] args) {
    
    String reverse= reverse("Oso baboso");
    System.out.println(reverse);




    
}
}

    

    
    


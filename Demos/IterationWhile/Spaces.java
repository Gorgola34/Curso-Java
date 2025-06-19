package Demos.IterationWhile;

public class Spaces {

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
        String remove=spaces("Oso baboso");
        System.out.println(remove);
        
    }
    
}

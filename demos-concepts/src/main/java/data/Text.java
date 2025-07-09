package data;

import local.concept1.Main;

public class Text {

    public void useString(){
        String text= "Hello World";
        System.out.println(text.length());
        System.out.println(text.substring(0,5));
    }
   
         public void userStingBuffer(){
            String text2="Helloooooooo";
         StringBuffer sb= new StringBuffer(text2);
         sb.append(" " + text2);
         System.out.println(sb);
         sb.replace(6,8,"xxxxx");
         System.out.println(sb);

         }
         public static void main(String[] args) {
            String a="Holaaaaaaaaa";
            Text t= new Text();
            t.userStingBuffer();

            
         }
        
        
    }

       
    
    


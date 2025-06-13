package IterationFor;
public class Iteration {

     public static final int LOOPS=70;
     public static final String [] NAMESLIST={"Pedro","Manolo","Fran", "Sofia"};

    public static void showInfo(int counter){
        
        int round=counter+1;
        System.out.println("Valor: "+ round);

        }

        public static void arrayFor(){
            String [] nameList={"Pedro","Manolo","Fran", "Sofia"};
            for(int i=0;i<nameList.length;i++){
                System.out.println("Hola " + nameList[i]);
            }
        }
        public static void arrayForEach(){
            for(String name:NAMESLIST){
                System.out.println("Hola " + name);    
            }   
        }
            public static void iterateString(){
                String sample= "Hola bebe";
                for(int i=0;i<=sample.length();i++){
                    System.out.println(sample.charAt(i));
                }  
        }
    
    public static void main(String[] args) {

             arrayFor();
             System.out.println("----------");
             arrayForEach();
             System.out.println("-----------");
             iterateString();
              
        }

        
        
    }

    


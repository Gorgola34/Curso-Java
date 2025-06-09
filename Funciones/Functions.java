package Funciones;

public class Functions {
    //Función: Código ejecutable
    //Puede devolver un valor
    //Puede recibir valores y los guarda como parámetros 
    //Puedo invocarlo por su nombre

    public static int add(int num1,int num2){
        int result=num1+num2;
        System.out.println("El resultado es:" + result);
        return result;
    }
    public static int subtraction(int num3,int num4){
        int result=num3-num4;
        return result;
    }
    public static void showResult(int result){
        System.out.println("El resultado es:" + result);
    }

    public static void main(String[] args) {
        //Los argumentos: son los valores que llegarán a los parametros
       add(2,4);
       add(235,678);
       int result=add(24,4);
       add(345,result);
       subtraction(34,23);
       int resultSubtraction=subtraction(23,56);
       subtraction(23,56);
       showResult(result);
       showResult(resultSubtraction);

       




        
       


        
    }
    
}

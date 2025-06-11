package Operators2;

public class Operators {
    //Operadores--Expresiones= variables + operadores
    //Asignación =
    //Aritmeticos + - * / %
    //Relacionales o comparación  < > == != <= >= equals (String) booleana
    //Aritmeticos asignación n++,--,-=,+=,*=,/=
    //Incremento y decremento n++,--
    //Logicos &&/||

    public static boolean checkAge(int age){
        System.out.println("Chequeando la edad " + age);
        return age<25? true:false;

    }

    public static void main(String[] args) {
        int number=22;
        number=number+3;
        System.out.println(number);

        int x=23;
        x++;
        System.out.println(x);

        int n=22;
        n++;
        System.out.println(n);

        double c=34;
        c+=10;
        System.out.println(c);

        String job="Developer";
        int age=28;
        if(job=="Developer"&&checkAge(age)){
            System.out.println("Puedes entrar");
        }else{
            System.out.println("No puedes entrar");
        }
        }

    
    }
    


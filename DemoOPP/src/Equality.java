import OOP.Square;

public class Equality {

    public static void primitives(){

        System.out.println("Valores primitivos");
        byte num1=5;
        byte num2=5;
        System.out.println(num1==num2); // true
        short num3=5;
        System.out.println(num1==num3); // true, debidio al unboxing
        int num4=5;
        System.out.println(num1==num4); // true
        float num5=5.0f;
        System.out.println(num1==num5);
        char char1='a';  // Char es -> short
        char char2='b';
        byte valueA=97;
        System.out.println(char1==char2);
        System.out.println(char1==valueA);
        boolean bool=true;
        byte likeBool=1;
        char p='4';

    }

    public static void wrappers(){
        System.out.println("Wrappers de valores primitivos");
        Byte num1= new Byte("5");
        Byte num2= new Byte("5");
        System.out.println(num1==num2);
        Integer num3= new Integer("4");
        Integer num4= new Integer("4");
        System.out.println(num3==num4);
        Integer num5=6;
        Integer num6=6;
        System.out.println(num5==num6);

        System.out.println(num1.toString());

    }

    public static void casting(){
        System.out.println("Casting de valores primitivos");

        int num1=23;
        byte num2=20;
        byte result=(byte) (num1+num2);
        int result1=(num1+num2);
        System.out.println(result);
        System.out.println(result1);
        String text="Result";
        System.out.println(text + (num1 + num2));
        System.out.println((2*2)+  (4*4/2));
    }

    public static void compareString(){
        System.out.println("String and equality");
        String str1="Hola Mundo";
        String str2= new String("Hola Mundo");
        String str3="Hola mundo";
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equals(str3));
        str1.charAt(2);

        for(int i=0;i<str1.length();i++){
            System.out.println(str1.charAt(i));
        }
       for(char i:str1.toCharArray()){
        System.out.println(i);
       }
    System.out.println(str1.codePointAt(5));
    System.out.println(str1.split(""));
    }

    public static void compareObjets(){
        System.out.println("Objects and equality");
        Square sq1= new Square(10);
        Square sq2= new Square(10);
        Square sq3=sq1;
        System.out.println(sq1==sq2);
        System.out.println(sq1.toString());
        System.out.println(sq2);
        System.out.println(sq3);
        System.out.println(sq1.equals(sq2));

        sq1.side=12;
        System.out.println(sq2.side);
        

    }
    

    public static void main(String[] args) {
        System.out.println("Aprendiendo equals en java");
        primitives();
        System.out.println("--------------");
        wrappers();
        System.out.println("--------------");
        casting();
        System.out.println("--------------");
        compareString();
        System.out.println("--------------");
        compareObjets();
    }

    
}

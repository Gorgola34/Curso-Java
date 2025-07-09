package Demos.ExtraExc2;
public class StringBuilderEx {

    public static void buffeer(){
        StringBuilder s= new StringBuilder("hOLAAA");
        s.replace(3,5,"xaoooaooaoa");
        s.reverse();
        System.out.println(s);
    }
    public static void main(String[] args) {
        buffeer();
    }
    
}

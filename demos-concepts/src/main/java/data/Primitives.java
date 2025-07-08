package data;

public class Primitives {

    byte byteNumber=1;
    short s=1;
    int i=1;
    long l=1;
    float f=1;
    double d=1;
    char c=1;
    boolean bo=true;

    public void foo (){
        s=byteNumber;
        byteNumber=(byte) s;
        byteNumber=(byte) l;
        //byteNumber=(byte) bo; CASTING INCOMPATIBLE
    }


    public void wrappers(){
        Integer iObj=1;
        System.out.println(iObj.toString());
    }
    public static void main(String[] args) {
        Primitives p= new Primitives();
        p.wrappers();
    }

}

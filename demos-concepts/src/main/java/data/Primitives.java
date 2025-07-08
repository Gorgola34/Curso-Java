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
        //byteNumber=(byte) bo; CASTING INCOMPATIBLE
    }

}

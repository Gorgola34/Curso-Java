package local.concept2_vc;

public class Calc {

    @Override
    public String toString() {
        String classname= getClass().getSimpleName();
        String hash=Integer.toHexString(hashCode());
        return "%s [%s]".formatted(classname,hash);

}



}

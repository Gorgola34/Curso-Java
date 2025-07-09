package data.Generics;

import java.util.*;

public class Generics<T,U> {

    T foo;
    U baz;

    Generics(T foo, U baz){
        this.foo=foo;
        this.baz=baz;
    }

    public static void main(String[] args) {
        Generics<String,Integer> gen1= new Generics<>("Pepe",22);

        List<String> x= new ArrayList<>();
        x.add("Pepe");
        x.get(0);

        

    }
    
}

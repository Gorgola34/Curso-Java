package com.cdsb.Files;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Directory {

    public static void makeDirectory(){
        File f= new File("directorio");
        if(f.mkdir()){
            System.out.println("Creado");

        }else{
            System.out.println("No creado");
        }

}
public static void main(String[] args) {
        makeDirectory();
}

}

package com.cdsb.Files;
import java.io.File;

public class Persistence {

    public static void folder(){
        File f= new File("Dir");
        if(f.mkdir()){
            System.out.println("Creado");
        }else{
            System.out.println("No creado");
        }

        }
        public static void delete(){
        File f= new File("Dir");
        if(f.delete()){
            System.out.println("Borrado el directorio");
        }else{
            System.out.println("No borrado el directorio");
        }
    }
    public static void readDirectory(){
        File f=new File("Dir");
        String[] archivo=f.list();
        for(String a:archivo){
            System.out.println(a);
        }
    }
    public static void main(String[] args) {
        folder();
        delete();
        readDirectory();
    }

    }




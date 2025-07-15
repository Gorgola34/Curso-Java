package com.cdsb.Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Files {

    public static void makeFile(){
        File file=new File("Holabb.java");
        try{
            if(file.createNewFile()){
                System.out.println("Archivo creado");

        }else{
            System.out.println("No creado el archivo");
        }
    

        }catch(IOException e){
            System.out.println("Error al crear");
        }
    }
    public static void writeFile(){
        try{
            FileWriter writer= new FileWriter("Holabb.java");
            writer.write("Hola me llamo, jajjajajaj");
            writer.close();
        }catch(IOException e){
            System.out.println("Error");
        }
    }
    public static void main(String[] args) {
        makeFile();
        writeFile();
    }
    
}

package com.cdsb.Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Files {

    public static void makeFile(){
        File file=new File("Holabb.txt");
        try{
            if(file.createNewFile()){
                System.out.println("Archivo creado");

        }else{
            System.out.println("El archivo existe");
        }

        }catch(IOException e){
            System.out.println("Error al crear");
        }
    }
    public static void writeFile(){
        try{
            FileWriter writer= new FileWriter("Holabb.txt",true);
            writer.write("Hola me llamo Salvadory estudio programacion");
            writer.close();
        }catch(IOException e){
            System.out.println("Error");
        }
    }
    public static void readFile(){
        try{
            FileReader r= new FileReader("Holabb.txt");
            BufferedReader reader= new BufferedReader(r);
            String line;
            line=reader.readLine();
            reader.close();
            System.out.println(line);
        }catch(IOException e){
            System.out.println("Errorr");

        }
    }
    public static void main(String[] args) {
        makeFile();
        writeFile();
        readFile();
    }

}

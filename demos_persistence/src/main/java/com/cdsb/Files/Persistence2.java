package com.cdsb.Files;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class Persistence2 {

    public static String scannerby(){
        Scanner scanner= new Scanner(System.in);
        String name=scanner.nextLine();
        return name;
    }

    public static void makeFile(){
        try{
            File f= new File("File.txt");
            if(f.createNewFile()){
                System.out.println("Creado");
            }else{
                System.out.println("Existe");
            }
        }catch(IOException e){
            System.out.println("Error al crear");
        }
    }
    public static void writeFile(String name){
        try{
            FileWriter w= new FileWriter("File.txt",true);
            w.write(name + System.lineSeparator());
            w.close();
        }catch(IOException e){
            System.out.println("Error al escribir");
        }

        }
         public static void readFile(){
            try{
                FileReader r=new FileReader("File.txt");
                BufferedReader b= new BufferedReader(r);
                String line;
                while((line=b.readLine())!= null){
                    System.out.println(line);

                }
                System.out.println(line);
            }catch(IOException e){
                System.out.println("Error al leer");

            }

    }
    public static void main(String[] args) {
        String name=scannerby();
        makeFile();
        writeFile(name);
        readFile();
    }


}


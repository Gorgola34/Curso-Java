package com.cdsb.Files;
import java.io.File;
import java.util.Arrays;
public class FileSystem1 {

    public static void listFiles(String pathName){
        File file= new File(pathName);
        String[] list=file.list();
        System.out.println(Arrays.toString(list));
        for(String l:list){
            char type=getType(pathName + "/"+ l);
            System.out.println(type + " " +l);
        }
    }

    public static char  getType(String pathName){
        File file= new File(pathName);
        return file.isDirectory()?'D':'F';
    }


    // Leer lista ficheros y carpetas
    // Crear nuevas carpetas
    //Borrar carpetas/ficheros
    //Crear ficheros
    //Escribir en ficheros
    //Leer de un fichero

    public static void main(String[] args) {
        String pathName="demos_persistance";
        listFiles(pathName);
         File file= new File(pathName);

         if(file.exists()){
            System.out.println("File exist");
            return;
         }

         //if(file.isDirectory()){
           // System.out.println(pathName + "is not directory");
            //return;
        //}
    }
}

package com.cdsb.serializacion;

import java.nio.file.FileSystem;
import java.util.ArrayList;
import java.util.List;

import com.cdsb.Files.FileSystem2;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.io.JsonEOFException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonBike {

    //SERIALIZAR
    public static String toJSON(Bycicle [] Bycicles){

        ObjectMapper mapper= new ObjectMapper();
        String Jbikes="";
        try{
              Jbikes=mapper.writeValueAsString(Bycicles);
        }catch(JsonProcessingException e){
            System.out.println("Error");
        }
        return Jbikes;

    }
    //public static void safeBikes(String name, String data){

    public static void main(String[] args) {
        //List<Bycicle> x= new ArrayList<>();
        Bycicle[] bycicles={
            new Bycicle("Speciali","Urban","Green",4,true),
            new Bycicle("Trek","Mountain","Blue",6,false),
        };
        //x.add(new Bycicle("Specialized","Carretera","Rojo",6,true));
        //x.add(new Bycicle("Trek","Mountain","Azul",5,false));

        //for(Bycicle b:x){
            //System.out.println(b.toString());
             System.out.println(JacksonBike.toJSON(bycicles));
        }

    }



//}

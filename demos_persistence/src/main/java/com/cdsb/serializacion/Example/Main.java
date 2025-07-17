package com.cdsb.serializacion.Example;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

    public static String toJSON(Bike [] b){
        String x="";
        ObjectMapper m= new ObjectMapper();
        try{
            x=m.writeValueAsString(b);

        }catch(JsonProcessingException e){
            System.out.println("Error");
        }
        return x;
    }


    public static void main(String[] args) {
        Bike [] b={
            new Bike("Azul","Urban",6,true),
            new Bike("Rojo","Mountain",4,true),
        };
        System.out.println(toJSON(b));
    }

}

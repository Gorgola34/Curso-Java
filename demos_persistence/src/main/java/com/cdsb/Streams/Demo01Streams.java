package com.cdsb.Streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Demo01Streams {

    public static int [] numbers={2,5,8,9};
      public static IntStream numStreams = Arrays.stream(numbers);


    public static void makeForEach(IntStream numStreams){
        numStreams.forEach(

       (number) -> {
        System.out.println(number);
       }
       );

    }
    public static void makeMap(){
         IntStream s=numStreams.map(number -> number*number);
         makeForEach(s);
    }



    public static void main(String[] args) {
        makeMap();
        //makeForEach(numStreams);







    }







}

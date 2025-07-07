package local.concept2_vc.concept_test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class OutputTest {

     @Test
    public void demo(){


        //Guardar el output original

    PrintStream originalOut= System.out;

    //Crear un nuevo output
    ByteArrayOutputStream outputStream= new ByteArrayOutputStream();
    PrintStream newOut= new PrintStream(outputStream);

    final String text="Texto de prueba";

        System.out.println(text);
        String output= outputStream.toString().trim();

        assertEquals(text,output);


    //Restablecer el output original
        System.setOut(originalOut);
        
    }

    
}

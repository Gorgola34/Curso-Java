package local.concept2_vc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import local.exceptions.BusinessException;

public class CalcControllerTest {
    // private CalcController cc;
    @BeforeEach
    public void configure(){
         CalcController cc = new CalcController();
    }
    @Test
    public void testAdd() {
        CalcController cc = new CalcController();
        assertEquals(0,cc.add());                                                                                                                                                                           
    }
   @Test
   public void AddTest(){
    CalcController cc= new CalcController();
    int num1=50;
    int num2=50;
    assertEquals(100,cc.add(num1,num2));
   }
     @Test
    public void testAdd2() {
        int num1=4;
        int num2= 7;
        CalcController cc = new CalcController();
        cc.setNum1(num1);
        cc.setNum2(num2);
        int result=cc.add();
        assertEquals(11,result);
                                                                                                                                                                              
    }
   @Test
   public void Add3(){
    CalcController cc= new CalcController();
    int num1=8;
    int num2=10;
    assertEquals(18,cc.addextra(num1,num2));

   }
    
    @Test
    public void testMultiply() {
        CalcController cc = new CalcController();
        //int result=cc.add();
        assertEquals(9,3*3);
                                                                                                                                                                              
    }

    @Test
    public void testMultiply2(){
        CalcController cc= new CalcController();
        int num1=34;
        int num2=6;
        assertEquals(204,cc.multiply(num1,num2));


    }
     @Test
    public void testSubtract() {
        int num1=23;
        int num2=10;
        CalcController cc = new CalcController();
         cc.setNum1(num1);
        cc.setNum2(num2);
        int result=cc.subtract();
        assertEquals(13,result);
                                                                                                                                                                              
    }
     @Test
    public void testDivision() throws BusinessException {
        int num1=9;
        int num2=-1;
        CalcController cc = new CalcController();
         cc.setNum1(num1);
        cc.setNum2(num2);
        int result=cc.intDivide();
        assertEquals(-9,result);
                                                                                                                                                                              
    }

    @Test
    public void intdivideOneNegative() throws BusinessException{
        int num1=10;
        int num2=5;
        CalcController cc= new CalcController();
        cc.setNum1(num1);
        cc.setNum2(num2);
        assertEquals(2,cc.intDivide());
        assertEquals(0,cc.restDivision());
        
    }
    @Test
    public void testFactorial() throws BusinessException{
        int num1=5;
        CalcController cc= new CalcController();
        cc.setNum1(num1);
        assertEquals(120,cc.calculateFactorial());
    }
    @Test
    public void testFactorialLambda() throws BusinessException {
        CalcController cc = new CalcController();
        int num1=5;
        assertEquals(120, cc.factorialCalc(num1));


    }


}

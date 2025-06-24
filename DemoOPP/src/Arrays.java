import java.util.*;
public class Arrays {

    public static void foo(int[] data){

    }


    public static void main(String[] args) {

        int[] data={1,2,4,6,89};
        int[] data2=data;
        int[] data3={1,2,4,6,89};
        System.out.println(data==data2);
        System.out.println(data==data3);
        foo(data3);


        ArrayList<Integer> list=new ArrayList<>();
        

    }

}

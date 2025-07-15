package local.Collections.ExcersisePhone;
import java.util.*;
public class Employee {

     @Override
    public String toString() {
        return "Employee [nameSurname=" + nameSurname + ", phone=" + phone + ", mail=" + mail + "]";
    }
     String nameSurname;
     String phone;
     String mail;

    public Employee(String nameSurname, String phone,String mail){
        this.nameSurname=nameSurname;
        this.phone=phone;
        this.mail=mail;

    }
    public String getNameSurname(){
        return nameSurname;
    }
    public String getPhone(){
        return phone;
    }
    public String getMail(){
        return mail;
    }
    

}

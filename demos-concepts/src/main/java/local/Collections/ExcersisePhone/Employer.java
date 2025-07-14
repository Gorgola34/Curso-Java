package local.Collections.ExcersisePhone;
import java.util.*;
public class Employer {

     @Override
    public String toString() {
        return "Employer [nameSurname=" + nameSurname + ", phone=" + phone + ", mail=" + mail + "]";
    }
     String nameSurname;
     String phone;
     String mail;

    public Employer(String nameSurname, String phone,String mail){
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

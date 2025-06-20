package Invoid;

public class Company {

    private String name;
    private String address;
    private String phone;
    private String NIF;

    public Company(String name, String address,String phone,String NIF){
        this.name=name;
        this.address=address;
        this.phone=phone;
        this.NIF=NIF;
    }
    
    public void showCompany(){
        System.out.println("""
                Name    %s
                Address %s
                Phone   %s
                NIF     %s
                """.formatted(name,address,phone,NIF));
    }

}

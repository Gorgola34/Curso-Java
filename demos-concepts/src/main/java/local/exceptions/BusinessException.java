package local.exceptions;

//Checked exception

public class BusinessException extends Exception {

    ErrorCodes code;

    BusinessException(ErrorCodes code, String message){
        super(message);
        this.code=code;
    }

    BusinessException(ErrorCodes code, String message, Throwable cause){
        super(message,cause);
        this.code=code;
    }

    private String generateMessage(){
        return code + " " + getMessage();
    }


}
enum ErrorCodes {
        ERROR_EVEN("No se admiten numeros pares"), ERROR_NEGATIVE("No se admiten numeros negativos");

        String message="";
    

    ErrorCodes(String message) {
     this.message=message;

    }

    @Override
    public String toString(){
        return this.message;
    }

}



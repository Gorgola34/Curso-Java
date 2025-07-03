package local.exceptions;

import local.concept2_vc.ErrorCodes;

// Checked Exception

public class BusinessException extends Exception {

    private static String generateMessage(String errorNegative, String message) {
        return errorNegative + " - " + message;
    }
    
    String code;

    public BusinessException(String errorNegative, String message) {
        super(generateMessage(errorNegative, message));
        this.code = errorNegative;
    }

    public BusinessException(String errorZero, String message, Throwable cause) {
        super(generateMessage(errorZero, message), cause);
        this.code = errorZero;
    }
}
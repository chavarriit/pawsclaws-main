package wcci.org.pawsclaws.DTO;

public class ErrorDataDTO { // The ErrorDataDTO class serves as a Data Transfer Object (DTO) to encapsulate error information.


    private String errorMessage; // Descriptive message of the error.

    private int errorCode = 0;

    public String getErrorMessage() { // Getter method to retrieve the error message.
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {   // Setter method to set the error message.
        this.errorMessage = errorMessage;
    }

    public int getErrorCode() {  // Getter method to retrieve the error code.
        return errorCode;
    }

    public void setErrorCode(int errorCode) { // Setter method to set the error code.
        this.errorCode = errorCode;
    }


    
}

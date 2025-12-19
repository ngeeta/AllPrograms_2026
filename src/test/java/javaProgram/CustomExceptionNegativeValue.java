package javaProgram;

public class CustomExceptionNegativeValue extends Exception{
	// Default constructor
    public CustomExceptionNegativeValue() {
        super("Invalid value provided.1");
    }

    // Constructor with custom message
    public CustomExceptionNegativeValue(String message) {
        super(message);
    }

    // Constructor with message and cause
    public CustomExceptionNegativeValue(String message, Throwable cause) {
        super(message, cause);
    }

}

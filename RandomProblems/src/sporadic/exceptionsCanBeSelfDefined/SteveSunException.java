package sporadic.exceptionsCanBeSelfDefined;

/**
 * Base exception for all kinds of exceptions that I wrote myself for fun.
 * 
 * This turns out to be a standard way to define a self-defined exception: you
 * should define these four constructors!
 */

public class SteveSunException extends RuntimeException {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public SteveSunException() {
        super();
    }

    public SteveSunException(String message) {
        super(message);
    }

    public SteveSunException(String message, Throwable cause) {
        super(message, cause);
    }

    public SteveSunException(Throwable cause) {
        super(cause);
    }
}

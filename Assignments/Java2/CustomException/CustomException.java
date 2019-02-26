package Java2.CustomException;

public class CustomException extends Exception {

    @Override
    public synchronized Throwable fillInStackTrace() {
        return null;
    }
}

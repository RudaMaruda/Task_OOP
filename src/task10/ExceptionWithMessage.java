package task10;

public abstract class ExceptionWithMessage extends Exception{

    protected final String message;

    protected ExceptionWithMessage(String message) {
        super();
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}

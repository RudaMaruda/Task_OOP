package task10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProductUnavailableException extends ExceptionWithMessage {

    private final LocalDate date;

    protected ProductUnavailableException(String message, LocalDate date) {
        super(message);
        this.date = date;
    }

    @Override
    public String toString() {
        return message + " " + date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
}

package task10;

import java.time.LocalDate;

public interface Product {
    @MustThrowCheckedException
    double getPrice() throws PriceUnavailableException;

    @MustThrowCheckedException
    boolean availability(LocalDate date) throws ProductUnavailableException;
}

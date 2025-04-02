package utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ThreadLocalRandom;

public class DateHelper {

    /**
     * @return
     */
    public String getCurrentDate() {
        return LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    /**
     *
     * @return
     */
    public String generateFutureDate() {
        LocalDate today = LocalDate.now();
        long randomDays = ThreadLocalRandom.current().nextLong(1, 30);
        LocalDate futureDate = today.plusDays(randomDays);
        return futureDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
}

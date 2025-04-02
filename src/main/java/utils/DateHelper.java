package utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ThreadLocalRandom;

public class DateHelper {

    /**
     * Method to get the actual date in the format YYYY - MM - DD
     * @return Actual Date
     */
    public String getCurrentDate() {
        return LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    /**
     * Method for obtaining a random date with a maximum difference of 30 days from the actual date.
     * @return Random Date with specific parameters
     */
    public String generateFutureDate() {
        LocalDate today = LocalDate.now();
        long randomDays = ThreadLocalRandom.current().nextLong(1, 30);
        LocalDate futureDate = today.plusDays(randomDays);
        return futureDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
}

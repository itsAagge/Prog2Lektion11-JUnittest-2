package examples.LocalTime;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Loan {
    private LocalDate returnDate;

    public Loan(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public int calculateFine(boolean adult) {
        LocalDate handInDate = LocalDate.now();
        long daysOver = DAYS.between(returnDate, handInDate);
        int fine = 0;
        if (daysOver >= 15) {
            fine = 45;
        } else if (daysOver >=8) {
            fine = 30;
        } else if (daysOver >= 1) {
            fine = 10;
        }
        if (adult) {
            fine = fine * 2;
        }
        return fine;
    }
}

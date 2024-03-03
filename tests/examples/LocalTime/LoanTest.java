package examples.LocalTime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class LoanTest {
    @Test
    void OneDayLateAsAdultShouldReturn20() {
        Loan loan = new Loan(LocalDate.of(2024, 3, 1));
        int actual = loan.calculateFine(true);
        assertEquals(20, actual);
    }

    @Test
    void OneDayLateShouldReturn10() {
        Loan loan = new Loan(LocalDate.of(2024, 3, 1));
        int actual = loan.calculateFine(false);
        assertEquals(10, actual);
    }

    @Test
    void EightDaysLateAsAdultShouldReturn60() {
        Loan loan = new Loan(LocalDate.of(2024, 2, 23));
        int actual = loan.calculateFine(true);
        assertEquals(60, actual);
    }

    @Test
    void EightDaysLateShouldReturn30() {
        Loan loan = new Loan(LocalDate.of(2024, 2, 23));
        int actual = loan.calculateFine(false);
        assertEquals(30, actual);
    }

    @Test
    void FifteenDaysLateShouldReturn45() {
        Loan loan = new Loan(LocalDate.of(2024, 2, 16));
        int actual = loan.calculateFine(false);
        assertEquals(45, actual);
    }


    @Test
    void FifteenDaysLateAsAdultShouldReturn90() {
        Loan loan = new Loan(LocalDate.of(2024, 2, 16));
        int actual = loan.calculateFine(true);
        assertEquals(90, actual);
    }


}
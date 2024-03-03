package opgave02.models;

import java.time.LocalDateTime;

public class Occurrence {
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    @Override
    public String toString() {
        return "Occurrence{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}

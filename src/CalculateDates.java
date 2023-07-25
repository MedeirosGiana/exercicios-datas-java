import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculateDates {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.parse("2023-06-30");
        LocalDateTime d2 = LocalDateTime.parse("2023-06-30T01:30:26");
        Instant d3 = Instant.parse("2023-06-30T01:30:26Z");

        System.out.println("----------------------------Calculos com Datas----------------------------");
        LocalDate pastWeekLocalDate = d1.minusDays(7);
        LocalDate plusWeekLocalDate = d1.plusDays(7);
        LocalDateTime pastWeekLocalDateTime = d2.minusDays(7);
        LocalDateTime plusWeekLocalDateTime = d2.plusDays(7);
        Instant pastWeekInstant = d3.minus(7, ChronoUnit.DAYS);
        Instant plusWeekInstant = d3.plus(7, ChronoUnit.DAYS);

        System.out.println("Local Date:");
        System.out.println("PastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("PlusWeekLocalDate = " + plusWeekLocalDate);
        System.out.println();

        System.out.println("Local Date Time:");
        System.out.println("PastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("PlusWeekLocalDateTime = " + plusWeekLocalDateTime);
        System.out.println();

        System.out.println("Instant:");
        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("plusWeekInstant = " + plusWeekInstant);
    }
}

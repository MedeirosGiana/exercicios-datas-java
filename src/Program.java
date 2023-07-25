import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {
        System.out.println("------------------------Instanciação de datas------------------------");

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate date1 = LocalDate.now();
        LocalDateTime date2 = LocalDateTime.now();
        Instant date3 = Instant.now();

        LocalDate date4 = LocalDate.parse("2023-06-25");
        LocalDateTime date5 = LocalDateTime.parse("2023-07-10T10:30:25");
        Instant date6 = Instant.parse("2023-07-12T16:40:40Z");
        Instant date7 = Instant.parse("2023-07-12T16:40:40-03:00");

        LocalDate date8 = LocalDate.parse("10/05/2023",fmt);
        LocalDateTime date9 = LocalDateTime.parse("10/05/2023 15:20",fmt1);

        LocalDate date10 = LocalDate.of(2023,7,10);
        LocalDateTime date11 = LocalDateTime.of(2023,  7, 10, 10, 30);

        System.out.println("date 1: " + date1);
        System.out.println("date 2: " + date2);
        System.out.println("date 3: " + date3);
        System.out.println("date 4: " + date4);
        System.out.println("date 5: " + date5);
        System.out.println("date 6: " + date6);
        System.out.println("date 7: " + date7);
        System.out.println("date 8: " + date8);
        System.out.println("date 9: " + date9);
        System.out.println("date 10: " + date10);
        System.out.println("date 11: " + date11);

        //FORMATAÇÃO DE DATAS PARA TEXTO: FORMATO ISO 8601, CUSTOMIZADO
        LocalDate localDate = LocalDate.parse("2023-07-20");

        System.out.println("------------------------Formatação com LocalDate------------------------");
        System.out.println("local date = " + localDate.format(fmt));
        System.out.println("local date = "+ fmt.format(localDate));
        System.out.println("local date = "+ localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("------------------------Formatação com LocalDateTime------------------------");
        LocalDateTime localDateTime = LocalDateTime.parse("2023-07-20T01:30:26");
        System.out.println("local date time = " + localDateTime.format(fmt1));
        System.out.println("local date time = " + fmt1.format(localDateTime));
        System.out.println("local date time = " + localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));

        System.out.println("------------------------Instant------------------------");
        DateTimeFormatter fmt2instant = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        Instant instant = Instant.parse("2023-07-12T01:30:26Z");
        System.out.println("Instant = " + fmt2instant.format(instant));
        System.out.println("Instant = "+ instant.toString());

    }
}

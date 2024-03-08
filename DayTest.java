import java.time.LocalDate;
import java.time.LocalDateTime;

public class DayTest {
    static LocalDateTime day = LocalDateTime.of(2024, 3, 6, 9, 24);

    public static void main(String[] args) {
        System.out.println(day.getDayOfWeek());
        System.out.println(day.toLocalTime());
    }

}
package days18;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author created by Seeker2250 on 7/24/24.
 * @Subject
 * @Contents
 */
public class Ex03_06 {
  public static void main(String[] args) {
    LocalDate d = LocalDate.now();
    LocalTime t = LocalTime.now();
    LocalDateTime dt =LocalDateTime.now();

    LocalDate d2 = dt.toLocalDate();
    LocalTime t2 = dt.toLocalTime();

    LocalDateTime dt2 = d.atTime(t);
    LocalDateTime dt3 = t.atDate(d);
  }
}

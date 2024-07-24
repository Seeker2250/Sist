package days18;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author created by Seeker2250 on 7/24/24.
 * @Subject
 * @Contents
 */
public class Ex03_08 {
  public static void main(String[] args) {
    LocalDate d = LocalDate.now();//2024-07-24
    System.out.println(d);
//    Simple Data Formatter
//    String pattern ="yyyy년 MM월 dd일";
//    DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
//    String sd = dtf.format(d);
//    System.out.println(sd);

//    String sd = "2024-07-24";//ISO Local Data 형태
//    LocalDate d2= LocalDate.parse(sd);
//    System.out.println(d2);

    String sd = "2024-07-24";
    String pattern ="yyyy년MM월dd일";
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
    LocalDate d2 = LocalDate.parse(sd, dtf);
    System.out.println(d2);
  }
}

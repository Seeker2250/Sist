package days18;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * @author created by Seeker2250 on 7/24/24.
 * @Subject
 * @Contents
 */
public class Ex03_04 {
  public static void main(String[] args) {


//  String 불변
//    String a = "xyz";
//    a.replace('y','와');
//    System.out.println(a);//불변(immutable)

//    java time에 있는 핵심 클래스도 불변
    LocalDate ld = LocalDate.now();
    System.out.println(ld);

    ld = ld.withYear(2020);//받지 않으면 안 바뀌어
    System.out.println(ld);
    ld = ld.with(ChronoField.YEAR, 2024);
    System.out.println(ld);
//    월 수정(12월로)
    ld = ld.withMonth(9);
    System.out.println(ld);
    ld = ld.with(ChronoField.MONTH_OF_YEAR,12);
    System.out.println(ld);

//    5달 빼기
    ld = ld.minusMonths(5);
    System.out.println(ld);
    ld = ld.plusMonths(5);
    System.out.println(ld);

//    trucatedTo(); 절삭하다, 끝을 잘라내다
    LocalTime lte = LocalTime.now();
    System.out.println(lte);//14:13:33.567949
    lte = lte.truncatedTo(ChronoUnit.SECONDS);
    System.out.println(lte);

    LocalDateTime ldt = LocalDateTime.now();
    System.out.println(ldt);
    ldt = ldt.truncatedTo(ChronoUnit.DAYS);
    System.out.println(ldt);

  }
}

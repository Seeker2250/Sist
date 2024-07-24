package days18;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

/**
 * @author created by Seeker2250 on 7/24/24.
 * @Subject
 * @Contents
 */
public class Ex03_09 {
  public static void main(String[] args) {
//    Period = 날짜와 날짜 사이의 간격
//    Duration = 시간과 시간 사이의 간격
//    ex) 남은 수료일
    LocalDate ed = LocalDate.of(2024, 12, 14);
    ed = ed.plusDays(1);//Period.between의 end가 마지막 날 제외라
    LocalDate td = LocalDate.now();
    Period p = Period.between(td, ed);
    System.out.println(p);
    System.out.println(p.getYears());
    System.out.println(p.getMonths());
    System.out.println(p.getDays());

//    18:00:00 퇴근
    LocalTime et = LocalTime.of(18,0);
    LocalTime tt = LocalTime.now();
    Duration d = Duration.between(tt, et);
    System.out.println(d.getNano());
    System.out.println(d.getSeconds()/60/60+"시간");
    System.out.println(d.getSeconds()/60+"분");

  }
}

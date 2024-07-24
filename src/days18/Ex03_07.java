package days18;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * @author created by Seeker2250 on 7/24/24.
 * @Subject
 * @Contents
 */
public class Ex03_07 {
  public static void main(String[] args) {
//    1) 이번 달 마지막 날짜 며칠까지?
//        이번 달의 마지막 수요일은 언제?
//    이번 첫 번째 금요일은 며칠인지?
//    with(), plus(), minus()

//    2) 자주 쓰일만한 날짜 계산들을 대신해주는 method
//    를 구현해 놓은 class : TemporalAdjusters
    LocalDate d= LocalDate.now();
    System.out.println(d);
//    d = d.withDayOfMonth(1);
//    System.out.println(d);
//    System.out.println(d);
//    d= d.minusDays(1);
//    System.out.println(d);
//    int lastDay = d.getDayOfMonth();
//    System.out.println(lastDay);
    LocalDate s = LocalDate.now();
    System.out.println(s.lengthOfMonth());

    LocalDate a = LocalDate.now();
    a=a.with(TemporalAdjusters.lastDayOfMonth());
    System.out.println(a);
//    TemporalAdjusters a = TemporalAdjusters


//    LocalDate d = LocalDate.now();
//    System.out.println(d);
//    // 다음 달의 첫 날
//    System.out.println( d.with( TemporalAdjusters.firstDayOfNextMonth()  ) );
//    // 이번 달의 첫 날
//    System.out.println( d.with( TemporalAdjusters.firstDayOfMonth()  ) );
//    // 이번 달의 첫 번째 월요일
//    System.out.println( d.with( TemporalAdjusters.firstInMonth(MONDAY)  ) );
//
//    // 지난 주 월요일
//    System.out.println( d.with( TemporalAdjusters.previous(MONDAY)  ) );
//    System.out.println( d.with( TemporalAdjusters.previousOrSame(MONDAY)    ) );



  }
}

package days18;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

/**
 * @author created by Seeker2250 on 7/24/24.
 * @Subject
 * @Contents
 */
public class Ex03_03 {
  public static void main(String[] args) {
      LocalDate ld = LocalDate.now();
    System.out.println(ld);//2024-07-24
//    년
    int year = ld.get(ChronoField.YEAR);
    System.out.println(year);
    System.out.println(ld.getYear());
//    월
    int month = ld.get(ChronoField.MONTH_OF_YEAR);//숫자로 표기
    System.out.println(month);
    System.out.println(ld.getMonth());//문자로 표기
//    일
    int day = ld.get(ChronoField.DAY_OF_YEAR);//1년 중 며칠쨰?
    System.out.println(day);
    System.out.println(ld.get(ChronoField.DAY_OF_MONTH));//며칠
    System.out.println(ld.get(ChronoField.DAY_OF_WEEK));//요일 //월(1) ~ 일(7)
//                                                         Date 일(0) ~ 토(6)
//                                                     Calendar 일(1) ~ 토(7)
    System.out.println(ld.getDayOfMonth());
    System.out.println(ld.getDayOfYear());
    System.out.println(ld.getDayOfWeek());


    LocalTime lt = LocalTime.now();
//    시
    System.out.println(lt.get(ChronoField.HOUR_OF_DAY));
    System.out.println(lt.get(ChronoField.HOUR_OF_AMPM));
    System.out.println(lt.get(ChronoField.CLOCK_HOUR_OF_AMPM));
    System.out.println(lt.get(ChronoField.CLOCK_HOUR_OF_DAY));
    System.out.println(lt.getHour());
//    분
    System.out.println(lt.get(ChronoField.MINUTE_OF_DAY));
    System.out.println(lt.get(ChronoField.MINUTE_OF_HOUR));
    System.out.println(lt.get(ChronoField.SECOND_OF_MINUTE));
    System.out.println(lt.getMinute());
//    초
    System.out.println(lt.get(ChronoField.SECOND_OF_MINUTE));
    System.out.println(lt.get(ChronoField.SECOND_OF_DAY));
    System.out.println(lt.getSecond());
//    밀리초
    System.out.println(lt.get(ChronoField.MILLI_OF_DAY));
    System.out.println(lt.get(ChronoField.MILLI_OF_SECOND));
//    나노초
    System.out.println(lt.get(ChronoField.NANO_OF_SECOND));
    System.out.println(lt.getNano());


    // 요일
    int dof = ld.get(ChronoField.DAY_OF_WEEK);
    System.out.println(dof ); //  월(1) ~ 일(7)
    //                     Date   일(0) ~ 토(6)
    //                  Calendar  일(1) ~ 토(7)

    DayOfWeek edow  = ld.getDayOfWeek();
    System.out.println( edow ); // MONDAY
    System.out.println( edow.getValue() ); // 1

    LocalTime lt1 = LocalTime.now();
    // 시간
    int hour = lt.get(ChronoField.HOUR_OF_DAY);
    System.out.println( hour );

    hour = lt.getHour();
    System.out.println( hour );

    // 분
    int m = lt.get(ChronoField.MINUTE_OF_HOUR);
    System.out.println( m );

    m = lt.getMinute();
    System.out.println( m );
    // 초
    int s = lt.get(ChronoField.SECOND_OF_MINUTE);
    System.out.println(s );

    s = lt.getSecond();
    System.out.println(s );
    // 밀리초
    int ms = lt.get(ChronoField.MILLI_OF_SECOND);
    System.out.println(ms);

    int ns = lt.getNano();
    System.out.println( ns );
  }//main
}//class

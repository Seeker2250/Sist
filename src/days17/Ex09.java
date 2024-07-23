package days17;

import java.util.Calendar;

/**
 * @author created by Seeker2250 on 7/23/24.
 * @Subject
 * @Contents
 */
public class Ex09 {
  public static void main(String[] args) {
//    jdk 1.0   java.util.Date class
//    jdk 1.1   java.util.Calendar class

    Calendar c = Calendar.getInstance();//GegorianCalendar 객체 생성해서 Up casting하는거야
//    System.out.println(c.toString());

//    년
    System.out.println(c.get(1));
    System.out.println(c.get(Calendar.YEAR));
//    월
    System.out.println(c.get(Calendar.MONTH) + 1);
//    일
    System.out.println(c.get(Calendar.DATE));
    System.out.println(c.get(Calendar.DAY_OF_MONTH));//그 달의 며칠째인지

    System.out.println(c.get(Calendar.DAY_OF_YEAR));//그 년도의 며칠째인지
    System.out.println(c.get(6));
//    시간
    System.out.println(c.get(Calendar.HOUR));//12시간제
    System.out.println(c.get(Calendar.HOUR_OF_DAY));//24시간제
//    분
    System.out.println(c.get(Calendar.MINUTE));
//    초
    System.out.println(c.get(Calendar.SECOND));
//    밀리초
    System.out.println(c.get(Calendar.MILLISECOND));
//    요일
//    Date class util에서 가져올 땐 0이 일요일, 1이 월요일 ...이었는데
//    Calendar에선 1이 일요일, 2가 월요일 ... 7이 토요일
    System.out.println(c.get(Calendar.DAY_OF_WEEK));//이 달의 몇번째 요일?

    System.out.println(c.get(Calendar.AM));//오전 오후 체크
    System.out.println(c.get(Calendar.AM_PM));//오전 오후 체크
//    마지막 날짜


  }//main
}//class

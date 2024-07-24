package days18;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author created by Seeker2250 on 7/24/24.
 * @Subject
 * @Contents 달력 재탈
 */
public class Ex01 {
  public static void main(String[] args) {
    int year = 2024;
    int month = 6;
    int date = 1;

    int dayOfWeek = getDayOfWeek(year, month, date);
    int lastDay = getLastDay(year, month);

    System.out.println(getDayOfWeek(year, month, date));
//    24년도 7월 달력에 24.06.30부터 42일간 나타나있으니 이대로 출력해보자

    Calendar start = new GregorianCalendar(year, month - 1, 1);
//    start.add(Calendar.DATE,1 );//특정 시간에 뭘 더하겠다(이건 하루를 더하겠다.)
    start.add(Calendar.DATE, -dayOfWeek);//이렇게 하면 빼는거지(시작 날짜는 전 달 꺼라 시작일을 구하기 위함)

//    Calendar -> Date 형변환 후 toLocaleString으로 확인( Calendar에서는 확인이 어렵기 때문 )
//    Date -> Calendar 형변환도 가능
//    밀리초를 가져와서 변환시킬거야(밀리초는 둘 다에 있으니까)
//    Date a = start.getTime();
//    System.out.println(a.toLocaleString());

    System.out.println("=".repeat(30));
    System.out.print("\n".repeat(10));
    for (int i = 1; i <= 42; i++) {
//      System.out.println(start.toLocaleString());
      int cmonth = start.get(Calendar.MONTH) + 1; //월 가져와
      if (cmonth == month + 1) System.out.printf("[%d]\t"
          , start.get(Calendar.DATE));
      else if (cmonth == month - 1) System.out.printf("(%d)", start.get(Calendar.DATE));
      else System.out.printf("%d\t", start.get(Calendar.DATE));//일만 찍혀
      start.add(Calendar.DATE, 1);//시작 날에 매번 하루를 더해
      if (i % 7 == 0) System.out.println();
    }//for

    System.out.println("=".repeat(30));
  }//main

  private static int getLastDay(int year, int month) {
    Calendar c = new GregorianCalendar(year, month - 1, 1);
    return c.getActualMaximum(Calendar.DATE);
  }

  private static int getDayOfWeek(int year, int month, int date) {
    Calendar c = new GregorianCalendar(year, month - 1, 1);
    return c.get(Calendar.DAY_OF_WEEK) - 1;//1이 일요일, 7이 토요일이라서 기존 코딩이랑 맞추려면 -1
  }
}//class

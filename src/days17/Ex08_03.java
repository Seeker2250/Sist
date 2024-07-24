package days17;

import java.util.Arrays;
import java.util.Date;

/**
 * @author created by Seeker2250 on 7/23/24.
 * @Subject
 * @Contents
 */
public class Ex08_03 {
  public static void main(String[] args) {
    int year = 2024;
    int month = 6;
    int date = 1;

    int dayOfWeek = getDayOfWeek(year, month, date);//요일, 1(월) 날짜만큼 빼면
    int lastDay = getLastDay(year, month);

    System.out.println(getDayOfWeek(year, month, date));
//    24년도 7월 달력에 24.06.30부터 42일간 나타나있으니 이대로 출력해보자

    Date start = new Date(year - 1900, month-1, 1);
    start.setDate(start.getDate()-dayOfWeek);//시작 날짜
    System.out.println("=".repeat(30));
    System.out.print("=".repeat(30));
    for (int i = 0; i <= 42 ; i++) {
//      System.out.println(start.toLocaleString());
      System.out.printf("%d\t",start.getDate());//일만 찍혀
      start.setDate(start.getDate()+1);//시작 날에 매번 하루를 더해
      if(i%7==0) System.out.println();
    }//for

    System.out.println("=".repeat(30));
  }//main

  private static int getLastDay(int year, int month) {
    Date d = new Date(year - 1900, month-1, 1);
    d.setMonth(d.getMonth()+1);
    d.setDate(d.getDate()-1);
    return d.getDate(); //31 return

  }

  private static int getDayOfWeek(int year, int month, int date) {
    Date d = new Date(year-1900,month-1,date);
    return d.getDay();//일 - 0, 토 - 6
  }
}//class
//package days17;
//
//import java.util.Date;
//
///**
// * @author kenik
// * @date 2024. 7. 23. - 오후 3:45:55
// * @subject
// * @content
// *
// */
//public class Ex08_03 {
//
//   public static void main(String[] args) {
//      int year = 2024;
//      int month = 6;
//      int date = 1;
//
//      int dayOfWeek = getDayOfWeek(year, month, date); // 1(월)
//      int lastDay = getLastDay(year, month);
//
//      // 24.6.30(시작날짜) ~ 42일
//      Date start = new Date(year - 1900,month -1 , 1);
//      start.setDate(start.getDate() - dayOfWeek);
//      // System.out.println( start.toLocaleString() );
//
//      System.out.println("=".repeat(30));
//      System.out.println("=".repeat(30));
//      for (int i = 1; i <=  42; i++) {
//         // System.out.println( start.toLocaleString() );
//         int cmonth = start.getMonth()+1;
//         if(  cmonth == month+1 ) System.out.printf("[%d]\t", start.getDate());
//         else if(  cmonth == month-1 ) System.out.printf("(%d)\t", start.getDate());
//         else System.out.printf("%d\t", start.getDate());
//         if( i%7==0) System.out.println();
//         start.setDate(start.getDate() + 1 );
//      } //
//      System.out.println();
//      System.out.println("=".repeat(30));
//
//
//   } // main
//
//   private static int getLastDay(int year, int month) {
//      Date d = new Date(year - 1900,month -1 , 1);
//      d.setMonth( d.getMonth() + 1 );
//        d.setDate(  d.getDate() - 1 );
//        return d.getDate(); // 31
//   }
//
//   private static int getDayOfWeek(int year, int month, int date) {
//      Date d = new Date(year - 1900,month -1 , date);
//      return  d.getDay(); // (일)0 ~ (토)6
//   }
//
//} // class
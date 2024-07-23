package days17;

import java.util.Date;

/**
 * @author created by Seeker2250 on 7/23/24.
 * @Subject
 * @Contents
 */
public class Ex08_02 {
  public static void main(String[] args) {
//    2020년 5월 달력
//    2020년 5월 1일이 무슨 요일인지 알아야 해
//    마지막 날짜를 알아야 해
//    Date d = new Date();
//    System.out.println(d.getDay());
//    String[] lastDay = {"31", "28", "31", "30", "31", "30", "31", "31", "30", "31", "30", "31" };
//    System.out.println(d.getTime());
////    System.out.println((d.getMonth() + 1));
//
    int year = 2020;
    int month = 5;
    int date = 1;
//    Date d = new Date();//현재 시스템의 현재 날짜 시간 정보
//    d.setYear(year - 1900);
//    d.setMonth(month-1);
//    d.setDate(date);
//    d.setHours(0);
//    d.setMinutes(0);
//    d.setSeconds(0);
//    System.out.println(d.toLocaleString());
//    System.out.println(d.getDay());
    Date d = new Date(year-1900,month-1,date);
    int mod = d.getDay();
    System.out.println("일월화수목금토".charAt(mod));
    int lastDay =0;
    d.setMonth(d.getMonth()+1);
    System.out.println(d.toLocaleString());
    d.setDate(d.getDate()-1);
    System.out.println(d.toLocaleString());
    lastDay = d.getDate();
    System.out.println(lastDay);//마지막 날짜 가져옴
  }///main
}//class

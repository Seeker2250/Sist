package days09;

import java.util.Scanner;

public class Ex01 {
  //만년 달력 만들기
  //return 2개
  //클래스로 만들기
  //String으로 받아서 delimeter로 split 하기
  //Array로 돌리기
//  3 가지 방법이 있지 이번엔 Array로
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] ymArr = getInputYM(sc);
    System.out.println(ymArr[0] + "" + ymArr[1]);
    int year = ymArr[0];
    int month = ymArr[1];
    printCalendar(year, month);
  }

  public static void printCalendar(int year, int month) {
//    1) 우리가 파악 하고자 하는 년 월의 1일이 무슨 요일인지 알아야 해!
//    2024 7월은 월요일이 1일
//    2) 우리가 파악 하고자 하는 년 월의 마지막 날이 무슨 요일인지 알아야 해!
//    2024 7월은 31일 수요일이 마지막 날
    int dayOfWeek = getDayOfWeek(year, month, 1);
    int lastDay = getLastDay(year, month);
    System.out.printf("\t\t\t%d년%d월\n", year, month);
    System.out.print("-".repeat(60) + "\n");
    String strWeek = "일월화수목금토";
    for (int i = 0; i < strWeek.length(); i++) {
      System.out.print("\t" + strWeek.charAt(i));
    }
    System.out.println();
    //날짜 출력
//    공백 찍는 for문 : 1의 위치 잡기
    for (int i = 0; i < dayOfWeek; i++) {
      System.out.print("\t");
    }
    //밑에껀 날짜 찍는 거
    for (int i = 1; i <= lastDay; i++) {
      System.out.printf("\t%d", i);
      if ((dayOfWeek + i) % 7 == 0) System.out.println();
    }
    System.out.println();

    System.out.print("-".repeat(60)+"\n");
  }

  private static int getDayOfWeek(int year, int month, int day) {
    //test : 2020년 5월
    //참고 : 1년 1월 1일은 월요일
    int totalDays = getToTalDays(year, month, day);
    int dayOfWeek = totalDays % 7;//0~6 = 일~ 토
    System.out.printf("%d.%d.%d [%d]일 (%c요일)\n", year, month, day, totalDays, "일월화수목금토".charAt(dayOfWeek));
    return dayOfWeek;
  }

  private static int getLastDay(int year, int month) {
    int lastDay = 0;
    int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};// index랑 moths 달라
    lastDay = months[month - 1];
    if (Ex02.isLeapYear(year) && month == 2) lastDay++;
//    switch (month) {
//      case 1:
//      case 3:
//      case 5:
//      case 7:
//      case 8:
//      case 10:
//      case 12:
//        lastDay = 31;
//        break;
//      case 4:
//      case 6:
//      case 9:
//      case 11:
//        lastDay = 30;
//        break;
//      case 2:
//        lastDay = Ex02.isLeapYear(year) ? 29 : 28;
//        break;
//    }
    return lastDay;
  }

  private static int getToTalDays(int year, int month, int day) {
    //0001.01.01~2020.05.01
    //365 * (2020-1) + 31 + 28(or29) + 31 +30 + 1
    int totalDays = 0;
    for (int i = 1; i < year; i++) {
      totalDays += Ex02.isLeapYear(i) ? 366 : 365;
    }//    2019년까지의 총 날짜 계산한 것
    int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};// index랑 moths 달라
    for (int i = 0; i < month - 1; i++) {//5월이라 하면 4월까지 돌아야 하니까 -1
      totalDays += months[i];
    }
    if (Ex02.isLeapYear(year) && month >= 3) {
      totalDays++;//윤년인 년도에 3월 이후라면 더해야지(1월 2월은 필요없잖아)
    }
    totalDays++;//5월 1일이니까 하루 더한 거
//
    return totalDays;
  }

  private static int[] getInputYM(Scanner sc) {
    int[] ymArr = new int[2];
    System.out.println("년도와 월을 입력하세요.");
    int year = sc.nextInt();
    int month = sc.nextInt();
    ymArr[0] = year;
    ymArr[1] = month;
    return ymArr;
  }
}

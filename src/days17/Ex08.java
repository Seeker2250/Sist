package days17;

import java.util.Date;

/**
 * @author created by Seeker2250 on 7/23/24.
 * @Subject     날짜 + 시간 다루는 class
 * @Contents    형식화 class & Collection Framework
 *
 *              jdk 1.0 jdk utll.Date
 *              jdk 1.1 jdk utll.Calendar
 *                                    ㄴ GregorianCalendar
 *              jdk 1.8 java.time package + 하위 패키기
 *                            다양한 날짜 / 시간 클래스 추가
 *
 *              Java IO
 *              Enum,generic
 *              다음주 월화수 프로젝트-> 목요일에 Lambda
 *              Lambda, with Stream
 */
public class Ex08 {
  public static void main(String[] args) {

    Date d = new Date();
    System.out.println(d.toString());
    System.out.println(d);//toString 생략
    System.out.println(d.toLocaleString());
    System.out.println(d.toGMTString());

//    년 월 일 시 분 초 요일

    System.out.println(d.getYear()+1900);
    System.out.println(d.getMonth()+1);
    System.out.println(d.getDate());
    System.out.println(d.getHours());
    System.out.println(d.getMinutes());
    System.out.println(d.getSeconds());
    System.out.println(d.getDay());//0이 일요일, 6이 토요일

    d.getTime();//return type long이야
//    1900.01.01 00:00:00 ~ ms를 long으로 return하는 method
    Date d2 = new Date(d.getTime());
    System.out.println(d2.toLocaleString());

  }//main
}//class

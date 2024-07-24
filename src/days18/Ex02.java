package days18;

import days16.ScoreOutOfboundException;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author created by Seeker2250 on 7/24/24.
 * @Subject 형식화(format) class
 * @Contents
 * 1. SimpleDateFormat
 * 2. DecimalFormat
 * 3. ChoiceFormat
 * 4. MessageFormat
 */
public class Ex02 {
  public static void main(String[] args) throws ParseException {
//  (1)

//    Calendar c = Calendar.getInstance();
//    Date d = c.getTime();
//
//    String pattern = "yyyy.MM.dd (E) hh:mm:ss";//요일까지
//    SimpleDateFormat sdf = new SimpleDateFormat(pattern);//날짜를 원하는 형식으로 간단하게 처리할 수 있게 해주는 format
//    String s = sdf.format(d);//날짜를 매개변수로 받아서 String으로 돌려주는 것
//    System.out.println(s);


//    (2)
//    String s = "2024/07/24";//String인데 날짜 객체로 만들거어!
//    Date d = new Date(s);
//    System.out.println(s);
//    // 문자열 -> Date

    String s = "2024.07.24 (수)";
    String pattern = "yyyy.MM.dd (E)";//요일까지
    SimpleDateFormat sdf = new SimpleDateFormat(pattern);
    Date d = sdf.parse(s);//parse()가 String을 Date로

    System.out.println(d.toLocaleString());
//    Date d -> Calendar c변환
    Calendar c = Calendar.getInstance();
    c.setTime(d);
  }
}

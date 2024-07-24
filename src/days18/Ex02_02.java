package days18;

import java.text.DecimalFormat;
import java.text.ParseException;

/**
 * @author created by Seeker2250 on 7/24/24.
 * @Subject
 * @Contents
 */
public class Ex02_02 {
  public static void main(String[] args) throws ParseException {
//    Decimal Format
    int money = 3276500; // "3,276,500"

//    (1)
//    String smoney = String.format("%,d",money);
//    System.out.println(smoney);

//    (2)
//    String pattern = "#,###";//3자리 마다 , 찍겠다  .#과 .0차이 조심하기  0은 반드시 소수점 표기, #은 없다면 생략

//    String pattern = "\u00A4#,###.00";//\u00A4는 원화표시
//    DecimalFormat df = new DecimalFormat(pattern);
//    String smoney = df.format(money);
//    System.out.println(smoney);

//    (3)
    String s = "3,123.23";
//    (3-1)
//    s = s.replace(",","");
//    System.out.println(s);
//    double d = Double.parseDouble(s);
//    System.out.println(d);

      String pattern = "#,###.00";
    DecimalFormat df = new DecimalFormat(pattern);
    double d = (double) df.parse(s);
    System.out.println(d);
  }
}

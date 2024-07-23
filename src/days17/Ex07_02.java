package days17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author created by Seeker2250 on 7/23/24.
 * @Subject
 * @Contents
 */
public class Ex07_02 {
  public static void main(String[] args) {
    String source = "HP:010-1234-5678, HOME:02-999-0099";
    String regex = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
    Pattern p = Pattern.compile(regex);
    Matcher m = p.matcher(source);

//    matches()
    int no = 1;
    while (m.find()) {//find()는 boolean return
      System.out.printf("%d : %s \t %s \t %s \t %s\n", no++, m.group(), m.group(1), m.group(2), m.group(3));
    }
  }//main
}//class

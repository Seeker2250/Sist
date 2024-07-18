package days14;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author created by Seeker2250 on 7/18/24.
 * @Subject
 * @Contents
 */
public class RepeatYesterday_02 {
  public static void main(String[] args) {
//    Algorithm
    String n = "keNik";
    String m = "kKnie";
    n = n.toLowerCase().chars().sorted()
        .collect(StringBuilder::new,
            StringBuilder::appendCodePoint,
            StringBuilder::append
        ).toString();//stream 만들어
//
//    Stream.of(m.toLowerCase().toCharArray()); 같아
    Stream.of(m.toLowerCase().split(" "))
        .sorted()
        .collect(Collectors.joining());//위랑 똑같아

  }//main
}//class

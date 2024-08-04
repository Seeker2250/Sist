package days23;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author created by Seeker2250 on 8/2/24.
 * @Subject
 * @Contents
 */
public class Ex10 {
  public static void main(String[] args) {
    Stream<String[]> strArrStrm = Stream.of(
        new String[]{"abc", "def", "jkl"},
        new String[]{"ABC", "GHI", "JKL"}
    );
//    new String[]{"abc", "def", "jkl"} elements -> Stream<String>
//  Stream<Stream<String>>이 Stream<String>되는 것
    Stream<String> s2 = strArrStrm.flatMap(Arrays::stream);
//    map() -> flatMap() 차이점 이해
    s2.map(String::toLowerCase).distinct().sorted().forEach(System.out::println);
  }//main
}//class

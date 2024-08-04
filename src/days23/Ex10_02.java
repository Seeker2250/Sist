package days23;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author created by Seeker2250 on 8/2/24.
 * @Subject
 * @Contents
 */
public class Ex10_02 {
  public static void main(String[] args) {
    String[] lineArr = {
        "Believe or not It is true",
        "Do or do not There is no try",
    };
    Stream<String> s = Arrays.stream(lineArr);
    s.flatMap(line -> Stream.of(//한 문자열을 가져와서 Stream으로, 따라서 문자열들을 하나의 stream으로 만들어
            line.split("\\s+")))//나눠
        .map(String::toLowerCase)//소문자 만들어
        .distinct()//중복 제거
        .sorted()//분류
        .forEach(System.out::println);//출력(최종 연산)

//    Stream<String> strStrm1 = Stream.of("AAA", "ABC", "bBb", "Dd");
//      Stream<String> strStrm2 = Stream.of("bbb", "aaa", "ccc", "dd");
//
//      Stream<Stream<String>> strStrmStrm = Stream.of(strStrm1, strStrm2);
//
//      Stream<String> strStream = strStrmStrm
//                           .map(s -> s.toArray(String[]::new))
//                            .flatMap(Arrays::stream);
//      strStream.map(String::toLowerCase)
//             .distinct()
//             .forEach(System.out::println);

  }//main
}//class

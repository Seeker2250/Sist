package days23;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author created by Seeker2250 on 8/2/24.
 * @Subject
 * @Contents
 */
public class Ex12 {
  public static void main(String[] args) {
//    Terminal Operation(최종 연산)
    String[] strArr = {
        "Inheritance", "Java", "Lambda", "stream",
        "OptionalDouble", "IntStream", "count", "sum"
    };

//    Array->Stream
//    Stream.of(strArr).forEach(System.out::println);
//    boolean result = Arrays.stream(strArr).noneMatch(s->s.isEmpty());
//    boolean result = Arrays.stream(strArr).noneMatch(s->s.length()==0);
//    boolean result = Arrays.stream(strArr).noneMatch(String::isEmpty);
//    System.out.println(result);

//    Optional<String> o1 = Stream.of(strArr).filter(s->s.charAt(0)=='s').findFirst();
//    System.out.println(o1.get());

//    reduce()
    IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);

    int count = intStream1.reduce(0, (a,b)->a+1);//elxements 하나씩 가져와서 누적 연산
    System.out.println(count);//elements의 갯수

    IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
    int sum = intStream2.reduce(0, (a,b) -> a+b);//elxements 하나씩 가져와서 누적 연산
    System.out.println(sum);//elements들의 길이 누적 합

    IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
    OptionalInt max = intStream3.reduce(Integer::max);
    System.out.println(max.getAsInt());
//    System.out.println(Arrays.toString(intStream3.toArray()));

    IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);
    OptionalInt min = intStream4.reduce(Integer::min);
    System.out.println(min.getAsInt());
//    System.out.println(Arrays.toString(intStream4.toArray()));
  }//main
}//class

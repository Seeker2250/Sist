package days23;

import java.sql.Struct;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author created by Seeker2250 on 8/2/24.
 * @Subject
 * @Contents
 */
public class Ex09 {
  public static void main(String[] args) {
    Stream<Student> s = Stream.of( //Stream object
//       배열이든 string이든 같은 방법으로 처리 가능
        new Student("이자바", 3, 300),
        new Student("김자바", 1, 200),
        new Student("안자바", 2, 100),
        new Student("박자바", 2, 150),
        new Student("소자바", 1, 200),
        new Student("나자바", 3, 290),
        new Student("감자바", 3, 180)
    );
//    s라는 stream의 map은 elements를 바꿀거야
//    근데 mapToInt하면 int로 바뀌겠지(IntStream을 return할거야)
//    Stream<Integer> = s.mapToInt(Student::getTotalScore);는 boxing unboxing해서 비효율적이야
    IntStream is = s.mapToInt(Student::getTotalScore);
//    System.out.println(is.sum());를 쓰면 최종연산이기 때문에 사용하면 Stream 다시 생성해야 해
    IntSummaryStatistics stat = is.summaryStatistics();
    System.out.println(stat.getSum());
    System.out.println(stat.getAverage());
    System.out.println(stat.getCount());
    System.out.println(stat.getMax());
    System.out.println(stat.getMin());

//    s.sorted(Student::compareTo).forEach(System.out::println);

//    System.out.println();
//    s.sorted(Comparator.comparing(Student::getBan)
//            .thenComparing(Comparator.naturalOrder()))//반 정렬 후 성적 순 정렬
//            .forEach(System.out::println);
  }//main
}


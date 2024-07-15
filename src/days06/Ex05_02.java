package days06;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.IntStream;

public class Ex05_02 {
  public static void main(String[] args) {
    //람다식과 스트
    // 1~100 까지의 임의의 정수      10개 배열 m
    // 합
    // 갯수
    // 평균
    // 최대값
    // 최소값
//    IntStream istream = new Random().ints(1, 101).limit(10);
//    long cnt = istream.count();
//    int sum = istream.sum();
//    OptionalDouble adAvg;

    IntStream istream = new Random().ints(1, 101).limit(10);
    long cnt = istream.count();
    int sum = istream.sum();
    OptionalDouble odAvg = istream.average();
    double avg = odAvg.getAsDouble();
    OptionalInt oiMax =    istream.max();
    int max = oiMax.getAsInt();

    IntStream.of( 4, 2, 1, 5, 3).max().ifPresent(System.out::println);

//Ex04_02.java
    int [] m = new int [10];
    max = m[0];
    for (int i = 0; i < m.length; i++) {
      m[i] = (int) (Math.random()*100)+1;
      if(m[i]>max)
        max = m[i];
    }//배열 값 출력 Arrays class, toString()

//    int []로부터 IntStream
    IntStream.of(m).filter(i->i>75).toArray();
    System.out.println(Arrays.toString(m));
//    만약 75보다 큰 뭐시기
//    System.out.println(Arrays.toString(m));
//    for (int i = 0; i < m.length; i++) {
//      if(m[i] > 75){
////        뭘 하겠다
//      }
//    }
  }
}

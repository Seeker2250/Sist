package days06;

import java.util.Random;
import java.util.stream.IntStream;

public class Ex04_04 {
  public static void main(String[] args) {
//    Ch. 16 람다식
//    Ch. 17 스트림
//    0~100 점수 Math.random()
//    1~45 로또번호 Math.random()
//    Random(java.util.Random class)

    Random rnd = new Random();
//    rnd.nextInt(int bound);
    int num = rnd.nextInt(3);// 0, 1, 2 <3
    int lotto = rnd.nextInt(45)+1;
//    rnd.nextBollean() true, false
//    rnd.nextInt() -21억~21억 랜덤
    int [] m = new Random().ints(1,101).limit(10).toArray();
//
    int max = new Random().ints(1,101).limit(10).max().getAsInt();
  }
}

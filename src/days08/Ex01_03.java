package days08;

import java.util.Random;

public class Ex01_03 {
  public static void main(String[] args) {
    //method chaining!
    new Random().ints(1, 46) //1~46 정수
        .distinct()//중복 제거
        .limit(6)//최대 6개
        .forEach(System.out::println);//Systen.out.println이랑 같아, method reference
//    .forEach(lotto -> System.out.println(lotto))와 같아(람다식)
  }
}

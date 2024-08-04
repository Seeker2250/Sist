package days23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author created by Seeker2250 on 8/1/24.
 * @Subject
 * @Contents
 * 1. 데이터 소스( 배열, 컬렉션 , 임의의 수,  파일 등등 )마다
 *    다른 방식으로 데이터를 처리하는 문제점을  해결하기 위해서 만든 것이 "스트림"이다.
 *    똑같은 소스를 다룬다는 측면에서(표준화) -> 배열 느낌...?
 */
public class Ex06 {
  public static void main(String[] args) {
    String [] arr = {"aaa", "ccc", "ddd", "bbb"};
//    arr[0] = "add";
    ArrayList<String> list = new ArrayList<String>();
    list.add("ddd");
    list.add("aaa");
    list.add("ccc");
    list.add("bbb");

//   Array -> Stream
//    Array를 Stream으로
    Stream<String> s1 = Arrays.stream(arr);
    s1.forEach(System.out::println);

    System.out.println("-".repeat(30));
//    Collection object인 ArrayList -> Stream으로
    Stream<String> s2 = list.stream();
    s2.forEach(System.out::println);
    ArrayList<Integer> al = new ArrayList<>();

  }
}

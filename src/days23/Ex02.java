package days23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

/**
 * @author created by Seeker2250 on 8/1/24.
 * @Subject
 * @Contents
 */
public class Ex02 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      list.add(i);
    }//for
    list.forEach(i -> System.out.println(i));
//    method reference
    list.forEach(System.out::println);
    System.out.println("-".repeat(30));
    list.removeIf(i -> i % 2 == 0);
    list.forEach(System.out::println);
    System.out.println("-".repeat(30));
    list.replaceAll(i -> i * 2);
    list.forEach(System.out::println);
    System.out.println("-".repeat(30));
    Map<String, String> map = new HashMap<>();
    map.put("1","1");
    map.put("2","2");
    map.put("3","3");
    map.put("4","4");

    map.forEach((k,v)-> System.out.println(k+"/"+v));
  }
}

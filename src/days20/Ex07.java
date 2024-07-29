package days20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author created by Seeker2250 on 7/26/24.
 * @Subject
 * @Contents
 * Anonymous class 무명 클래스 익명 클래스
 * declare format : new Parent class (parameter) {
 *                            @Override
 *                            부모 method(){}
 *                            @Override
 *                            부모 method(){}
 *                        }
 *                        new Parent Interface (parameter){
 *                          @Override
 *  *                       부모 method(){}
 *  *                       @Override
 *  *                       부모 method(){}
 *                        }
 */
public class Ex07 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    Collections.addAll(list, 3, 5, 2, 4, 1);
    System.out.println(list);
//    내림차순으로 정렬해서 출력하고 싶으면?
//    list.sort(new Comparator<Integer>() {// Anonymous Class
//      @Override
//      public int compare(Integer o1, Integer o2) {
//        return o1.compareTo(o2);
//      }
//    });
    list.sort((o1,o2)->o2.compareTo(o1));//lambda
    System.out.println(list);


  }
}

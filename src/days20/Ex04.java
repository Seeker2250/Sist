package days20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import static java.util.Collections.*;

/**
 * @author created by Seeker2250 on 7/26/24.
 * @Subject   Collection 마지막
 * @Contents  Arrays, Collections method 정리
 */
public class Ex04 {
  public static void main(String[] args) {
//    Arrays Class : Array를 사용하기 쉽도록 기능이 구현된 클래스
//    Arrays.sort();
//    Arrays.binarySearch();
//    Arrays.toString();
//    Arrays.fill();

//    Collections : Collection을 사용하기 쉽도록 기능이 구현된 클래스
//    Collections.reverseOrder();
    ArrayList<Integer> list = new ArrayList<Integer>();
//    list.add(3);
//    list.add(2);
//    list.add(4);
//    list.add(5);
//    list.add(1);

    addAll(list, 3,2, 4, 5, 1);
    System.out.println(list);
    rotate(list, 2);//오른쪽으로 2칸씩 회전
    System.out.println(list);
    rotate(list, -2);//왼쪽으로 2칸씩 회전
    System.out.println(list);
    swap(list,0,3);
    System.out.println(list);
    shuffle(list);//임의의 자리로 변경, 섞기
    System.out.println(list);
    shuffle(list);
    System.out.println(list);
    sort(list);//오름차순 정렬
    System.out.println(list);
    sort(list, (a,b)->b-a);//lambda
    System.out.println(list);
    sort(list);
    System.out.println(list);
    sort(list, Collections.reverseOrder());
    System.out.println(list);
    fill(list, -1);
    System.out.println(list);
  }//main
}//class

package days19;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author created by Seeker2250 on 7/25/24.
 * @Subject Set
 * @Contents TreeSet
 * 중복 X, 순서 X
 * Binary Search Tree 구조로 데이터 저장하는 Collection Class
 * LinkedList처럼 node가 서로 연결된 구조
 * 최상위 노드 == root
 */
public class Ex11 {
  public static void main(String[] args) {
//                      [0x100][7][0x200]
//
//         [0x300][4][0x400]        [null][9][null]
//               0x100                  0x200
//   [null][1][null]    [null][5][0x500]
//         0x300             0x400
//                                 [null][6][null]
//                                      0x500
    TreeSet<Integer> ts = new TreeSet<>();
    ts.add(7);
    ts.add(4);
    ts.add(9);
    ts.add(1);
    ts.add(5);
    ts.add(6);
    System.out.println(ts);
//    정렬된 순서의 첫, 마지막
    System.out.println(ts.first());
    System.out.println(ts.last());

//    범위 검색
    SortedSet<Integer> ss = ts.subSet(4, 7);
    System.out.println(ss);//4~6

//    1보다 큰 값을 가진 가장 가까운 값 반환
    System.out.println(ts.higher(1));
//    4보다 작은 값을 가진 가장 가까운 값 반환
    System.out.println(ts.lower(4));
//    지정된 값과 같은 객체를 반환
//    tree에 없으면 작은 값을 가진 객체 중 가장 가까운 값
    System.out.println(ts.floor(3));
//    지정된 값과 같은 객체를 반환
//    tree에 없으면 큰 값을 가진 객체 중 가장 가까운 값
    System.out.println(ts.ceiling(3));
  }
}

package days19;

import java.util.HashSet;
import java.util.Set;

/**
 * @author created by Seeker2250 on 7/25/24.
 * @Subject
 * @Contents
 * Set - 순서X 중복X
 *       HashSet Colletion Class
 *       순서가 있는 Set은 LinkedHashSet Collection Class
 *
 */
public class Ex07 {
  public static void main(String[] args) {
    HashSet hs = new HashSet<>();//initial capacity 16
    hs.add(9);
    hs.add(10);
    hs.add(15);
    hs.add(11);
    hs.add(10);
//    순서가 유지되지 않는다. 오름차순으로 정렬된다
    System.out.println(hs);
    hs.add(11);//중복 비허용
    System.out.println(hs);


  }
}

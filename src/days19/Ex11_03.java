package days19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * @author created by Seeker2250 on 7/25/24.
 * @Subject
 * @Contents
 */
public class Ex11_03 {
  public static void main(String[] args) {
    int[] score = {80, 95, 50, 85, 45, 65, 10, 100};

    for (int i = 0; i < score.length; i++) {
      if (score[i] > 80) System.out.println(score[i]);
    }

// int []  ->    TreeSet<Integer> 변환
/* [1]
    TreeSet<Integer> ts = new TreeSet<>();
     for (int i = 0; i < score.length; i++) {
       ts.add( score[i] );
    }
*/

// [2] int []  ->    TreeSet<Integer> 변환

  /*  Integer [] 변환 -> List<Integer> -> TreeSet<Integer>
   Integer[] scoreArray = new Integer[]{80,95,50,85,45,65,10,100};
   TreeSet<Integer> ts = new TreeSet<Integer>(Arrays.asList(scoreArray));
 */

/*[3]
  TreeSet<Integer> treeSet = Arrays.stream(score)
          .boxed()
          .collect(TreeSet::new, TreeSet::add, TreeSet::addAll);

          method reference
*/

/*[4]
      Integer [] score ;
      TreeSet<Integer> ts = new TreeSet<>();
      Collections.addAll(ts, score);
      */

    // int [] -> IntStream  -> boxed() Stream<Integer>-> collect() List ->  (ArrayList<Integer>)  -> TreeSet<Integer> 변환
    ArrayList<Integer> list =  (ArrayList<Integer>) Arrays
        .stream(score)//IntStream
        .boxed() //Integer가 담긴 Stream으로 변환시켜
        .collect(Collectors.toList());//그걸 List로

    TreeSet<Integer> ts = new TreeSet<Integer>(list);
    System.out.println(ts.tailSet(80));
    System.out.println(ts.tailSet(80,true));//80 포함
    System.out.println(ts.tailSet(80,false));//80을 제외한 큰 놈들
    System.out.println(ts.headSet(80,false));//80보다 작은 놈들
    System.out.println(ts.headSet(80,true));//80포함 작은 놈들
  }
}

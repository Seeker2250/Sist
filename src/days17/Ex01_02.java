//package days17;
//
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Comparator;
//
///**
// * @author created by Seeker2250 on 7/23/24.
// * @Subject
// * @Contents
// */
//public class Ex01_02 {
//  public static void main(String[] args) {
//    int [] m = {3, 5 , 2, 4, 1};
//    System.out.println(Arrays.toString(m));
//
////    Integer [] m = { 3, 5, 2, 4, 1 };
//    System.out.println( Arrays.toString( m ) );
//
//    //Arrays.sort(m, new 비교자());
//      /*
//      Arrays.sort(m, new Comparator<Integer>() {
//
//         @Override
//         public int compare(Integer o1, Integer o2) {
//             return  o2 - o1;
//         }
//      });
//      */
//
//      /*
//      Arrays.sort(m, (Integer o1, Integer o2)->{
//          return  o2 - o1;
//      });
//      */
//
//    Arrays.sort(m, (o1, o2)-> o2 - o1);
//
//
//    System.out.println( Arrays.toString( m ) );
//
//
//
//      /*
//      Arrays.sort(m);  // ASC(오름차순 정렬)
//      System.out.println( Arrays.toString( m ) );
//      int [] temp = new int[m.length];
//      for (int i = 0; i < m.length; i++) {
//         temp[temp.length-1 -i] = m[i];
//      }
//      System.out.println( Arrays.toString( temp ) );
//      */
//
//      /*
//      // IntStream -> Stream<Integer>
//      Integer [] temp = Arrays.stream(m).boxed().toArray(Integer[]::new);
//      Arrays.sort(temp, Collections.reverseOrder());
//      System.out.println( Arrays.toString( temp ) );
//      */
//
//
//
//  } // main
//
//} // class
//
//
//class asfd implements Comparator {
//
//  @Override
//  public int compare(Object o1, Object o2) {
//
//    int a = (int) o1;
//    int b = (int) o2;
//
//    return b - a;
//  }//override
//}//class
//
//
////    Arrays.sort(m);
////    System.out.println(Arrays.toString(m));
////    int [] temp = new int [m.length];
////    for (int i = 0; i < m.length; i++) {
////      temp[temp.length-1-i] = m[i];
////    }
////    System.out.println(Arrays.toString(temp));
////    lambda & stream에서 stream은 모든 것들을 같은 방식, 같은 타입으로 입출력 하겠다는 거
////    IntStream -> Stream<Integer>
//
////    primitive data -> Wrapper class 하는 게 Boxing
////    Wrapper class -> primitive data 하는 게 Unboxing
//
////    Integer [] temp = Arrays.stream(m).boxed().toArray(Integer[]::new);//새로운 배열을 생성하겠다.
////    Arrays.sort(temp,Collections.reverseOrder());
////    System.out.println(Arrays.toString(m));
//

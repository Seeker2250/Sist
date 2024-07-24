package days18;

import days03.Ex04;

import java.util.*;
import java.util.function.Predicate;

/**
 * @author created by Seeker2250 on 7/24/24.
 * @Subject
 * @Contents
 */
public class Ex04_02 {
  public static void main(String[] args) {
//    Array 단점 : append, remove
//    <E> class : generic class, Elements의 E
    ArrayList list = new ArrayList(3);//initial capacity는 10이래
    System.out.println(list.size());//elements 수를 return
    list.add("아무거나");
    list.add("넣어도");
    list.add(89453);
    list.add("괜찮아~");
    System.out.println(list.size());
    System.out.println(list);//.toString 생략
//    Object의 .toString을 패키지명 클래스명 16진수 hash값 나왔으니 이건 Override된거야
    list.add("넣어도");
    System.out.println(list.contains("넣어도"));
    System.out.println(list.indexOf(89453));
    System.out.println(list.indexOf("넣어도"));
    System.out.println(list.lastIndexOf(89453));
    System.out.println(list.lastIndexOf("넣어도"));


//    3 index elements 값을 얻어와서 출력
//    Array[3]
//    list.clear(); 모든 elements 삭제

    System.out.println(list);
    list.set(1,"Seeker");//Update
    System.out.println(list);
    System.out.println(list.get(3));
    System.out.println(list);
    System.out.println(list.remove(list.indexOf("넣어도")));
    System.out.println(list);

//    list.removeIf(t-> t.equals("괜찮아~"));
    System.out.println(list);
    System.out.println(list.isEmpty());

//    list.sort((Comparator.reverseOrder()));
//    list.sort(new Comparator<String>() {
//      @Override
//      public int compare(String s1, String s2) {
//        return o1.com;
//      }
//    });

//    list의 모든 요소를 출력
//    for (int i = 0; i < list.size(); i++) {
//      System.out.println(list.get(i));
//    }


//    Iterator
    Iterator ir = list.iterator();
    while(ir.hasNext()){
      Object objects = ir.next();
      System.out.println(objects);
    }

  }//main
}//class

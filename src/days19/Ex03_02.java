package days19;

import java.util.LinkedList;

/**
 * @author created by Seeker2250 on 7/25/24.
 * @Subject
 * @Contents
 */
public class Ex03_02 {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.add("김준석");
    list.add("박준용");
    list.add("김재민");
    System.out.println(list);

    System.out.println(list.get(0));
    System.out.println(list.getFirst());
    System.out.println(list.peekFirst());
    list.addFirst("LinkedList1");
    System.out.println(list.peekFirst());
    list.addLast("end");
    System.out.println(list.offerFirst("냐미"));
    System.out.println(list);
    //                읽기     삽입/삭제     비고
    // ArrayList     빠르다     느리다       순차적으로 추가,삭제 빠르다.(배열을 사용하기 때문)
    // LinkedList    느리다.    빠르다       데이터 많으면 많을 수록 접근성은 떨어진다.(Node 기반)
    // Vector는 ArrayList와 기본적으로 같다고 생각하면 편하다(동기화 처리)


  }//main
}//class

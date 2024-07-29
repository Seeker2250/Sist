package days19;

import java.util.LinkedList;
import java.util.WeakHashMap;

/**
 * @author created by Seeker2250 on 7/25/24.
 * @Subject
 * @Contents [LinkedList]
 * Singly / Doubly / Cicular / Circular Doubly
 * 1) Array : 읽기 성능은 가장 빠르고 좋아
 * 삽입 삭제 너무 느려
 * <p>
 * 2) LinkedList : 비연속적 삽입, 삭제 성능 빨라
 */
public class Ex03 {
  public static void main(String[] args) {
//  LinkedList 만들어보자.
    Node node1 = new Node();
    node1.value = 10;

    Node node2 = new Node();
    node2.value = 20;

    node1.next = node2;

    Node node3 = new Node();
    node3.value = 30;

    node2.next = node3;

    Node node4 = new Node();
    node4.value = 40;

    node3.next = node4;

    Node node5 = new Node();
    node5.value = 50;

    node4.next = node5;


//    node1 시작 노드로부터 모든 노드의 value출력
    Node node = node1;
    while(node != null){
      System.out.println(node.value);
      node = node.next;
    }
  }//main
}//class

class Node {
  int value;//값

  Node next = null;//다음 노드 주소

  Node prev = null;

}

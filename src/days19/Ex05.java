package days19;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author created by Seeker2250 on 7/25/24.
 * @Subject
 * @Contents
 * Queue(FIFO)
 * Deque
 */
public class Ex05 {
  public static void main(String[] args) {
    Queue q = new LinkedList();//Queue는 interface야 그래서 LinkedList를 보면 이건 Deque의 concrete class야
    q.offer("냠냠");
    q.offer("냠1");
    q.offer("냠2");
    q.offer("냠3");
    while (!q.isEmpty()){
      System.out.println(q.poll());
    }//Deque
    Deque d = new LinkedList();


  }//main
}//class

package days19;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author created by Seeker2250 on 7/25/24.
 * @Subject
 * @Contents
 * Priority Queue
 * 우선순위 큐는 FIFO 아니야
 * 우선순위가 높은 것부터 꺼내와
 * (작은 숫자가 우선 순위가 높다)
 *
 */
public class Ex06 {
  public static void main(String[] args) {
    Queue q= new PriorityQueue();
    q.offer(3);
    q.offer(5);
    q.offer(2);
    q.offer(4);
    q.offer(1);
    while(!q.isEmpty()){
      System.out.println(q.poll());
    }
  }
}

package days19;

import java.util.Stack;

/**
 * @author created by Seeker2250 on 7/25/24.
 * @Subject
 * @Contents
 * Stack
 * LIFO(=FILO)  ->  push(), pop() : stack에서 가져오기 peek() : 뭔지 알고 가지고 와, stack안에는 남아 있어
 *
 */
public class Ex04 {
  public static void main(String[] args) {
    Stack s = new Stack<>();
    s.push("김준석");
    s.push("김재민");
    s.push("김선우");
    s.push("Test");

    System.out.println(s.search("김준석"));//lastIndexOf같지

    while (!s.empty()){
      System.out.println(s.pop());
    }

  }
}

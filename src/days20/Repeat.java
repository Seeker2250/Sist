package days20;

import java.util.*;

/**
 * @author created by Seeker2250 on 7/26/24.
 * @Subject
 * @Contents
 */
public class Repeat {
  public static void main(String[] args) {
    LinkedHashSet lhs;
    ArrayList al = new ArrayList();
    Scanner sc = new Scanner(System.in);
    System.out.println("횟수 입력");
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      lhs = new LinkedHashSet();
      forLotto(lhs);
      al.add(lhs);
    }//for
  }//main


  private static void forLotto(LinkedHashSet lhs) {
    Random r = new Random();
    int n = 0;
    while (lhs.size() < 6) {
      n = r.nextInt(45) + 1;
      lhs.add(n);
    }//while
    ArrayList al = new ArrayList<>(lhs);
    Collections.sort(al);
    Iterator ir = al.iterator();
    while (ir.hasNext()) {
      int n2 = (int) ir.next();
      System.out.print("[" + n2 + "]");
    }
    System.out.println();
  }//fillLotto
}//class

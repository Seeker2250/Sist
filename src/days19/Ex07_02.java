package days19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/**
 * @author created by Seeker2250 on 7/25/24.
 * @Subject
 * @Contents
 */
public class Ex07_02 {
  public static void main(String[] args) {
      //days11.Ex05.java lotto
    HashSet lotto = new HashSet();
    fillLotto(lotto);
    dispLotto(lotto);
  }

  private static void dispLotto(HashSet lotto) {
    Iterator ir = lotto.iterator();
    while (ir.hasNext()){
      int n = (int)ir.next();
      System.out.print("["+n+"]");
    }
    System.out.println();
  }

  private static void fillLotto(HashSet lotto) {
    Random rnd = new Random();
    int n;
    while (lotto.size()<6){
      n = rnd.nextInt(45)+1;
      lotto.add(n);
    }//while
  }
}

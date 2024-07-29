package days19;

import java.util.*;

/**
 * @author created by Seeker2250 on 7/25/24.
 * @Subject
 * @Contents
 */
public class Ex07_03_02 {
  public static void main(String[] args) {
    int gameNumber = 1;
    Scanner scanner = new Scanner(System.in);
    System.out.print("> 게임 횟수 입력 ? ");
    gameNumber = scanner.nextInt();
    LinkedHashSet lotto;
    ArrayList lottos = new ArrayList();

    for (int i = 1; i <= gameNumber; i++) {
      lotto = new LinkedHashSet();
      fillLotto(lotto);
      lottos.add(lotto);
    }
    Iterator ir = lottos.iterator();
    while(ir.hasNext()){
      lotto = (LinkedHashSet) ir.next();
      dispLotto(lotto);
    }
    System.out.println(lottos);

  }

  private static void dispLotto(LinkedHashSet lotto) {
    Iterator ir = lotto.iterator();
    while (ir.hasNext()) {
      int n = (int) ir.next();
      System.out.print("[" + n + "]");
    }
    System.out.println();
  }

  private static void fillLotto(LinkedHashSet lotto) {
    Random rnd = new Random();
    int n;
    while (lotto.size() < 6) {
      n = rnd.nextInt(45) + 1;
      lotto.add(n);
    }//while
  }
}

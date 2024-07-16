package days11;

import java.util.Random;

/**
 * created by Seeker2250 on 7/15/24.
 */
public class Ex05 {
  public static void main(String[] args) {
//    로또게임 + (게임 횟수 입력)
    int n = 5;
    int[][] lottos = new int[n][6];//로또번호 6자리 저장, n게임
// n차원 배열은 배열의 배열이다.
    for (int i = 0; i < lottos.length; i++) {
      fillLotto(lottos[i]);
    }
    for (int i = 0; i < lottos.length; i++) {
      printLotto(lottos[i]);
    }
  }//main

  private static void fillLotto(int[] lotto) {
    int lottoNumber;

    lotto[0] = (int) (Math.random() * 45) + 1;
    System.out.println(lotto[0]);
    int index = 1;
    while (index <= 5) {
      lottoNumber = (int) (Math.random() * 45) + 1;
      System.out.print(lottoNumber+" ");
      if (!isDuplicate(lotto, lottoNumber, index))
        lotto[index++] = lottoNumber;
    }
  }

  private static boolean isDuplicate(int[] lotto, int lottoNumber, int index) {
    for (int i = 0; i < lotto.length; i++) {
      if (lotto[i] == lottoNumber) {
        return true;
      }
    }
    return false;
  }

  private static void printLotto(int[] lotto) {
    for (int i = 0; i < lotto.length; i++) {
      System.out.print("\n [ " + lotto[i] + " ] ");
    }
  }
}//class

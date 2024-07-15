package days08;

import java.lang.management.MemoryType;

public class Ex01 {
  public static void main(String[] args) {
    //lotto 6/45게임
    int[] lotto = new int[6];
    //      (int)(Math.random()*45)+1;
    //      for (int i = 1; i <= 6; i++) {
    //         lotto[i-1] = rnd.nextInt(45)+1;
    //         System.out.println(num);
    //      }
    fillLotto(lotto);
    printLotto(lotto);
  }

  private static void fillLotto(int[] lotto) {
    int lottoNumber;
      /*중복이면 어쩔거야 n번 더 돌아
       * for (int i = 0; i < lotto.length; i++) {
         lottoNumber = (int)(Math.random()*45)+1;
         lotto[i] = lottoNumber;*/
    lotto[0] = (int) (Math.random() * 45) + 1;
    System.out.println(lotto[0]);
    int index = 1;
    boolean isDuplicate = false;
    while (index <= 5) {
      isDuplicate = false;
      lottoNumber = (int)(Math.random() * 45) + 1;
      System.out.println(lottoNumber);
//      중복체크를 한 후에 중복이 아닌 경우에 대입

      for (int i = 0; i < index; i++) {
        if (lotto[i] == lottoNumber) {
          isDuplicate = true;
          break;
        }
      }
      if (!isDuplicate)
        lotto[index++] = lottoNumber;
    }
  }

  private static void printLotto(int[] lotto) {
    for (int i = 0; i < lotto.length; i++) {
      System.out.print(" [ " + lotto[i] + " ] ");

    }

  }
}

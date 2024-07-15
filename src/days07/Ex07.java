package days07;

public class Ex07 {
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
  }

  private static void printLotto(int[] lotto) {
    for (int i = 0; i < lotto.length; i++) {
      System.out.print(" [ " + lotto[i] + " ] ");

    }

  }
}

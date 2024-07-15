package days08;

public class Ex01_02 {//isDuplicate를 method, 시험 볼거야
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
    while (index <= 5) {
      lottoNumber = (int)(Math.random() * 45) + 1;
      System.out.println(lottoNumber);
//      중복체크를 한 후에 중복이 아닌 경우에 대입
      if (!isDuplicate(lotto, lottoNumber, index))
        lotto[index++] = lottoNumber;
    }
  }

  private static boolean isDuplicate(int[] lotto, int lottoNumber, int index) {
    for (int i = 0; i < lotto.length; i++) {
      if(lotto[i]==lottoNumber){
        return true;
      }
    }
    return false;
  }

  private static void printLotto(int[] lotto) {
    for (int i = 0; i < lotto.length; i++) {
      System.out.print(" [ " + lotto[i] + " ] ");

    }

  }
}

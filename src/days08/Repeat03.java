package days08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Repeat03 {
  //1. 머니(money)를 입력받아서 각 화폐단위의 갯수를
  //   출력하는 코딩을 하세요.
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int money = Integer.parseInt(br.readLine());
    boolean sw = false;
    int standard = 50000;
    int cnt = 0;
    while (standard >= 1) {
      cnt = money / standard;
      money = money % standard;
      System.out.println(standard + "원권은 " + cnt + "개, 남은 돈은 : " + money);
      standard /= sw ? 2 : 5;
      sw = !sw;
    }//while

    //2. 로또645 에서  로또 번호 중복 체크하는 메서드만 선언하세요
    //   isDuplicateLotto()

    //3. 주민등록 번호를 입력받아서 만 나이를 계산하는 메서드만 선언하세요.
    //
//    isDuplicateLotto();
    String rrn = "000225-3891234";
    System.out.println(isGlobalAge(rrn));
  }//main

  public static int isGlobalAge(String rrn) {
    int gender = rrn.charAt(7)-'0';
    int from = 0;
    int pYear = 0;
    switch (gender) {
      case 1:
      case 2:
      case 5:
      case 6:
        from = 1900;
        break;
      case 3:
      case 4:
      case 7:
      case 8:
        from = 2000;
        break;
      default:
        from = 1800;
        break;
    }
    pYear = from + Integer.parseInt(rrn.substring(0,2));
    Calendar cl = Calendar.getInstance();
    pYear = cl.get(Calendar.YEAR)-pYear;
    return Integer.parseInt(rrn.substring(2, 6))>=(((cl.get(Calendar.MONTH)+1)*100)+(cl.get(Calendar.DATE))) ? pYear : pYear+1;
  }

  private static boolean isDuplicateLotto(int[] lotto, int num) {
    for (int i = 0; i < lotto.length; i++) {
      if (lotto[i] == num)
        return true;//중복이야
    }//for
    return false;//중복 아니야
  }//isDuplicate

}

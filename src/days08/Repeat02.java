package days08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Repeat02 {
  public static void main(String[] args) throws IOException {
    //금액 입력 받고 화폐 단위 별 갯수 출력
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String sMoney = br.readLine();
    int money = Integer.parseInt(sMoney);
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
  }//main
}//class
//Call By Reference 설명하기.
//같은 메모리 주소를 참고하여 값을 변경하는 것.
//문자열로 치면 같은 Hash code을 가지고 있는 것을 변경하는 것
//이렇게 해야하는 이유는 다른 메모리에 있는 값을 바꿔봤자 call 할 수 없기 때문에!

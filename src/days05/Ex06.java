package days05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex06 {
  public static void main(String[] args) throws IOException {
    //두 정수 입력 받아서 두 정수 사이 합 구헤
    int n, m, sum = 0;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    for (; ; ) {
      System.out.println("정수 두 개 입력해");
      System.out.println("그만두고 싶으면 0 입력해");
      n = Integer.parseInt(br.readLine());
      if (n == 0)
        break;
      System.out.println("그만두고 싶으면 0 입력해");
      m = Integer.parseInt(br.readLine());
      if (m == 0)
        break;
      System.out.println("n + m = " + n + m);
    }
//    1번 풀이
//    if (m > n) {
//      for (int i = n; i <= m; i++) {
//        System.out.printf("%d+", i);
//          sum+=i
//      }
//    } else {
//      for (int i = m; i <= n; i++) {
//        System.out.printf("%d+", i);
//              sum+=i
//      }
//    }

//    2번 풀이
//    if (n > m) {
//      int temp = n;
//      n = m;
//      m = temp;
//    }
//    if (m > n) {
//      for (int i = n; i <= m; i++) {
//        System.out.printf("%d+", i);
//        sum += i;
//      }
//    }

//    3번 풀이
//    int a;
//    int min = n > a ? a : n;
////    int max = n > m ? n : m;
//    int max = Math.max(n, a);//이게 더 가독성이 좋아
//    for (int i = min; i <= max; i++) {
//        System.out.printf("%d+", i);
//        sum += i;
  //}

  }
}

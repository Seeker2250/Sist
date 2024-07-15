package days06;

public class Ex08 {
  public static void main(String[] args) {
//(1번 풀이)
    int sum = 0;
    for (int i = 0; i < 11; i++) {
      if (i % 2 == 0) {
        System.out.printf("%d+", i);
        sum -= i;
      } else
        System.out.printf("%d-", i);
      sum += i;
    }
//    (2번 풀이)
    sum = 0;
    for (int i = 0; i < 11; i++) {
      System.out.printf(i % 2 == 0 ? "d+" : "%d-", i);
      sum += i % 2 == 0 ? -i : i;
    }

//    3번 풀이
    boolean sw = false;
    for (int i = 0; i < 11; i++) {
      if (!sw) {// 홀수일 때
        System.out.printf("%d+", i);
        sum += i;
      } else {
        System.out.printf("%d+", i);
        sum -= i;
      }
      sw = !sw;
    }

  }
}

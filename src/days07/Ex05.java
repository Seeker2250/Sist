package days07;

public class Ex05 {
  public static void main(String[] args) {
//    계차수열
//    1 + 2 + 4 + 7 + 11 + 16 + 22
//      1   2   3   4    5    6
    int[] arr = new int[21];
    arr[0] = 1;
    for (int i = 1; i <= 20; i++) {
      arr[i] = arr[i - 1] + i;
      System.out.println(i + "번째 항은 " + arr[i]);
    }


    int term = 1;
    int diff = 0;
    int sum = 0;
    for (int i = 1; i <= 20; i++) {
      term += diff;
      System.out.println(i + " 번째 항 " + term);
      diff++;
      sum += term;
    }
    System.out.println(sum);

    // [1] 수학과 방법, 계차수열 합 구하는 공식
       // (n^2-n)/2+1
//       for (int i = 1; i <= 20 ; i++) {
//         term = (int) ((Math.pow(i, 2)-i)/2+1);
//         System.out.printf("%d+", term);
//      }
  }
}

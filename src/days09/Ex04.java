package days09;

import java.util.Arrays;

public class Ex04 {
  //  정수 입력 받아서
//  2진수, 8진수, 16진수 사용
  public static void main(String[] args) {
//    10진수 10이라고 하면 2로 계속 나눠서 안나눠질 때(몫이 0일 때) 나머지를 거꾸로 읽어
//    2진수를 int로 표현(4byte == 32bit)
//    10 --> 00000000 00000000 00000000 00001010

    int[] binaryArr = new int[32];
    System.out.println(Arrays.toString(binaryArr));
    int index = binaryArr.length - 1;
    int n = 10;
    int share, reminder;
    while (n != 0) {
      share = n / 2;//몫
      reminder = n % 2;//나머지
      binaryArr[index--] = reminder;
//      System.out.printf("%d", reminder);
      n = share;

    }
    for (int i = 0; i < binaryArr.length; i++) {
      System.out.print(binaryArr[i]);
      if (i % 8 == 7)
        System.out.print(" ");
    }//for
  }//main
}//class

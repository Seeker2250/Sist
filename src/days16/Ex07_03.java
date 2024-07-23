package days16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author created by Seeker2250 on 7/22/24.
 * @Subject
 * @Contents
 */
public class Ex07_03 {
  public static void main(String[] args) throws IOException {
/*
      문제 설명

      길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는
      문자열을 리턴하는 함수, solution을 완성하세요.
      예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를
      리턴하면 됩니다.

      제한 조건
      n은 길이 10,000이하인 자연수입니다.
      입출력 예
      n   return
      3   "수박수"
      4   "수박수박"
       */
    String result = solution(10);
    System.out.println(result);

  }//main

//  private static void solution(int n) throws IOException {
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    System.out.println("입력해!");
//    int n = Integer.parseInt(br.readLine());
//    char a = '수';
//    char b = '박';
//    String c = "";
//    boolean sw = false;
//    for (int i = 0; i < n; i++) {
//      if (sw == false) {
//        c += a;
//        sw = !sw;
//      } else {
//        c += b;
//        sw = !sw;
//      }
//
//    }
//    System.out.println(c);
//  }

//  private static String solution(int n) {
//    StringBuilder answer = new StringBuilder();
//    boolean sw = true;
//    for (int i = 1; i <= n; i++) {
//      if (sw) {
//        answer.append("수");
//      } else {
//        answer.append("박");
//      }
//      sw = !sw;
//    }
//    return answer.toString();
//  }


  private static String solution(int n) {

    return IntStream.rangeClosed(1, n)
        .mapToObj(i -> i % 2 != 0 ? "수" : "박")
        .collect(Collectors.joining());
  }


//  private static String solution(int n) {
//    StringBuilder answer = new StringBuilder();
//    int a = n / 2;
//    int b = n % 2;
//    for (int i = 1; i <= a; i++)
//      answer.append("수박");
//    if (b == 1)
//      answer.append('수');
//    return answer.toString();
//  }
}//class


package days05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05 {
  public static void main(String[] args) throws IOException {

    //    홀수합 while 사용 1번 풀이
    int sum = 0;
    int i = 0;
    while (i<10){
      i++;
      if(i%2!=0)
        sum+=i;
    }//조건 반복문
    System.out.println(sum);

    //    홀수합 while 사용 2번 풀이
    i = 0;
    sum = 0;
    while (i <= 10){
      if(i % 2 == 0) {
        i++;
        continue;
      }
      System.out.print(i+" ");
      sum+=i;
      i++;
    }//조건 반복문
    System.out.println(sum);
    //두 수를 입력 받아서 두 정수 사이의 합을 출력(for, while)
    int n, m;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    for(;;) {
      System.out.println("두 수를 입력하세오.");
      System.out.println("그만하고 싶다면 99999를 입력하세요.");
      n = Integer.parseInt(br.readLine());
      if(n==99999)
        break;
      m = Integer.parseInt(br.readLine());
      if(m==99999)
        break;
      System.out.println(n + m);
    }
    int b = 0;
    while (true){
      System.out.println("두 수를 입력하세오.");
      System.out.println("그만하고 싶다면 99999를 입력하세요.");
      int q = Integer.parseInt(br.readLine());
      if(q==99999)
        break;
      int w = Integer.parseInt(br.readLine());
      if(w==99999)
        break;
    }

  br.close();
  }
}

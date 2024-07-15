package days05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex04 {
  public static void main(String[] args) throws IOException {
    //    홀수합 for 사용
    int sum = 0;
    for(int i = 1; i < 10; i+=2){
        System.out.print(i+"+");
        sum += i;
    }
    System.out.println(sum);

    //    홀수합 while 사용

    sum = 0;
    int i = 0;
    while (i<10){
      i++;
      if(i%2!=0)
        sum+=i;
    }
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

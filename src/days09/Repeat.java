package days09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Repeat {
  public static void main(String[] args) throws IOException {
//    1. 30 명 학생의 성적처리
    final int NUM = 30;
    String [] names = new String[NUM];
    int [] scores = new int[NUM];
    char con;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int cnt = 0;
    String name;
    int score;

    do{
      System.out.println("이름, 성적을 입력해주세요");

      name = br.readLine();
      names[cnt] = name;
      score = Integer.parseInt(br.readLine());
      scores[cnt] = score;
      cnt++;
      System.out.println("계속 입력할 거라면 Y나 y를 입력해주세요.");
      con = (char) System.in.read();
      System.in.skip(System.in.available());
    }while (Character.toUpperCase(con)=='Y');
    for (int i = 0; i < cnt; i++) {
      System.out.println(names[i]+"는 "+scores[i]+"점");
    }
//2. 1차원, 2차원, 3차원 배열 개념 설명
//    1차원 배열은 수직선, 2차원 배열은 평면, 3차원 배열은 입체
//    n차원이란 것은 결국 배열의 배열의...*n 배열이라는 뜻이다
//    0번째를 가리키면 시작하는 위치를 알아낼 수 있다.
//3. 10진수 125를 2바이트 2진수로 출력하기
    int reminder = 0;
    int share = 0;
    int n = 125;
    String binary = "";
    while (n != 0) {
      share = n / 2;
      reminder = n % 2;
      binary = reminder + binary;
      n = share;
    }
    System.out.println(binary);
//4. 합을 구하는 재귀함수 선언
//    int n=10;
    reHap(n);
  }

  private static int reHap(int n) {
    if(n==1)
     return 1;
    else
      return n+=reHap(n-1);
  }
}

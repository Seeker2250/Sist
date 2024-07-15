package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex12 {
  public static void main(String[] args) throws IOException {
//    점수 입력 받아서 수우미양가 출력 if 사용
    int kor;
    Scanner sc = new Scanner(System.in);
    System.out.println("성적을 입력하세요");
    kor = sc.nextInt();
    if(kor>=90)
      System.out.println("수");
    else if (kor>=80)
      System.out.println("우");
    else if (kor>=70)
      System.out.println("미");
    else if (kor>=60)
      System.out.println("양");
    else
      System.out.println("가");


    //    점수 입력 받아서 수우미양가 출력 switch 사용
    Scanner sc1 = new Scanner(System.in);
    System.out.println("성적을 입력하세요");
    kor = sc1.nextInt();
    switch (kor/10) {
      case (10) :
        System.out.println("수");
        break;
      case (9) :
        System.out.println("수");
        break;
      case (8) :
        System.out.println("우");
        break;
      case (7) :
        System.out.println("미");
        break;
      case (6) :
        System.out.println("양");
        break;
      default:
        System.out.println("가");
        break;
    }
    //    홀수합 for 사용
    int sum = 0;
    for(int i = 0; i<10;i++){
      i++;
      if(i%2!=0)
        sum +=i;
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

  sc.close();
  sc1.close();
  br.close();
  }
}

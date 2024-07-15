package days05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex03 {
  public static void main(String[] args) throws IOException {
//    점수 입력 받아서 수우미양가 출력 if 사용
    int kor;
    Scanner sc = new Scanner(System.in);
    System.out.println("성적을 입력하세요");
    kor = sc.nextInt();
    if (kor>100) {
      System.out.println("다시 입력해주세요");
      kor = sc.nextInt();
    }
    else if(kor>=90)
      System.out.println("수");
    else if (kor>=80)
      System.out.println("우");
    else if (kor>=70)
      System.out.println("미");
    else if (kor>=60)
      System.out.println("양");
    else
      System.out.println("가");

    //강사님 스타일로
    kor = 0;
    Scanner sc1 = new Scanner(System.in);
    boolean flag = false;
    do{
      if(flag){
        //flag 자체가 boolean이라 true / false로 판단, 조건식에 응용 가능
        //이건 다시 돌았다는 의미야.
        System.out.println("오입력 되었습니다.");
        System.out.println("다시 입력해주세요");
      }
      System.out.println("성적 입력하세요");//boolean 선언 하나 해서 flag로 처리, 다시 입력인지 그냥 입력인지 확인할 것
      kor = sc1.nextInt();
    } while (!(kor >= 0 && kor <= 100));
    // while (kor < 0 || kor > 100)랑 같아
    if (90 <= kor) System.out.println("수");
    else if (80 <= kor) System.out.println("우");
    else if (70 <= kor) System.out.println("미");
    else if (60 <= kor) System.out.println("양");
    else System.out.println("가");



    //    점수 입력 받아서 수우미양가 출력 switch 사용
    Scanner sc2 = new Scanner(System.in);
    System.out.println("성적을 입력하세요");
    kor = sc2.nextInt();
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

    //강사님 스타일로
    kor = 0;
    char grades = 'a';
    Scanner sc3 = new Scanner(System.in);
    System.out.println("성적을 입력하세요");
    kor = sc3.nextInt();
    switch (kor/10) {
      case (10) :// jdk 14부터는 case 10, 9처럼 , 표시도 가능해
      case (9) :
        grades = '수';
        break;
      case (8) :
        grades = '우';
        break;
      case (7) :
        grades = '미';
        break;
      case (6) :
        grades = '양';
        break;
      default:
        grades = '가';
        break;
    }
    System.out.println(kor + " : " + grades);
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

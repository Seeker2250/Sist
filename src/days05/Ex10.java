package days05;

import java.util.Scanner;

public class Ex10 {
  public static void main(String[] args) {
//    1. ASCII 한 줄에 10개씩 출력( 라인번호 붙이기 )
    for (int i = 0, lineNum = 1; i < 256; i++) {
      if (i % 10 == 0)
        System.out.print(lineNum++ + "번 ");
      System.out.print((char) i);
      if (i % 10 == 9)
        System.out.println();

    }
    System.out.println("_____________");
//    2. Math.random() 메서드를 사용해서
//    1) 임의의 국어점수(0~100)을 발생하는 코딩하기
    System.out.println((int) (Math.random() * 100));
//    2) 임의의 로또 번호(1~45)를 발생하는 코딩하기
    System.out.println((int) (Math.random() * 45 + 1));
//    3) 임의의 정수(45~87)를 발생하는 코딩하기
    System.out.println((int) (Math.random() * 87 + 45));
//    3. 가위,바위, 보 게임을 구현하기
    System.out.println("1~3의 숫자를 입력해주세요");
    Scanner sc = new Scanner((System.in));
    int user, com;
    user = sc.nextInt();
    com = (int) Math.random() * 3 + 1;
    String[] result = {
        "",
        "가위",
        "바위",
        "보"
    };

    System.out.println("사용자 : " + result[user] + " vs" + " 컴퓨터 : " + result[com]);
    int winner = user - com;
    switch (winner) {
      case 0:
        System.out.println("무승부");
        break;
      case 1:
      case -2:
        System.out.println("유저 승리");
        break;
      default:
        System.out.println("컴퓨터 승리");
        break;
    }
  }

}

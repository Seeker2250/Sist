package days05;

import java.util.Scanner;

public class Ex07 {
  public static void main(String[] args) {
    int com, user;
    int i = 0;
//  원하는 숫자 범위 지정하는 방법
//    (int) Math.random() * (원하는 최댓값) + 원하는 최솟값
    com = (int) Math.random() * 3 + 1;

    Scanner sc = new Scanner(System.in);
    System.out.print("가위(1),바위(2),보(3) 중 선택하세요. ");
    user = sc.nextInt();

    String strUser = "가위";
    if(user == 2) strUser ="바위";
    else if(user ==3) strUser = "보";

    String strCom = "가위";
    if(com == 2) strCom ="바위";
    else if(com ==3) strCom = "보";

    System.out.println("사용자 : " + strUser + " vs" + " 컴퓨터 : " + strCom);
//    user-com으로 값 따져보자
//    컴/사람  가위(1)     바위(2)     보(3)
//    가위(1) 1-1=0       2-1=1(사)  3-1=2(컴)
//    바위(2) 1-2=-1(컴)  2-2=0      3-2=1(사)
//    보(3)  1-3=2(사)   2-3=-1(컴)  3-3=0
//     사람 승리 : 1, -2
//    무승부 : 0
//    컴퓨터 승리 : 2, -1
    switch (user - com) {
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
    int winner = user-com;
    if(winner==0)
      System.out.println("무승부");
    else if (winner==1||winner==-2)
      System.out.println("유저 승리");
    else System.out.println("컴퓨터 승리");

//    Math.random()은 0.0<=double<1.0을 돌리는 method
//    for (int i = 0; i < 10; i++) {
//      System.out.println(Math.random());
//    }
  }
}

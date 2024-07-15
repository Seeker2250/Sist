package days05;

import java.util.Scanner;

public class Ex07_02 {
  public static void main(String[] args) {
    int com, user;
    com = (int) Math.random() * 3 + 1;


    Scanner sc = new Scanner(System.in);

    // Rock Sciissor paper
    String [] rps = {
        "",
        "가위", //rps[1]
        "바위", //rps[2]
        "보", //rps[3]
    };
    boolean check = false;
    System.out.print("가위(1),바위(2),보(3) 중 선택하세요.");
    user = sc.nextInt();
    while(check==false){
      if(user>0 && user < 4) {
        check = true;
        break;
      }
      System.out.println("가위(1),바위(2),보(3) 중 다시 선택하세요.");
      user = sc.nextInt();
    }

    System.out.println("사용자 : " + rps[user] + " vs" + " 컴퓨터 : " + rps[com]);
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

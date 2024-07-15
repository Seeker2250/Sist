package days06;

import java.io.IOException;
import java.util.Scanner;

public class Ex07 {
  //days05.Ex07_02.java
  public static void main(String[] args) throws IOException {
    int com, user;
    String regex = "[1-3]";
    String strUser;

    Scanner sc = new Scanner(System.in);

    // Rock Sciissor paper
    String[] rps = {
        "",
        "가위", //rps[1]
        "바위", //rps[2]
        "보", //rps[3]
    };
    do {
      System.out.print("가위(1),바위(2),보(3) 중 선택하세요.");
      strUser = sc.next();
    } while (!strUser.matches(regex));
    com = (int) Math.random() * 3 + 1;
    user = Integer.parseInt(strUser);


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
    char con = 'y'; //'y' 혹은 'Y' 입력하면 계속 되게 만들자
    do {
      System.out.println("다시 게임 할거야? y or n");
      con = (char) System.in.read();
      System.in.skip(System.in.available());//13, 10 ASKII code 제거
    } while (con == 'y' || con == 'Y');

    System.out.println("가위바위보 게임 종료");
  }
}

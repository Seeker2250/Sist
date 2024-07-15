package days05;

import java.util.Scanner;

public class Ex03_02 {
  public static void main(String[] args) {
    char grades = 'a';
    int kor = 0;
    Scanner sc3 = new Scanner(System.in);
    System.out.println("성적을 입력하세요");
    kor = sc3.nextInt();
    switch (kor/10) {
      case (10) :
        grades = '수';
//        break;
      case (9) :
        grades = '수';
//        break;
      case (8) :
        grades = '우';
//        break;
      case (7) :
        grades = '미';
//        break;
      case (6) :
        grades = '양';
//        break;
      default:
        grades = '가';
//        break;
    }
    System.out.println(kor + " : " + grades);
  }
}

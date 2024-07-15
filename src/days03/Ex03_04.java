package days03;

import java.util.Scanner;

public class Ex03_04 {
  public static void main(String[] args) {
    String name = "홍길동";
    byte kor, eng, math;
    short total;
    double aver;

    Scanner scanner = new Scanner(System.in);//System.in으로부터 받은 걸 Scanner가 가공해서 다시 읽어

    System.out.println("이름, 국, 영, 수 입력하세요");
    name = scanner.next();
    kor = scanner.nextByte();//다음 구분자까진 byte로 담아
    eng = scanner.nextByte();
    math = scanner.nextByte();

    total = (short)(kor + eng + math);
    aver = (double)total / 3;
    //김준석 98 87 77 262 87.3333

  }
}

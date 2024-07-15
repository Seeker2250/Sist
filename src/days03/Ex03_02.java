package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex03_02 {
  public static void main(String[] args) throws IOException {
    int i = 2147483647;
//    int i = 2147483647;
//    int i = Integer.MAX_VALUE;
    int j = 100;
    int k = i + j;
    System.out.printf("%d + %d = %d\n", i, j, k);

    // 이름, 국어, 영어, 수학 받아서 총점과 평균을 계산
    //[출력형식]
    // 홍길동 90 89 91 270 90.00
    String name = "홍길동";
    byte kor, eng, math;
    short total;
    double aver;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("이름을 입력하세요");
    name = br.readLine();
    System.out.println("국어 성적을 입력하세요");
    kor = Byte.parseByte(br.readLine());
    System.out.println("영어 성적을 입력하세요");
    eng = Byte.parseByte(br.readLine());
    System.out.println("수학 성적을 입력하세요");
    math = Byte.parseByte(br.readLine());
    total = (short)(kor + eng + math);
    aver = (double)total / 3;

    int no = 15;
    System.out.printf("%d\n", no);
    System.out.printf("%4d\n", no);
    System.out.printf("%4d\n", no);
    System.out.printf("-".repeat(20));
    System.out.printf("%10s\t\t%d\t%d\t%d\t%d\t%f\n", name, kor, eng, math, total, aver);
    System.out.printf("%-10s\t\t%d\t%d\t%d\t%d\t%f\n", name, kor, eng, math, total, aver);
  }
}

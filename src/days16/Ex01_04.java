package days16;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author created by Seeker2250 on 7/22/24.
 * @Subject
 * @Contents
 */
public class Ex01_04 {
  public static void main(String[] args) {
//    다중 catch 문 -> JDK 1.7에서 |기호를 통해 multi catch문이 가능해짐
//    Operator 아니야! operation 없어 그냥 기호임 주의할 것
    int a = 0, b = 0;
    Scanner sc = new Scanner(System.in);
    try {
      System.out.println("두 정수 입력");
      a = sc.nextInt();
      b = sc.nextInt();
    } catch (Exception e) {
    }
    try {
      double c = (double) a / b;
      System.out.printf("%d / %d = %.2f\n", a, b, c);
    } catch (InputMismatchException | ArithmeticException e) { // 다중 catch문
      System.out.println(e.toString());
    } catch (Exception e) {
      System.out.println(e.toString());
    }finally {
      System.out.println();
    }

  }//main
}//class

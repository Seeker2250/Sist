package days16;

import java.util.Scanner;

/**
 * @author created by Seeker2250 on 7/22/24.
 * @Subject
 * @Contents
 */
public class Ex01_02 {
  public static void main(String[] args) {
    int a = 0, b = 0;
    Scanner sc = new Scanner(System.in);
    boolean qwer = false;
    while (qwer != true) {
      try {
        System.out.println("a, b 두 정수를 입력해주세요.");
        a = sc.nextInt();//try block 안에서만 사용되는 local variable이 되는 것
//    InputMismatchException   a->nextInt() 못 바꿔서 Exception 발생
//      예외가 발생하면 예외처리기가 잡아서 객체를 만들어
        b = sc.nextInt();
        if (a == 0 && b == 0) {
          System.out.println("a와 b가 모두 0입니다. 다시 입력해주세요.");
        } else {
          qwer = true;
        }
      } catch (Exception e) {//예외 발생하면 다 넘기고 바로 catch로 넘어와
//      예외가 없으면 catch block은 수행하지 않아
        System.out.println("정수가 아닙니다.");
        sc.next();
      }
    }//이거 최적화 하자.

    while (true) {
      try {
        System.out.println("두 정수 입력");
        a = sc.nextInt();//입력받은 값 계속 가지고 있어
        b = sc.nextInt();
        break;
      } catch (Exception e) { // e는 error 객체
        System.out.println("입력값 이상");
        sc.next();//Scanner 비워
//        e.printStackTrace();
//        System.out.println(e.getMessage());
        System.out.println(e.toString());
      }
    }

//    조건식으로 처리할 수도 있지만 그건 매번 체크하잖아
//    근데 예외처리는 예외가 발생했을 때에만 동작하니까 훨씬 효율적이야
//    조건문 활용하는 건 예외처리가 아니야

    try{
      double c = (double) a / b;
      System.out.printf("%d / %d = %.2f\n", a, b, c);
      // 1 / 0 infinity
    }catch(ArithmeticException e){
      System.out.println(e.toString());
    } catch (Exception e){// arithmetic exception 외의 것들이 발생할 수도 있기 때문에!
//      이게 위로 가면 다 받으니 Arithmetic exception 먼저!
      System.out.println(e.toString());
    }

  }//main
}//class

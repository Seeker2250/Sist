package days16;

import java.io.IOException;

/**
 * @author created by Seeker2250 on 7/22/24.
 * @Subject 예외 고의로 발생시키기
 * @Contents throw문
 */
public class Ex01_06 {
  public static void main(String[] args) {
//    compiler가 compile할 대 예외 체크를 하거나 안하거나
//
    System.out.println("asd");
//    throw new ArithmeticException();//  <- 컴파일러가 체크 안해 unchecked exception : RuntimeException
//    throw new IOException();// <- 컴파일러가 체크 : checked exception
  }
}

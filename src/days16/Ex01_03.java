package days16;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author created by Seeker2250 on 7/22/24.
 * @Subject
 * @Contents
 */
public class Ex01_03 {
  public static void main(String[] args) {
    int a = 0, b = 0;
    Scanner sc = new Scanner(System.in);
    try{
      System.out.println("두 정수 입력");
      a = sc.nextInt();
      b = sc.nextInt();
    }catch (Exception e){}
    try{
      double c = (double) a / b;
      System.out.printf("%d / %d = %.2f\n", a, b, c);
    }catch (InputMismatchException e){ // 다중 catch문
      System.out.println(e.toString());
    } catch(ArithmeticException e){
      System.out.println(e.toString());
    } catch (Exception e){
      System.out.println(e.toString());
    }

  }//main
}//class

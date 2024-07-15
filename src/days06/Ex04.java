package days06;

import java.util.Scanner;

//제어문
public class Ex04 {
  public static void main(String[] args) {
    //세 정수(int a, b, c)를 입력 받아 max, min 출력
    int a, b, c;
    Scanner sc = new Scanner(System.in);
    System.out.println("정수 세개 입력해");
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
//    int max = a > b ? a : b;
//    max = max > c ? max : c;
//    int min = a > b ? (b > c ? c : a) : (a > c ? c : a);
    int max = Math.max(Math.max(a, b), c);
    int abMin = Math.min(a, b);
    int mini = Math.min(c, abMin);
    System.out.println("");
//    if (Math.max(a, b) == a && Math.max(a, c) == a)
//      System.out.println("최댓값 : " + a);
//    else if (Math.max(b, c) == b)
//      System.out.println("최댓값 : " + b);
//    else System.out.println("최댓값 : " + c);
//
//    if (Math.min(a, b) == a && Math.min(a, c) == a)
//      System.out.println("최솟값 : " + a);
//    else if (Math.min(b, c) == b)
//      System.out.println("최소값 : " + b);
//    else System.out.println("최솟값 : " + c);


//    int max = a;
//    if (max < b)
//      max = b;
//    if (max < c)
//      max = c;
//    System.out.println("최댓값은 " + max);
//    int min = a;
//    if (min > b)
//      min = b;
//    if (min > c)
//      min = c;
//    System.out.println("최솟값은 " + min);


  }
}

package days06;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04_02 {
  public static void main(String[] args) {
    //다섯 정수(a, b, c, d, e를 입력 받아서 max min 출력
    int a, b, c, d, e;
    a = (int) Math.random() * 100 + 1;// 1 <= x <= 100
    b = (int) Math.random() * 100 + 1;
    c = (int) Math.random() * 100 + 1;
    d = (int) Math.random() * 100 + 1;
    e = (int) Math.random() * 100 + 1;
    int max = 0;
    int min = 0;
//    System.out.printf("a=%d,b=%d,c=%d,d=%d,e=%d\n", a,b,c,d,e);
//
//    int max = Math.max(a, b);
//    max = Math.max(max, c);
//    max = Math.max(max, d);
//    max = Math.max(max, e);
//
//    System.out.printf("max=%d\n", max);
//


    int [] m = new int [100];
    max = m[0];
    for (int i = 0; i < m.length; i++) {
      m[i] = (int) (Math.random()*100)+1;
      if(m[i]>max)
        max = m[i];
    }//배열 값 출력 Arrays class, toString()
    System.out.println(max);
  }

//    int max = a > b ? a : b;
//    max = max > c ? max : c;
//    int min = a > b ? (b > c ? c : a) : (a > c ? c : a);

}

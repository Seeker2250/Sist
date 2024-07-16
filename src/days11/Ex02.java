package days11;

import java.util.Arrays;
import java.util.Random;

public class Ex02 {
  public static void main(String[] args) {
//    Control flow statement practice
    int []m = new int[10];
    for (int i = 0; i < m.length; i++) {
      m[i]=i+1;
    }
    System.out.println(Arrays.toString(m));

//    배열 섞기
    shuffle(m);
  }//main

  private static void shuffle(int[] m) {
    int idx1 = 0, idx2;
    for (int i = 0; i < 10; i++) {
      idx2=(int)(Math.random()*9)+1;

      int temp = m[idx1];
      m[idx1]= m[idx2];
      m[idx2] = temp;
    }//out of for
    System.out.println(Arrays.toString(m));
  }//out of shufle
}//class

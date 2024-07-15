package days10;

import java.util.Arrays;

public class Ex04_04 {
  public static void main(String[] args) {
    int[] m = new int[8];
    m[0] = 1;
    m[1] = 2;
    m[2] = 3;
    m[3] = 4;
    m[4] = 5;
    System.out.println(Arrays.toString(m));
    int deleteIndex = 2;
//    for (int i = deleteIndex+1; i < index; i++) {
//      m[i-1] = m[i];
//
//    }
//    m[index-1] = 0;
    System.out.println(Arrays.toString(m));
  }
}

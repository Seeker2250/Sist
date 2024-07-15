package days10;

import java.util.Arrays;

public class Ex04_03 {
  public static void main(String[] args) {
//    배열 복사
    int[] m = {3, 5, 2, 4, 1};
    System.out.println(Arrays.toString(m));
    int [] temp = new int[m.length+5];
    System.out.println(Arrays.toString(temp));
//    for (int i = 1; i < m.length-1; i++) {
//    }
//    temp[i]= m[i];

    System.arraycopy(m, 0, temp, 0, m.length);
    System.out.println(Arrays.toString(temp));
    //어떤 배열을, 어디부터, 무슨 배열에, 몇 번에 갖다놔, 몇 개 복사해?

  }
}

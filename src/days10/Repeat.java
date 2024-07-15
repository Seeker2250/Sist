package days10;

import java.util.Arrays;

public class Repeat {
  public static void main(String[] args) {
    int[] m = {4, 2, 1, 5, 1, 23};
    int [] a = {8, 3, 3, 0, 1, 7, 0, 1, 1, 4, 2, 0,
        1, 7, 1, 9, 3, 9, 5, 0, 5, 0, 0, 9, 1, 4, 7,
        8, 3, 2, 1, 7, 1, 1, 7, 3, 8, 3, 4, 0, 4, 3,
        2, 3, 6, 1, 3, 1, 8, 8, 0, 4, 1, 8, 9, 9, 2,
        2, 2, 5, 2, 7, 6, 1, 2, 0, 6, 6, 2, 6, 4, 9,
        7, 8, 0, 6, 7, 6, 6, 0, 7, 3, 9, 2, 5, 6, 7,
        8, 7, 7, 7, 5, 1, 3, 2, 7, 9, 8, 0, 4};
    int n = 5;
    bubbleSort(m);
    binarySearch(m, n);
    counting(a);
  }
//3. 3. int [] m = { ... }
//   0의 갯수
//   1의 갯수
//   :
//   9의 갯수
//   출력
  private static void counting(int[] m) {
    int[] count = new int[10];
    for (int i = 0; i < m.length; i++) {
      count[m[i]]++;
    }
    for (int i = 0; i < count.length; i++) {
      System.out.println(i+"의 갯수 : " + count[i]);
    }
  }

  //2. 이진 검색하는 메서드 선언 ( binarySearch )
  private static int binarySearch(int[] m, int n) {
    int top = m.length - 1;
    int btm = 0;
    int cnt = 0;
    while (!(top >= btm)) {
      cnt++;
      System.out.println(cnt);
      int mid = (top + btm) / 2;
      if (n == mid)
        return mid;
      else if (m[mid] > n) {
        top = mid - 1;
      } else if (m[mid] < n) {
        btm = mid + 1;
      }//end of if series
    }//while
    return -1;
  }

  //1. 버블정렬하는 메서드 선언 ( bubbleSort )
//  (조건: 내림차순 정렬(desc) )
  private static int[] bubbleSort(int[] m) {
    for (int i = 0; i < m.length - 1; i++) {
      for (int j = 0; j < m.length - 1 - i; j++) {
        if (m[j] < m[j + 1]) {
          System.out.println("변화 확인 : " + Arrays.toString(m));
          int temp = m[j];
          m[j] = m[j + 1];
          m[j + 1] = temp;
        }//if
      }//inner for
    }//outer for
    System.out.println("최종버전 : " + Arrays.toString(m));
    return m;
  }
}


package days10;

import java.util.Arrays;

public class Ex04_06 {
  public static void main(String[] args) {
    int[] m = {0, 4, 5, 15, 20, 21, 22, 24, 25, 28, 29, 30
        , 32, 33, 40, 43, 46, 47, 48, 58, 62, 63, 71, 76,
        86, 91, 94, 99, 111, 116, 128, 135, 137, 139, 142
        , 145, 146, 150, 151, 160, 161, 166, 168,
        169, 172, 181, 184, 185, 191, 198};
    System.out.println(m.length);//50개 있네
    int n = 150;
//    int index = sequenceSearch(m, n);
//    이진 정렬의 필수 조건 : 정렬
//    int index = binarySearch(m, n);

    int index = Arrays.binarySearch(m, n);
    System.out.println(index);
//    System.out.println(index);
  }//main

  private static int binarySearch(int[] m, int n) {
    int bottom = 0;
    int top = m.length - 1;
    int mid;
    int cnt = 0;
    while (!(top >= bottom)) {
      System.out.printf("%d번 걸렸다\n", cnt++);
      mid = (bottom + top) / 2;
      if (m[mid] == n) return mid;
      else if (m[mid] > n) top = mid - 1;//mid가 내가 찾고자 하는 값보다 크다면 mid-1이 top
      else if (m[mid] < n) bottom = mid + 1;
    }//while
    return -1;
  }


  private static int sequenceSearch(int[] m, int n) {
    int index = -1;
    for (int i = 0; i < m.length; i++) {
      if (m[i] == n) {
        index = i;
        break;
      }//if
    }//for
    return index;
  }
}//class

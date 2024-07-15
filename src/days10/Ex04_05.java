package days10;

import java.util.Arrays;

public class Ex04_05 {
  public static void main(String[] args) {
//    sort(정렬) algorithm
//    일정 순서로 다시 배치(배열)
//    오름차순 asc 12345 a-z ㄱ-ㅎ
//    내림차순desc 543321 z-a ㅎ-ㄱ
//    [버블]
    int[] m = {3, 5, 2, 4, 1};
    System.out.println(Arrays.toString(m));
//    Arrays.sort(m);
    bubbleSort(m);
//    seletionSort(m);//선택정렬
    System.out.println(Arrays.toString(m));
//    선택
//    삽입
//    병합

  }

  //    0-1                    i = 0, j = 1~4
//    0-1 / 1-2              i = 1, j = 2~4
//    0-1 / 1-2 / 2-3        i = 2, j = 3~4
//    0-1 / 1-2 / 2-3 / 3-4  i = 3, j = 4
  private static void seletionSort(int[] m) {
    for (int i = 0; i < 4; i++) {
      for (int j = i + 1; j <= 4; j++) {
        if (m[i] > m[i]) {
          System.out.print(" change ");
          int temp = m[j];
          m[j] = m[j + 1];
          m[j + 1] = temp;
        }
      }
    }
  }

  //별 말 없으면 오름차순 (ascending)
  private static void bubbleSort(int[] m) {
//    [3 5 2 4 1]
//    0-1 / 1-2 / 2-3 / 3-4  i = 0, j = 3
//    0-1 / 1-2 / 2-3        i = 1, j = 2
//    0-1 / 1-2              i = 2, j = 1
//    0-1                    i = 3, j = 0
//
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j <= 3 - i; j++) {
        System.out.printf("%d-%d ", j, j + 1);
        if (m[j] > m[j + 1]) {
          System.out.print(" change ");
          int temp = m[j];
          m[j] = m[j + 1];
          m[j + 1] = temp;
        }
        System.out.println(Arrays.toString(m));
      }
      System.out.println();

    }
  }
}

package days10;


import java.util.Arrays;

public class Repeat02 {
  public static void main(String[] args) {
//    강사님 풀이
//    int [] x = { 1, 2, 3};
//
//    int [] y = new int [x.length+1];
//    int index = 1;
//    System.arraycopy(x, 0, y, 0, index);
//    y[index]=4;
//    System.arraycopy(x, 1, y, index+1, x.length-1);
//    System.out.println("이거야"+Arrays.toString(y));
    //1. 이진 검색하는 binarySearch 메서드 선언
    int[] m = {1, 4, 2, 5, 6, 7};
    int n = 5;
    //2. 버블정렬하는 bubbleSearch 메서드 선언
    bubbleSort(m);
    binarySearch(m, n);
    //3.  int [] m = {1,2,3}
    //   위의 배열에 1번째 인덱스에 4를 삽입하는 코딩을 하세요.
    int[] a = {1, 2, 3, 0};
    int[] temp = new int[a.length + 3];
    for (int i = 0; i < a.length; i++) {
      temp[i] = a[i];
    }
    System.out.println(Arrays.toString(temp));
    a[1] = 4;
    for (int i = 2; i < a.length; i++) {
      a[i] = temp[i - 1];
    }
    System.out.println(Arrays.toString(a));

    //4. 1차원 배열을 2차원 배열로 변환
    //   int [] m = {1,2,3,4,5,6};
    //   int [][] n = new int[2][3];
//    int [] b = {1,2,3,4,5,6};
//    int [][] c = new int[2][3];
//    for (int i = 0; i < c.length; i++) {
//      for (int j = 0; j < c[i].length; j++) {
//        c[i][j]=b[(i*c[i].length)+j];
//      }
//    }
//    System.out.println(Arrays.deepToString(c));

//    int[] b = {1, 2, 3, 4, 5, 6};
//    int[][] c = new int[2][3];
//    for (int i = 0; i < c.length; i++) {
//      if (b[i] / 3 <= 1)
//        c[0][i] = b[i];
//      else c[1][i] = b[i];
//    }
//    System.out.println(Arrays.deepToString(c));

    int[] b = {1, 2, 3, 4, 5, 6};
    int[][] c = new int[2][3];
    for (int i = 0; i < c.length; i++) {
      System.out.printf("%d - [%d][%d] \n",
          i, i, i / (c[0].length), i % (c[0].length));
      c[i / c[0].length][i % c[0].length] = m[i];
    }

    System.out.println(Arrays.deepToString(c));

  }//main

  private static int binarySearch(int[] m, int a) {
    int top = m.length - 1;
    int btm = 0;
    while (!(top >= btm)) {
      int mid = (top + btm) / 2;
      if (m[mid] == a)
        return a;
      else if (m[mid] > a)
        top = mid - 1;
      else
        btm = mid + 1;
    }//while
    return -1;
  }//method binarySearch

  private static void bubbleSort(int[] m) {
    for (int i = 0; i < m.length - 1; i++) {
      for (int j = i + 1; j < m.length - 1 - i; j++) {
        if (m[j] > m[j + 1]) {
          System.out.println("전 : " + Arrays.toString(m));
          int temp = m[j];
          m[j] = m[j + 1];
          m[j + 1] = temp;
          System.out.println("후 : " + Arrays.toString(m));
        }//if
      }//inner for
    }//outer  for
    System.out.println("최종버전 : " + Arrays.toString(m));
  }//method bubbleSort
}//class
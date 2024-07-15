package days09;

import java.util.Arrays;

public class Ex05_03 {
  public static void main(String[] args) {
//    1차원 배열
//    int [] m = new int[24];
//    System.out.println(m.length);
//    for (int i = 0; i < m.length; i++) {
//      System.out.printf("m[%d]=%d", i, m[i]);
//    }
//    System.out.println();


//    1차원 배열 초기화
//    int [] m = {}
//    2차원 배열 초기화
//    int [][] m
//
//    2차원 배열 행, 열

//    int[][] m = new int[2][4];
//    System.out.println(m.length);//행 갯수->항상 무조건 열 갯수가 아니야 그건 1차원 배열에서만
//    System.out.println(m[0].length);//0번째 행의 열 갯수
//    m[0][0] = 1;
//    m[0][1] = 2;
//    m[0][2] = 3;
//    m[0][3] = 4;
//    m[1][0] = 5;
//    m[1][1] = 6;
//    m[1][2] = 7;
//    m[1][3] = 8;
    int[][] m = {
        {1, 2, 3, 4,},
        {5, 6, 7, 8,}
    };
    dispM(m);
  }

  private static void dispM(int m[][]) {
    for (int i = 0; i < m.length; i++) {
//      for (int j = 0; j < m[i].length; j++) {
//        System.out.printf("m[%d][%d][%d]=%d", i, j, m[i][j]);
      System.out.println(Arrays.toString(m[i]));
    }
  }
}

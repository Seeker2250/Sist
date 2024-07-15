package days09;

public class Ex05_04 {
  public static void main(String[] args) {
//    int [] m = new int[24]
//    int [][] m = new int [4][6];
//    int [][][] m = new int [2][3][4]; //2면 3행 4열

    int[][][] m = {
        {
            {1, 2, 3, 4,},
            {5, 6, 7, 8,},
            {9, 10, 11, 12,}
        },
        {
            {13, 14, 15, 16,},
            {17, 18, 19, 20,},
            {21, 22, 23, 24,}
        },
        {
            {25, 26, 27, 28,},
            {29, 30, 31, 32,},
            {33, 34, 35, 36,}
        }
    };
    System.out.println(m.length);//면 갯수
    System.out.println(m[0].length);//행 갯수
    System.out.println(m[0][0].length);//0번째 면, 0번째 행의 열 갯수

    dispM(m);
  }

  private static void dispM(int[][][] m) {
    for (int i = 0; i < m.length; i++) {
      System.out.println(i + "면");
      for (int j = 0; j < m[i].length; j++) {//행갯수
        for (int k = 0; k < m[i][j].length; k++) {
          System.out.printf("m[%d][%d][%d]=%d", i, j, k, m[i][j][k]);//열

        }
      }
    }

  }
}

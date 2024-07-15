package days10;

public class Ex02 {
  //Repeat2 2번
  public static void main(String[] args) {
    //2. int [] m = new int[6];
//   m[0]=1;m[1]=2;m[2]=3;m[3]=4;m[4]=5;m[5]=6;
//   1) 위의 코딩을 2행 3열 2차원 배열로 선언하세요
    int[][] m = new int[2][3];
//   2) 위의 코딩을 1차원 배열 초기화로 선언하세요.
    int[] a = {1, 2, 3, 4, 5, 6};
//   3)   1) 2행 3열 2차원 배열 초기화로 선언하세요.
    int[][] b = {
        {1, 2, 3},
        {4, 5, 6}
    };
//   4) 1차원 배열을 for 문을 사용해서 출력하세요.
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
//   5) 2차원 배열을 중첩 for 문을 사용해서 출력하세요.
    for (int i = 0; i < b.length; i++) {
      for (int j = 0; j < b[i].length; j++) {
        System.out.println(b[i][j]);
      }
    }
  }
}

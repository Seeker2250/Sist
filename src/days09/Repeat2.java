package days09;

import java.io.IOException;
import java.util.Scanner;

public class Repeat2 {


  public static void main(String[] args) throws IOException {
//    1. 30명 학생의 이름,국,영,수,총,평,등를 처리하는 배열을 선언
//하고 학생정보 입력 후 출력하는 코딩을 하세요.
// ( 조건 : 학생정보 입력 및 출력하는 메서드를 만들어서 코딩

//   studentInfomationOutput()
// )
    final int NUM = 30;
    int kor, eng, mat, tot, avg, rank;
    String name;
    String info;
    int[] kors = new int[NUM];
    int[] engs = new int[NUM];
    int[] mats = new int[NUM];
    int[] tots = new int[NUM];
    double[] avgs = new double[NUM];
    int[] ranks = new int[NUM];
    String[] names = new String[NUM];
    char con;
    int cnt = 0;
    Scanner sc = new Scanner(System.in);
    do {
      name = sc.next();
      names[cnt] = name;
      kor = sc.nextInt();
      kors[cnt] = kor;
      eng = sc.nextInt();
      engs[cnt] = eng;
      mat = sc.nextInt();
      mats[cnt] = mat;
      tot = kor + eng + mat;
      tots[cnt] = tot;
      avg = tot / 3;
      avgs[cnt] = avg;
      cnt++;
      System.out.println("더 입력할 거라면 y or Y 입력");
      con = (char) System.in.read();
      System.in.skip(System.in.available());
    } while (Character.toUpperCase(con) == 'Y');
    for (int i = 0; i < cnt; i++) {
      System.out.printf("%d번째 학생은 %s, 국어: %d 영어 : %d 수학 : %d 총점 : %d 평균 : %f\n", i, names[i], kors[i], engs[i], mats[i], tots[i], avgs[i]);
    }

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
//3. 누승을 구하는 pow() 메서드를 구현하고
    int n = 2;
    int pow = 3;
    pow(n, pow);
//   누승을 구하는 recursivePow() 메서드를 구현하세요.

    System.out.println(recursivePow(n, pow));
  }

  private static int recursivePow(int n, int pow) {
//    2^3이라 가정
//    2 * 1       2 * 2     2 * 3<- pow 가 감소, 근데 본인을 호출하려면? 만약 pow-1로 호출..?)
    if (pow == 0) return 1;
    else return n * recursivePow(n, pow - 1);
  }

  private static double pow(int n, int pow) {
    double result = 1;
    int exp = pow < 0 ? -pow : pow;
    for (int i = 0; i < exp; i++) {
      result *= n;
    }
    return pow > 0 ? result : 1 / result;
  }

}

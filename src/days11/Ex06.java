package days11;

/**
 * created by Seeker2250 on 7/15/24.
 */
public class Ex06 {
  public static void main(String[] args) {
    int[][] m = new int[5][5];
//    fillM(m);
//    fillM2(m);
//    fillM3(m);
//    fillM4(m);
    fillM5(m);
//    magicSquare(m);
    dispM(m);

  }//main

  /*
	[17][24][01][08][15]
	[23][05][07][14][16]
	[04][06][13][20][22]
	[10][12][19][21][03]
	[11][18][25][02][09]
	*/
  private static void magicSquare(int[][] m) {
//    1) 0행 2열
//    2) 출력값이 5의 배수인지 체크. 맞으면 행만 증가
//    아니라면, 행 감소, 열 증가
//    행이 없다면(범위를 벗어났다면) 가장 큰 행으로
//    열이 없다면(범위를 벗어났다면) 가장 작은 열로
//    int row, col;
//    for (int i = 0, cnt = 1; i < 25; i++) {
//      if(m[4][4]<i)
//      else if(i%5==0)
//        m[4][i]=cnt;
//      else if (i%5!=0){
//
//      }
//      cnt++;
//    }

//    강사님 풀이
    int n = 1;
    int row = 0, col = m[0].length / 2; //행, 열(길이/2 해서 2)
    while (n <= 25) {
      m[row][col] = n;
      if (n % 5 == 0) {
        row++;
      } else {
        col++;
        row--;
        if (row == -1) {//행이 벗어나면
          row = m.length - 1;//최댓값
        } else if (col == 5) {//열이 벗어나면
          col = 0;//최솟값
        }
      }
      n++;
    }

  } // magicSquare


  // [골뱅이]
	/*
	  [01][02][03][04][05]
	  [16][17][18][19][06]
	  [15][24][15][20][07]
	  [14][23][22][21][08]
	  [13][12][11][10][09]

	  index(값)
	  0열     1열    2열     3열    4열
	  00(01) 01(02) 02(03) 03(04) 04(05)  0행 1회전 행 고정, 열 증가(5번)
	  10(16) 11(17) 12(18) 13(19) 14(06)  1행 2회전 열 고정, 행 증가(4번)
	  20(15) 21(24) 22(25) 23(20) 24(07)  2행 3회전 행 고정, 열 감소(4번)
	  30(14) 31(23) 32(22) 33(21) 34(08)  3행 4회전 열 고정, 행 감소(3번)
	  40(13) 41(12) 42(11) 43(10) 44(09)  4행 5회전 행 고정, 열 증가(3번)
	                                         6회전 열 고정, 행 증가 (2번)
	                                         7회전 행 고정, 열 감소 (2번)
	                                         8회전 열 고정, 행 감소 (2번)
	                                         9회전 행 고정, 열 증가 (2번)

	                                         행열 고정 와리가리 + 증가증가 감소감소
                                           반복 횟수 5--;
                                           스위치를 int로 잡고 +1이냐 -1이냐로 곱하면 되지 않을까

	*/
  private static void fillM5(int[][] m) {
    int num = 1;
    int row = 0;
    int col = 0;
//    for (int i = 0; i < m.length; i++) { // 행갯수
//      for (int j = 0; j < m[i].length; j++) { // 열갯수

//        System.out.printf("[%02d]", m[i][j]);
//        m[i][j] = m.length * (i) + j + 1;
//        if (j == m.length-1)
//          m[i][j] = j + i + 1;
//        열 갯수m[i].length * 행 갯수
//      } // for j
//      for (int k = 0; k < ; k++) {

//      }
//      if (i == 4 || (cnt % 5 == 1)) {
//        for (int k = 0; k < m[i].length; k++) {
//          System.out.printf("[%02d]", m[i][k]);
//          int kIndex = (k % 2 == 0) ? k : (m[i].length - 1 - k);
//          m[i][kIndex] = num++;
//        }
    }
//    System.out.println();
//  } // for i

  /* 지그재그
  [01][02][03][04][05]
  [10][09][08][07][06]
  [11][12][13][14][15]
  [20][19][18][17][16]
  [21][22][23][24][25]
  */
  private static void fillM4(int[][] m) {
    int num = 1;
    for (int i = 0; i < m.length; i++) { // 행갯수
      for (int j = 0; j < m[i].length; j++) { // 열갯수
        int jIndex = (i % 2 == 0) ? j : (m[i].length - 1 - j);
        m[i][jIndex] = num++;
      }
    }
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[i].length; j++) {
        System.out.printf("[%02d]", m[i][j]);
      }
      System.out.println();
    }
  }

  /*
[05][10][15][20][25]
[04][09][14][19][24]
[03][08][13][18][23]
[02][07][12][17][22]
[01][06][11][16][21]
*/
  private static void fillM3(int[][] m) {
    for (int i = 0; i < m.length; i++) { // 행갯수
      for (int j = 0; j < m[i].length; j++) { // 열갯수
        System.out.printf("[%02d]", m[i][j]);
        m[i][j] = (m.length * (j + 1)) - i;
//        열 갯수m[i].length * 행 갯수
      } // for j
      System.out.println();
    } // for i
  }

  //       -1 -2 -3 -4
//   25 24 23 22 21
//   20 19 18 17 16
//   15 14 13 12 11
//   10  9  8  7  6
//    5  4  3  2  1
  private static void fillM2(int[][] m) {
    for (int i = 0; i < m.length; i++) { // 행갯수
      for (int j = 0; j < m[i].length; j++) { // 열갯수
        System.out.printf("[%02d]", m[i][j]);
        m[i][j] = 25 - (m[i].length * i + j);//count 줘서 1씩 증가시키는 것과 같아
//        열 갯수m[i].length * 행 갯수
      } // for j
      System.out.println();
    } // for i
  }
//  for (int i = 0, value = 25; i < m.length; i++) { // 행갯수
//        for (int j = 0; j < m[i].length; j++) { // 열갯수
//          System.out.printf("[%02d]", m[i][j]);
//          m[i][j] = value--;//count 줘서 1씩 증가시키는 것과 같아
//  //        열 갯수m[i].length * 행 갯수
//        } // for j
//        System.out.println();
//      } // for i


//  for (int i = 0, value = 25; i < m.length; i++) { // 행갯수
//    for (int j = 0; j < m[i].length; j++) { // 열갯수
//      System.out.printf("[%02d]", m[i][j]);
//      m[4-i][4-j] = m[i].length * i + j + 1;//count 줘서 1씩 증가시키는 것과 같아
//      //        열 갯수m[i].length * 행 갯수
//    } // for j
//    System.out.println();
//  } // for i


  private static void fillM(int[][] m) {
    for (int i = 0; i < m.length; i++) { // 행갯수
      for (int j = 0; j < m[i].length; j++) { // 열갯수
        System.out.printf("[%02d]", m[i][j]);
        m[i][j] = m[i].length * i + j + 1;//count 줘서 1씩 증가시키는 것과 같아
//        열 갯수m[i].length * 행 갯수
      } // for j
      System.out.println();
    } // for i
  }

  private static void dispM(int[][] m) {
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();

    for (int i = 0; i < m.length; i++) { // 행갯수
      for (int j = 0; j < m[i].length; j++) { // 열갯수
        System.out.printf("[%02d]", m[i][j]);
      } // for j
      System.out.println();
    } // for i
  }
}//class

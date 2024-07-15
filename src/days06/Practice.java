package days06;

public class Practice {
  public static void main(String[] args) {
//    1. 구구단(2단~9단) 세로 출력
    for (int i = 1; i < 10; i++) {
      for (int j = 1; j < 10; j++) {
        System.out.println(i + " * " + j + "=" + i * j);
      }//inner for
    }//outer for

//2. 1/2-2/3+3/4-...7/8-8/9=???
//    boolean sw = false;
//    for (int i = 2; i < 10; i++) {
//        for (int j = i-1; j < i; j++) {
//          System.out.print(j + "/" + i + "-");
//          if (!sw) {
//            System.out.print((j+1) + "/" + (i+1) + "+");
//        }//if
//          sw = !sw;
//      }//inner for
//    }//outer for

    boolean sw = false;
    for (int i = 1; i <= 10; i++) {
      for (int j = i - 1; j < i; j++) {
        if (!sw) {
          System.out.print(j + "/" + i + "-");
        } else
          System.out.print(j + "/" + i + "+");
        sw = !sw;
      }
    }
    // 1/2-2/3+3/4-...7/8-8/9=???
    // 분자/분모
    // 분자/(분자+1)

    // i  홀수-  sum +=
    // i  짝수+  sum -=


    boolean flag = true;
    double sum = 0;

    for (int i = 1; i <= 8; i++) {
      if (flag) {
        System.out.printf("%d/%d-", i, i + 1);
        sum += (double) i / (i + 1);
        //flag = false;
      } else {
        System.out.printf("%d/%d+", i, i + 1);
        sum -= (double) i / (i + 1);
        //flag = true;
      } // if
      flag = !flag;

    } // for i

    System.out.printf("=%f\n", sum);
//3. 아래 코딩 결과는 ?
// EXIT:for (int dan = 2; dan <= 9 ; dan++) {
//   for (int i = 1; i <= 9 ; i++) {
//      1) if( i == 5) break EXIT;
//      2) if( i == 5) continue EXIT;
//      System.out.printf("%d*%d=%d\t", dan, i, dan * i);
//   }
//   System.out.println();
// }
//-> break : 2 * 5까지 나오고 모든 for 종료
//-> continue : i * 5들은 다 나오고 for 종료

//4. 구구단(2단~9단) 출력을 아래와 같이...
    for (int dan = 2; dan < 10; dan++) {
      for (int j = 1; j < 10; j++) {
        System.out.print(dan + "*" + j + "=" + dan * j + " ");
      }
      if (dan % 3 == 1) {
        System.out.println();
      }
    }


    // 2단 3단 4단 5단
    // 6단 7단 8단 9단

    for (int k = 1; k <= 2; k++) {
      System.out.printf("k=%d\n", k);
      // k=1    j = 2; j <= 5
      // k=2    j = 6; j <= 9
      //          = 4*k-2  = 4*k+1
      for (int i = 1; i <= 9; i++) {
        for (int j = 4 * k - 2; j <= 4 * k + 1; j++) {
          System.out.printf("%dx%d=%d\t", j, i, i * j);
        } // for j
        System.out.println();
      } // for i 2 5 8

      System.out.println();
    }
    for (int k = 1; k <= 3; k++) {
      for (int i = 1; i <= 9; i++) {
        //k=1 -> i=2 -> j=4
        //k=2 -> i=5 -> j=7
        //k=3 -> i=8 -> j=9
        //       3*k-1   3*k-1(+3)==3*k+2
        for (int j = 3 * k - 1; j < 3 * k + 2 && j != 10; j++) {
          System.out.printf("%dx%d=%d\t", j, i, i * j);
        }
        System.out.println();
      }
    }

      /*
      for (int i = 1; i <= 9 ; i++) {
         for (int j = 2; j <= 5 ; j++) {
            System.out.printf("%dx%d=%d\t",j,i,i*j);
         } // for j
         System.out.println();
      } // for i

      System.out.println();

      for (int i = 1; i <= 9 ; i++) {
         for (int j = 6; j <= 9 ; j++) {
            System.out.printf("%dx%d=%d\t",j,i,i*j);
         } // for j
         System.out.println();
      } // for i

///*
//[2]단	 [3]단	 [4]단
//2*1=02	3*1=03	4*1=04
//2*2=04	3*2=06	4*2=08
//2*3=06	3*3=09	4*3=12
//2*4=08	3*4=12	4*4=16
//2*5=10	3*5=15	4*5=20
//2*6=12	3*6=18	4*6=24
//2*7=14	3*7=21	4*7=28
//2*8=16	3*8=24	4*8=32
//2*9=18	3*9=27	4*9=36
//
//[5]단	 [6]단	 [7]단
//5*1=05	6*1=06	7*1=07
//5*2=10	6*2=12	7*2=14
//5*3=15	6*3=18	7*3=21
//5*4=20	6*4=24	7*4=28
//5*5=25	6*5=30	7*5=35
//5*6=30	6*6=36	7*6=42
//5*7=35	6*7=42	7*7=49
//5*8=40	6*8=48	7*8=56
//5*9=45	6*9=54	7*9=63
//
//[8]단	 [9]단
//8*1=08	9*1=09
//8*2=16	9*2=18
//8*3=24	9*3=27
//8*4=32	9*4=36
//8*5=40	9*5=45
//8*6=48	9*6=54
//8*7=56	9*7=63
//8*8=64	9*8=72
//8*9=72	9*9=81
//*/
  }
}

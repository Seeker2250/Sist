package days07;

public class Ex02_03_02 {
  public static void main(String[] args) {
    // 이등변 삼각형
//    i=1일 때 공백 2 __*
//    i=1일 때 공백 1 _***
//    i=1일 때 공백 0 *****
//    *은 1 3 5니까 2n-1

//    삼각형 그리기
//    좌표 따 (1,3) (2,2) (2,4) (3,1) (3,5)
    for (int i = 1; i <= 3; i++) {
      for (int j = 1; j <=5; j++) {
//        System.out.print(i+j>=4?"*":" ");
//        System.out.print(j-1<=2?"*":" ");
        System.out.print(i+j>=4 && j-1<=2?"*":" ");
      }
    }
  }
}

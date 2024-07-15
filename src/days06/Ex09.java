package days06;

public class Ex09 {
  public static void main(String[] args) {

    // |\반삼각
    int num = 4;
    for (int i = 0; i <= num; i++) {//행 갯수
      System.out.println();
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
    }
    System.out.println();

    //  ---/ 역반삼각
    int num2 = 3;
    for (int i = 0; i <= num; i++) {//행 갯수
      System.out.println();
      for (int j = num2; j >= i; j--) {
        System.out.print("*");
      }
    }


    System.out.println();
    //이등변 삼각형
    int num3 = 5;
    for (int i = 0; i <= num; i++) {//행 갯수
      System.out.println();
      for (int j = 0; j < num - i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < i * 2 + 1; k++) {
        System.out.print("*");
      }
    }
    System.out.println();

    //평행사변형
    int num4 = 5;
    for (int i = 0; i <= num4; i++) {//행 갯수
      System.out.println();
      for (int j = num4; j >= i; j--) {
        System.out.print(" ");
      }
      for (int k = 0; k < num4; k++) {
        System.out.print("*");
      }
    }
    System.out.println();
// /대각
    int num5 = 5;
    for (int i = 0; i <= num5; i++) {//행 갯수
      System.out.println();
      for (int j = num5; j >= i; j--) {
        System.out.print(" ");
      }
      System.out.print("*");
    }
    System.out.println();
    System.out.println();


//    /대각
//    타겟 : .     1/5
//            2/4 2/5
//        3/3 3/4 3/5
//    4/2 4/3 4/4 4/5
//5/1 5/2 5/3 5/4 5/5
//i는 1부터 증가, 이거로 enter 조절해야할 듯
//j로 내부에서 공백을 찍어야 할테니 그럼 k로 남은 *을 찍어야 할 것 그럼 k는 점점 루프가 많아져야해(1234) 그럼 이건 i-1번째 아닌가
    int num6 = 5;
    for (int i = 0; i < num6; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      System.out.println("*");
    }


    System.out.println();

//    마름모

    int num7 = 5;
    for (int i = 0; i < num7; i++) {
      for (int j = 0; j < num7 - i - 1; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < 2 * i + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = num7 - 2; i >= 0; i--) {
      for (int j = 0; j < num7 - i - 1; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < 2 * i + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }


    int num8 = 5;
    for (int i = 0; i < num8; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      for (int k = num8; k >= i; k--) {

      }
      System.out.println("*");
    }
    for (int i = 0; i < num8; i++) {//행 갯수
      System.out.println();
      for (int j = num5; j >= i; j--) {
        System.out.print(" ");
      }
      System.out.print("*");
    }

    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();


    boolean sw = false;
    int sum = 0;
    for (int i = 1; i < 11; i++) {
      if (sw != false) {
        sum -= i;
      }
      sum += i;
      sw = !sw;
      System.out.println(sum);
    }

    for (int i = 1; i < 10; i++) {
      for (int j = 1; j < 10; j++) {
        System.out.println(i + " * " + j + " = " + i * j);
      }
      System.out.println();
    }

    for (int i = 1; i < 10; i++) {
      for (int j = 1; j < 10; j++) {
        System.out.print(" " + i + " * " + j + " = " + i * j);
      }
      System.out.println();
    }
    System.out.println();
    for (int j = 1; j < 10; j++) {
      for (int i = 1; i < 10; i++) {
        System.out.print(" " + i + " * " + j + " = " + i * j);
      }
      System.out.println();
    }
//    3. 아래 코딩 결과는 ?
    EXIT:
    for (int dan = 2; dan <= 9; dan++) {
      for (int i = 1; i <= 9; i++) {
//         if( i == 5) break EXIT;
//         if( i == 5) continue EXIT;
        System.out.printf("%d*%d=%d\t", dan, i, dan * i);
      }
      System.out.println();
    }
//     break -> 2 * 4까지만 나오고 모든 for 종료
//    continue -> i * 4들만
  }
}
/*
 * 0/0 0/1 0/2 0/3 0/4 0/5
 * 1/0 1/1 1/2 1/3 1/4 1/5
 * 2/0 2/1 2/2 2/3 2/4 2/5
 * 3/0 3/1 3/2 3/3 3/4 3/5
 * 4/0 4/1 4/2 4/3 4/4 4/5
 * 5/0 5/1 5/2 5/3 5/4 5/5
 *
 * */

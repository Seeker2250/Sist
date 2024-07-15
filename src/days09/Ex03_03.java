package days09;

public class Ex03_03 {
  public static void main(String[] args) {
//    재귀함수
//    Tree structure search에 사용
//    directory가 아무리 많아도 다 할 수 있지
//    어라 이거 cascading ? -> SQL로...?
//    [Factorial]
//    n(n-1)(n-2)*...*1
//    0! = 1
    int n = 5;
//    factorial(n);
    int result = recursiveFactorial(n);
    System.out.println(result);
  }//main

/*  private static int factorial(int n) {

  }*/

  private static int recursiveFactorial(int n) {
    if (n == 1) return n;
    else return n * recursiveFactorial(n - 1);
  }
}
//class

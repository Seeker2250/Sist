package days09;

public class Ex03_04 {
  public static void main(String[] args) {
//    [문제]
//    거듭제곱 == 누승 == 멱 == power(pow)
    int n = 2;
    int pow = 3;
    double result = power(2, 10);
//    power(2, 3);
    System.out.println(result);
//    recursivePow(n, pow);
  }//main

//  private static double recursivePow(int n, int pow) {
//    double result = 1;
//  }

  private static double power(int n, int pow) {
    double result = 1;
//    i = 밑수, j = 지수
//    2^3 == 2^2^2
    int exp = pow < 0 ? -pow : pow;//양수든 음수든 양수로 만들어
    for (int k = 0; k < exp; k++) {
      result *= n;
    }
    return pow > 0 ? result : 1 / result;
  }

}//class

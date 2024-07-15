package days10;

public class Ex03 {//Repeat2 풀이

  public static void main(String[] args) {
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
    if (pow < 0) return (1 / recursivePow(n, -pow));
    else if (pow > 0) return n * recursivePow(n, pow - 1);
    else return 1;

  }

  private static double pow(int n, int pow) {
    double result = 1;
    int exp = Math.abs(pow);//절댓값 구하는 method
    for (int i = 0; i < exp; i++) {
      result *= n;
    }
    return pow > 0 ? result : 1 / result;
  }
}


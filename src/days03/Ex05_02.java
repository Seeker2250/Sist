package days03;
// Arithmetic operator 설명
public class Ex05_02 {
  public static void main(String[] args) {
  int i = 10, j = 3;
    System.out.println(i + j);
    System.out.println(i - j);
    System.out.println(i * j);
    System.out.println(i / j);// integer operate하면 integer
    System.out.println(i % j);

    System.out.println((10 / (double)0)); //Infinity라는 literal이 되는 거
    System.out.println(Double.isInfinite(10.0 / 0));//이거 infinity니 아니니? -> boolean으로 return
    System.out.println( 10 % (double)0); // NaN == Not a Number라는 literal이 나와
    System.out.println(Double.isNaN(10 % (double)0));//이거 NaN이니 아니니?
  }
}

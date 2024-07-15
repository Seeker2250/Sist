package days04;

public class Ex02 {
  public static void main(String[] args) {
    float pi = 3.1415923565f;
//    //소수점 네 번째 자리에서 반올림한 값을 가져오고 싶다면?
//    System.out.printf("%.3f", pi);// 자동 반올림
//
//    String strPi = String.format("%.3f",pi);
//    //String -> double
//    double dPi = Double.parseDouble(strPi);
//    System.out.println(dPi);

    int iPi = (int) (pi * 1000 + 0.5);
    System.out.println((double)iPi/1000);
  }
}

package days07;

public class Ex06_02 {
  public static void main(String[] args) {
    //두 정수 합을 구해서 출력
    //      함수 선언 1 : 두 정수의 합 구하는 기능
    //      매개변수 : 두 정수
    //       return : 두 정수의 합
    int a = 10;
    int b = 20;
    int c = 0;
    c = sum(a,b);
    System.out.println(c);
  }//main
  public static int sum(int a, int b) {
    return a+b;
  }
}

package days09;

public class Ex03_02 {
  public static void main(String[] args) {
    int n =3;
    int result = recursiveHap(n);
    System.out.println(result);
  }//main

  private static int recursiveHap(int n) {
    if(n==1) return n;
    else return n + recursiveHap(n-1);
  }
}//classㅆ

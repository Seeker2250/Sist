package days06;

public class Ex06_02 {
  public static void main(String[] args) {
    for (int dan = 1; dan < 10; dan++) {
      System.out.println(dan + "단");
      for (int num = 1; num < 10; num++) {
        System.out.println(dan + " * " + num + " =" + dan * num);
      }//inner for
      System.out.println();
    }//outer for
  }//main
}//class

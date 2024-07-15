package days09;

public class Ex03 {
  //recursive function(재귀함수)
  public static void main(String[] args) {
    disp();
  }//main

  private static void disp() {
    System.out.println("disp()...");
    disp();
  }
}//class

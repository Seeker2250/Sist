package days12;

/**
 * created by Seeker2250 on 7/16/24.
 */
public class Ex07 {
  public static void main(String[] args) {
//    call by value
//    call by value
//    call by reference
    int x = 10, y = 20;
    System.out.println(x + ", " + y);
    swap(x, y);
    System.out.println(x + ", " + y);

  }//main

  private static void swap(int x, int y) {
    int temp = x;
    x = y;
    y = temp;
  }
}//class

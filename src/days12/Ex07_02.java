package days12;

/**
 * created by Seeker2250 on 7/16/24.
 */
public class Ex07_02 {
  public static void main(String[] args) {
//    call by value
//    call by value
//    call by reference
    int[] m = {10, 20};
    System.out.println(m[0] + ", " + m[1]);
    swap(m);
    System.out.println(m[0] + ", " + m[1]);

  }//main

  private static void swap(int[] m) {
    int temp = m[0];
    m[0] = m[1];
    m[1] = temp;
  }//method
}//class

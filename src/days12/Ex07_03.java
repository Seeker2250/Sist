package days12;

/**
 * created by Seeker2250 on 7/16/24.
 */
public class Ex07_03 {
  public static void main(String[] args) {
//call by refernce를 class로
    Point p1 = new Point();
    p1.x = 10;
    p1.y = 20;
    int[] m = {10, 20};
    System.out.println(p1.x + ", " + p1.y);
    swap(p1);
    System.out.println(p1.x + ", " + p1.y);

  }//main

  private static void swap(Point p1) {//object copy(같은 address)
    int temp = p1.x;
    p1.x = p1.y;
    p1.y = temp;
  }//method
}

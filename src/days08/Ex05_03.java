package days08;

public class Ex05_03 {
  public static void main(String[] args) {
    int[] m = {10, 20};
    System.out.printf("> 1. main  x=%d, y=%d\n", m[0], m[1]);
//    int temp = x;
//    x = y;
//    y = temp;
    swap(m);
    System.out.printf("> 2. main  x=%d, y=%d\n", m[0], m[1]);
    //Call by Reference
  }

  public static void swap(int [] m) {//이건 call by reference
//    같은 memory 사용
    int temp = m[0];
    m[0] = m[1];
    m[1] = temp;
  }
}

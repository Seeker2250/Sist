package days08;

public class Ex05_02 {
  public static void main(String[] args) {
    int x = 10, y = 20;
    System.out.printf("> 1. main  x=%d, y=%d\n", x, y);
//    int temp = x;
//    x = y;
//    y = temp;
    swap(x, y);//이거 안되지 왜냐하면 call by reference가 안되니
    System.out.printf("> 2. main  x=%d, y=%d\n", x, y);
    //Call by Reference
//   main stub에서 Stack에 x=10, y=20인 거
  }
  public static void swap(int x, int y){//이건 call by value
//    swap stub에서 x, y가 달라지는 거
//    이거 하고싶으면 Array 같은 reference fields를 써야지
    int temp = x;
    x = y;
    y = temp;
  }
}

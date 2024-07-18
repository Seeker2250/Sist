package days14;

/**
 * @author created by Seeker2250 on 7/18/24.
 * @Subject
 * @Contents
 */
public class Ex03 {
  public static void main(String[] args) {

//    object와 class의 복사와 복제
//    복사는 같은 주소값만 긁어오는 거여
//    constructor를 이용한 복제

    Point p1 = new Point(1, 2);
//    Point p2 = new Point();
//    p2.x = p1.x;
//    p2.x = p1.y;
//    Point p2 = new Point(p1.x, p1.y);
    Point p2 = new Point(p1);//이래도 되나?! 싶지만 객체를 넘겨버려


  }//main
}//class

class Point {
  int x, y;

  Point() {
  }//default constructor

  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  Point(Point p) {
    this.x = p.x;
    this.y = p.y;
  }
}

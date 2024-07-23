package days13;

/**
 * @author created by Seeker2250 on 7/17/24.
 * @Subject
 * @Contents
 */
public class Point {
  //  fields
  public int x;
  public int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public Point() {

  }

  //p1.plusPoint(100).dispPoint();라고 하면 밑에서 x는 p1이지
  public Point plusPoint(int temp) {
    Point p = new Point(this.x + temp, this.y + temp);//garbage가 되는거야
    return this;//return 값으로 사용되는 this의 세 번째 용법
//    return p; //이러면 증가된 x, y가 가겠써
  }

  private void thisTest(Point p){
    p.dispPoint();
  }

  //  methods
  public void dispPoint() {
    System.out.println("현재 x 좌표는 : " + x + ", y좌표는 : " + y + " 입니다.");
  }

  @Override//굳이 위에꺼 안 써도 이렇게 Override 쓰면 돼!
  public String toString() {
    return "Point{" +
        "x=" + x +
        ", y=" + y +
        '}';
  }

  //  p1.plusPoint(p2)
  public void plusPoint(Point p) {//인자를 객체(참조형 변수)를 줬어
    x = x + p.x;//호출한 놈꺼에 인자를 더해
    y = y + p.y;
  }

  public Point plusPoint(Point p1, Point p2) {
    x = p1.x + p2.x;//호출한 놈꺼에 인자를 더해
    y = p1.y + p2.y;

    Point p = new Point();
    p.x = x;
    p.y = y;
    return p;//완전히 새로운 객체를 return 주소를Point
  }
}

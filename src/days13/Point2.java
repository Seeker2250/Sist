package days13;

/**
 * @author created by Seeker2250 on 7/17/24.
 * @Subject
 * @Contents
 */
public class Point2 {
  //  fields
  private int x;
  private int y;

  //  constructor 추가
  public Point2(){//default constructor 만들어주기(constructor 만들거면)

  }
  public Point2(int a, int b) {//field initialization이 constructor의 역할
    x = a;
    y = b;
  }
  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  //  methods
  public void dispPoint() {
    System.out.println("현재 x 좌표는 : " + x + ", y좌표는 : " + y + " 입니다.");
  }

  public void plusPoint(Point2 p) {
    x = x + p.x;
    y = y + p.y;
  }

  public Point2 plusPoint(Point2 p1, Point2 p2) {
    x = p1.x + p2.x;//호출한 놈꺼에 인자를 더해
    y = p1.y + p2.y;

    Point2 p = new Point2();
    p.x = x;
    p.y = y;
    return p;//완전히 새로운 객체를 return 주소를Point
  }
}

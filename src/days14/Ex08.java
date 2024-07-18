package days14;

/**
 * @author created by Seeker2250 on 7/18/24.
 * @Subject
 * @Contents
 */
public class Ex08 {
  public static void main(String[] args) {
    /*        상속 계층도
     *         [Object]
     *
     *  Point             Shape
     *
     *                Circle  Triangle
     *
     * is-a관계
     * 원은 도형이다
     * 삼각형은 도형이다.
     */
    Point p = new Point(1, 2);
}



//compiler가 자동으로 Object class를 상속한다고 compile해버림
//class Point extends Object{랑 같아
//모든 클래스의 최상위 클래스는 object class
//class Point() {
//  int x, y;
//
//  Point() {
//    this(0, 0);
//  }
//
//  Point(int x, int y) {
//    this.x = x;
//    this.y = y;
//  }

//  Point(Point p) {
//    this.x = p.x;
//    this.y = p.y;
//  }

//  String getXY() {
//    return String.format("(%d $d)", this.x, this.y);
//  }
}

class Shape {
  String color = "black";

  void draw() {//도형 그리는 method
    System.out.printf("[color = %s]\n", this.color);
  }

  void 면적계산() {

  }
}//shape

class Circle extends Shape {
  //    원점, 반지름
  Point centre;//has-a관계
  int radius; //반지름

  Circle() {
    this(0, 0, 0);
  }

  Circle(int x, int y, int r) {
    this.centre = new Point(x, y);
    this.radius = r;
  }

  Circle(Point centre, int r) {
    this.centre = centre;
    this.radius = r;
  }

  @Override
//이거 안 붙이면 Overloading 한 거야
  void 면적계산() {//function prototype, ()는 바디
    double v = radius * radius * Math.PI;
  }//overriding할 땐 parameter, return type 등 바꾸지마
//access modifier가 부모 이상으로 넓어야 해(같은 건 괜찮아)
}

class Triangle extends Shape {
  Point[] p = null;

  public Triangle(Point[] p) {//생성자 DI
    this.p = p;
  }
  @Override
  void 면적계산() {
//    가로 * 세로 * 1/2;
  }
}
package days14;

/**
 * @author created by Seeker2250 on 7/18/24.
 * @Subject class들 간의 관계
 * @Contents is-a(상속), has-a(포함)관계
 * inheritance
 * 기존 class 재사용하여 새로운 class 선언
 * 멤버들
 * 장점 : 코드 재사용 -> 생산성 향상, 유지보수 용이
 * Access modifier / Other modifier / class name extends class{
 * member(field, method)
 * }
 */
public class Ex05 {
  public static void main(String[] args) {

//    Point3D p1 = new Point3D(1, 2, 3);
//    System.out.printf("%d %d %d", p1.x, p1.y, p1.z);
    new Point3D(1, 2, 3);

  }//main
}//class

//class Point3D {
//  int x;
//  int y;
//  int z;
//
//  Point3D() {}

class Point3D extends Point2D {

  int z;

  Point3D() {
    System.out.println("Point3D 객체 생성 - default constructor 호출");
  }

  Point3D(int x, int y, int z) {
//    this.x = x;//super class로부터 inheritance 된 field 초기화
//    this.y = y;//super class로부터 inheritance 된 field 초기화
    super(x, y);//parents class의 constructor 불러오니까 초기화 한 거랑 동일한 효과. 대신 제일 위에 두어야지
    this.z = z;
    System.out.println("Point3D 객체 생성 - parameter 3 constructor 호출");
  }
}

class Point2D {
  int x;
  int y;

  Point2D() {
    System.out.println("Point2D 객체 생성 - deault constructor 호출");
  }

  Point2D(int x, int y) {
    this.x = x;
    this.y = y;
    System.out.println("Point2D 객체 생성 - parameter 2 constructor 호출");
  }
}

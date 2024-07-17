package days13;

/**
 * @author created by Seeker2250 on 7/17/24.
 * @Subject
 * @Contents
 */
public class Ex03 {
  public static void main(String[] args) {
//   [1]  [method return type  reference(class) 경우]

//   [2]  [method parameter  reference(class) 경우]
    Point p1 = new Point();//Point p1은 지역변수이자 참조변수이자 객체
    p1.x = 10;
    p1.y = 20;
//method 영역에 dispPoint가 있고 이 method영역의 주소값을 instance로 가져와
    Point p2 = new Point();
    p2.x = 1;
    p2.y = 2;

//    p1.plusPoint(p2);
//    p1.dispPoint();
    p1.plusPoint(p1,p2).dispPoint();//함수를 호출하면 return 값이 오는 것
//    위 아래는 같아
    Point p3 = p1.plusPoint(p1,p2);
    p3.dispPoint();
//    p3으로 받으면 이건 재사용할 수 있지만
//    p1으로 저렇게 받으면 재사용이 어렵겠지.


  }
}

package days13;

/**
 * @author created by Seeker2250 on 7/17/24.
 * @Subject [Constructor]
 * @Contents 1. 일종의 method
 * 2. method name == class name
 * 3. return type이 없음(void조차 없음)
 * 4. 역할 : 필드 초기화
 * 5. 호출 시기 : 인위적으로 호출할 수 없음.
 * 객체 생성할 때 자동으로 호출.
 * new Tv();<-여기의 ()가 consructor call을 의미, 여기에 argument 넣으면 fields로 들어가겠지.
 * 6. Over loading 가능
 * 7. parameter가 없는 constructor를 앞으로 default constructor라고 할거야.
 * 8. constructor는 inheritance 못해
 * 9. constructor는 access modifier를 사용할 수 있지만, other modifier는 사용할 수 없다.
 * 10. compiler에 의해 constructor가 하나도 없는 경우에, 자동으로 default constructor를 만들어줌.
 */
public class Ex05 {
  //  접근제어 기타제어 리턴자료 함수(매개변수)
  public Ex05() {//constructor

  }

  public Ex05(String msg) {//constructor

  }

  public static void main(String[] args) {
//    int []m={1,2};
//    int []m = new int[2];
//    m[0]=1;
//    m[1]=2;
//    위랑 아래랑 같아
//    Point2 [] points = new Point2[2];
//    points[0] = new Point2(10, 20);
//    points[1] = new Point2(1, 2);

//    위처럼 코딩하지말고 Class Array를 사용한다면?

    Point2[] points = {
        new Point2(10, 20),
        new Point2(1, 2)
    };

//   [1]  [method return type  reference(class) 경우]

//   [2]  [method parameter  reference(class) 경우]
//    Point2 p1 = new Point2(10, 20);//Point p1은 지역변수이자 참조변수이자 객체
////    객체가 생성될 때 parameter 2개짜리 constructor가 생성 돼
//    p1.dispPoint();
////method 영역에 dispPoint가 있고 이 method영역의 주소값을 instance로 가져와
//    Point2 p2 = new Point2();
//    p2.dispPoint();
//    p1.plusPoint(p1, p2).dispPoint();
//    Point2 p3 = p1.plusPoint(p1, p2);
//    p3.dispPoint();




  }
}

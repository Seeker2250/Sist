package days14;


/**
 * @author created by Seeker2250 on 7/18/24.
 * @Subject
 * @Contents
 *
 * [4개 클래스]
 *                                    Object
 *                                      ㅁ
 *  Employee(사원 클래스, 공통적으로 가지는 멤버 구현)         Temp(임시직)
 *
 *  Regular(정규직 사원)
 *
 *  Sales(영업직)
 *
 * [개념 설명]
 * 1. 상속
 * 2. overloading / override
 * 3. this / super keyword
 * 4. abstract method, abstract class
 * 5 interface
 * 6. polymorphism
 * 7. up casting / down casting(클래스 간 type casting)
 * 등등
 */
public class Ex11 {
  public static void main(String[] args) {
//  1.    사원 객체 생성해서 출력
//    Employee emp1 = new Employee("김준석", "ahffk", "1234", "1245");
//    emp1.dispEmpInfo();

//   2.
//   Regular emp2 = new Regular("ㅁㅇㄴㄹ", "Asdf","1235", "1234", 40000);
//    System.out.println(emp2.getPay());
//    Employee 객체 생성 -> Regular 객체 생성
//    기본급 출력 따로 해야해
//   2-2 polymorphism
//    부모 타입           자식 객체
//    정규직(Regular)은            사원(Employee)이다
//    class 간의 형변환(Up casting)
    Employee emp2 = new Regular("ㅁㅇㄴㄹ", "Asdf","1235", "1234", 40000);
////    System.out.println(emp2.getPay());//실제 객체가 Regular이더라도 참조한 게 Employee니까 안되지
    emp2.dispEmpInfo();
//    inheritance 관계가 없는 class 간에 up/down casting이 일어나진 않아

//    Down Casting : 부모 객체를 자식 객체로 형 변환
    Regular emp3 = (Regular) emp2;//cast operator 사용해야
  }
}

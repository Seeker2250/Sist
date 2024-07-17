package days13;

/**
 * @author created by Seeker2250 on 7/17/24.
 * @Subject this keyword
 * @Contents 1. 정의 : Class 자기 자신의 주소값을 갖는 참조변수(instance가 생성되어야 주소값이 생기잖아)
 * 내 instance의 주소값을 갖는 참조변수야!
 * 내가 만든 적 없으니까 볼 수 없지.
 * <p>
 * Tv t1   변수, 참조변수(주소값을 가지지), 객체(instance 아니야)
 * Tv [this];
 * this가 만들어지는 때 : new operator로 객체를 생성하면!, instance가 생성되면
 * <p>
 * [power][channel][color][method 참조 주소값]->instance               [0x100]t1
 * 0x100
 * [power][channel][color][method 참조 주소값][0x100]                 [0x100]t1
 * this 참조변수
 * Tv t2를 만들면
 * [power][channel][color][method 참조 주소값][0x200]                 [0x200]t2
 * 0x200                                    this 참조변수
 * <p>
 * 2. this의 3가지 용도
 * 1) member(class의 구성요소, 객체의 구성요소) == field, method(constructor, getter&setter)
 * member를 가리킬 때 this 사용
 * 2) constructor에서 또다른 constructor를 call 할 때
 * 3) return 값, parameter로 사용될 때
 */

public class Ex07 {
  public static void main(String[] args) {


    Member m1 = new Member("홍길동", "목동");
    System.out.println(m1.getName() + "/" + m1.getAddr());

    Member m2 = new Member();
    System.out.println(m2.getName() + "/" + m2.getAddr());//Member class에서 제일 위에 있어야만 해

    Point p1 = new Point(10, 20);
    p1.plusPoint(100).dispPoint();
//    p1.thisTest(this); // static 안에서 this 못 써
  }//main
}//class

class Member {
  public Member() {
    this("익명", "미정");
  }//다른 코딩보다 제일 윗 라인에 있어야 해

  //    fields
  private String addr;//이거 부르려면 this.addr해야지 this는 class에 있는 애 부르니까
  private String name;//이거 부르려면 this.name해야지 this는 class에 있는 애 부르니까

  public String getAddr() {
    return addr;
  }

  public Member(String name, String addr) {
    this.name = name;
    this.addr = addr;

  }

  public void setAddr(String addr) {
    this.addr = addr;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
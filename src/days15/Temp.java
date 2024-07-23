package days15;

import days14.Employee;

/**
 * @author created by Seeker2250 on 7/19/24.
 * @Subject
 * @Contents 임시직 사원 클래스
 */
public class Temp extends Employee {
  private int days;     //근무일수
  private int payOfDay; //하루 일당

  public Temp() {
    super();
    System.out.println("Temp default constructor 호출");
  }

  public Temp(String name, String addr, String tel, String hiredate, int days, int payOfDay) {
    super(name, addr, tel, hiredate);
    this.days = days;
    this.payOfDay = payOfDay;
    System.out.println("Temp 6 constructor 호출");
  }

  public int getPay() {//이건 새로 추가한 method야(Regular에 있어도 Employee에 없잖아->나중에 만들어줘서 override가 된거야)
    return this.days * this.payOfDay;
  }

  public void dispEmpInfo() {
    System.out.printf("사원명 : %s, 주소 : %s 연락처 : %s 입사일자 : %s 일수 : %d 일당 : %d\n",
        getName(), getAddr(), getTel(), getHiredate(), this.days, this.payOfDay);//부모꺼 가져와
    super.dispEmpInfo();//super는 parents의 instance를 가리켜
//    this처럼 또다른 부모 생성자 호출하거나 이럴 때 쓰일 수 있다~
  }
}

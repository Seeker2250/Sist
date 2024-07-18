package days14;

/**
 * @author created by Seeker2250 on 7/18/24.
 * @Subject
 * @Contents
 */
public class Regular extends Employee {
//  Object 상속
//  Employee 상속 : name, addr, tel, hiredate, method들~

  public Regular(int basePay) {
    this.basePay = basePay;
    System.out.println("regular default 생성자");
  }

  public Regular(String name, String addr, String tel, String hiredate, int basePay) {
    super(name, addr, tel, hiredate);
//    아래처럼 해도 되지만 위처럼 해도 되지 왜냐하면 Employee class에서 초기화 되어있잖아
//    this.setName(name);
//    this.setAddr(addr);
//    this.setTel(tel);
//    this.setHiredate(hiredate);
    this.basePay = basePay;
    System.out.println("regular 매개변수 5 생성자");
  }

  public Regular() {

  }


  public int getBasePay() {
    return basePay;
  }

  public void setBasePay(int basePay) {
    this.basePay = basePay;
  }

  private int basePay;//기본 급여

  public int getPay() {
    return this.basePay;
  }
}

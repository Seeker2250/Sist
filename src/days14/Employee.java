package days14;


//사원 클래스
//모든 사원이 공통적으로 가지고 있을 멤버들을 선언
public abstract class Employee {
  //fields
  private String name;//사원명
  private String addr;//주소


  private String tel;//연락처
  private String hiredate;//입사일자
  //생성자

  public Employee() {
    super();
    System.out.println("Default constructor 호출");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddr() {
    return addr;
  }

  public void setAddr(String addr) {
    this.addr = addr;
  }

  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public String getHiredate() {
    return hiredate;
  }

  public void setHiredate(String hiredate) {
    this.hiredate = hiredate;
  }

  public Employee(String name, String addr, String tel, String hiredate) {
    super();
    this.name = name;
    this.addr = addr;
    this.tel = tel;
    this.hiredate = hiredate;
    System.out.println("Employee4 생성자 호출");
  }

  //  사원 정보 출력 method
  public void dispEmpInfo() {
    System.out.printf("사원명 : %s, 주소 : %s 연락처 : %s 입사일자 : %s\n", this.name, this.addr, this.tel, this.hiredate);
  }

  //getPay()만들면 사원 종류 따라 급여 산정 방식이 다르니까 다시 만들거야 그러니까 안 만들어
//  근데 이러면 Employee에서 호출 안하면 계속 만들어야 하네? 그러니까 그냥 틀만 만들어두자.
  public abstract int getPay();//body가 없는 method, abstract

}


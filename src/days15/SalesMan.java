package days15;

import days14.Regular;

/**
 * @author created by Seeker2250 on 7/19/24.
 * @Subject
 * @Contents 영업직 사원 클래스
 * 더이상 자식 클래스를 가질 수 없는 final class
 */
public final class SalesMan extends Regular {
  private int sales; //판매량
  private int comm; //커미션

  public SalesMan() {
    System.out.println("SalesMan default constructor");
  }//default constructor

  public SalesMan(String name, String addr, String tel, String hiredate, int basePay, int sales, int comm) {//parameter 5개짜리 constructor
    super(name, addr, tel, hiredate, basePay);
    this.sales = sales;
    this.comm = comm;
    System.out.println("SalesMan 5parameter constructor");
  }

  public static void main(String[] args) {

  }

  @Override
  public int getPay() {
    return super.getPay() + this.sales * this.comm;//this로 추가 안하면 그냥 기본 급여야.
  }

  @Override
  public void dispEmpInfo() {
    System.out.printf("사원명 : %s, 주소 : %s 연락처 : %s 입사일자 : %s 판매량 : %d 커미션 : %d\n",
        getName(), getAddr(), getTel(), getHiredate(), this.sales, this.comm);//부모꺼 가져와
    super.dispEmpInfo();
  }


}

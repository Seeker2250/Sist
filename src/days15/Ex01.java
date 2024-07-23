package days15;

import days14.Employee;

/**
 * @author created by Seeker2250 on 7/19/24.
 * @Subject
 * @Contents
 */
public class Ex01 {
  public static void main(String[] args) {
    Employee emp3 = new SalesMan("김준석", "경기도 남양주", "123", "1234", 1244, 123, 123);
    emp3.dispEmpInfo();//이건 전부 다 출력돼
//    왜? -> overriding 하고, overriding된 것이기 때문
    Employee emp4 = new Temp("김재민","서울 목동","123","2020.02.13",123,50000);
    emp4.dispEmpInfo();

  }
}

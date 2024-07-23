package days15;

import days14.Employee;
import days14.Regular;

/**
 * @author created by Seeker2250 on 7/19/24.
 * @Subject Polymorphism
 * @Contents 한 타입의 reference variable로 여러 타입의 object를 참고할 수 있는 것.
 * Employee e1 = new Regular();
 * Employee e2 = new SalesMan();
 * Employee e3 = new Temp():
 * Employee 하나로 여러 object 만듦~!
 */
public abstract class Ex03 extends Employee {
  public static void main(String[] args) {
//    Employee emp2 = new Regular("ㅁㅇㄴㄹ", "Asdf","1235", "1234", 40000);
//    Employee emp3 = new SalesMan("김준석", "경기도 남양주", "123", "1234", 1244, 123, 123);
//    Employee emp4 = new Temp("김재민","서울 목동","123","2020.02.13",12,50000);
//    System.out.println(emp2.getPay());
//    System.out.println(emp3.getPay());
//    System.out.println(emp4.getPay());

//    Employee[] emps = new Employee[3];
//    emps[0] = new Regular("ㅁㅇㄴㄹ", "Asdf", "1235", "1234", 40000);
//    emps[1] = new SalesMan("김준석", "경기도 남양주", "123", "1234", 1244, 123, 123);
//    emps[2] = new Temp("김재민", "서울 목동", "123", "2020.02.13", 12, 50000);

    Employee[] emps = {
        new Regular("ㅁㅇㄴㄹ", "Asdf", "1235", "1234", 40000),
        new SalesMan("김준석", "경기도 남양주", "123", "1234", 1244, 123, 123),
        new Temp("김재민", "서울 목동", "123", "2020.02.13", 12, 50000),
    };
    for (int i = 0; i < emps.length; i++) {
//      System.out.println(emps[i].getPay());
      printEmpPay(emps[i]); //Ex03객체가 만들어져야 쓸 수 있으니 그냥 static 찍자
    }

  }//main

  //                     prameter Polymorphism -> Up casting이 일어나는 것
  public static void printEmpPay(Employee emp) {//모든 걸 받아야 하니까 Employee
    String type = null;
    if (emp instanceof Temp) {
      type = "임시직 사원";
      Temp t = (Temp) emp;
    } else if (emp instanceof SalesMan) {//자식 먼저 체크해야 해
      type = "영업직 사원";
      SalesMan s = (SalesMan) emp;
    } else if (emp instanceof Regular) {
      type = "정규직 사원";
      Regular r = (Regular) emp;
    }
    System.out.println(type);
  }//printEmpPay
}//class

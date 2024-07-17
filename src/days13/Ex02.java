package days13;

/**
 * @author created by Seeker2250 on 7/17/24.
 * @Subject
 * @Contents
 */
public class Ex02 {
  public static void main(String[] args) {
//    member(field, method, constructor)앞의 access modifier
//    public - package 내외부 참조 가능
//    package - 같은 package 내에서 참조 가능
//    private - 같은 class 내에서 참조 가능
//    protected - package + inheritance라면 가능(package 외부라도 상속이 있다면 참조 가능)

//    public - protected - package - private

//    public int age = 20;  local variable은 access modifier를 사용할 수 없다.
//    days13.Time.java
//    패키지 외부 - Time     field 체크
//    days12.EX12.java
//    패키지 내부 - Time     field 체크
    Time t = new Time();
    t.hour = 9;
    t.minute = 1;
    t.second = 3;
//    t.test();
  }

}

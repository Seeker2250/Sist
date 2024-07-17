package days13;

/**
 * @author created by Seeker2250 on 7/17/24.
 * @Subject
 * @Contents 저축클래스
 */
public class Save {
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getMoney() {
    return money;
  }

  public void setMoney(long money) {
    this.money = money;
  }

  public static double getRate() {//Static method
    return rate;
  }

  public static void setRate(double rate) {
    Save.rate = rate;
  }

  //  field
  //local variable(해당 bracket 안에서만)
  // instance variable(객체 생성될 때 나와, 객체 소멸될 때 사라져(GC))
  // class variable(class 시작할 때 나와, program 종료하면 나가)
  private String name; // 예금주
  //  instance field(변수)
  private long money; // 예금 액수

  private static double rate = 0.04; //명시적 explicit initialization 이자율 -> method area에 올라가.
  // 객체를 생성하지 않아도 program 시작하자마자 memory에 올라와->class variable, shared variable, static variable 다 같은 말이 되는거지.

//  constructor

  public Save(String name, long money, double rate) {
    this.name = name;
    this.money = money;
    this.rate = rate;
  }

  public void dispSave() {//instance method
    System.out.printf("예금주 : %s 예금액 : %d 이자율 : %.2f\n", this.name, this.money, this.rate);
  }
}

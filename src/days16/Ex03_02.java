package days16;

/**
 * @author created by Seeker2250 on 7/22/24.
 * @Subject
 * @Contents
 */
public class Ex03_02 {
  public static void main(String[] args) {
  Person p1 = new Person("123456-1234567", "홍길동");
    try {
      Person p2 =(Person) p1.clone();
    } catch (CloneNotSupportedException e) {
      throw new RuntimeException(e);
    }

//    equals();
//    finalize();
//    notify(); notifyAll(); wait();
  }
}

class Person implements Cloneable{//Cloneable interface에서 복제하는 코딩 구현


  @Override
  public int hashCode() {
    return rrn.hashCode();
  }

  //  p1.equals(p2)
  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Person){
      Person p = (Person) obj;//down casting
      return this.rrn.equals(p.rrn);
    }
    return false;
  }
  //  fields
  String rrn;
  String name;


  //  constructor
  public Person(String rrn, String name) {
    this.rrn = rrn;
    this.name = name;
  }

  @Override
  public String toString() {
    return "Person{" +
        "rrn='" + rrn + '\'' +
        ", name='" + name + '\'' +
        '}';
  }

//p1.clone()
//  부모의 clone() method를 override했기 때문에
//  return type이 object여야 하지만
//  return type을 복제하는 class type으로 변경할 수 있도록
//  jdk 1.5에서 "공변변환타입"(Convariant Return Type)이란 새로운 문법
  @Override
  protected Object clone() throws CloneNotSupportedException {
    Person pClone = null;
    pClone = (Person) super.clone();//type 안 맞아서 down casting헤서 return
    return pClone;
  }
}

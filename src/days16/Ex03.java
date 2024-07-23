package days16;

/**
 * @author created by Seeker2250 on 7/22/24.
 * @Subject
 * @Contents
 */
public class Ex03 {//class 선언할 때의 class(예약어)
  public static void main(String[] args) {
//    java.lang package - java의 가장 기본이 되는 class
//    java.util package - 유용한 class
//    1. [java.lang.Object class]

    Item item1 = new Item(10);
    Item item2 = new Item(10);
//    2. instance address
    System.out.println(item1.hashCode());//객체 주소값 hashcode로 (int로)return
    System.out.println(item2.hashCode());
    System.out.println(item1.toString());//return type : String
    System.out.println(item2.toString());//생성된 객체(instance)에 대한 정보를 String으로 return하는 method
//    overriding해서 사용
//              package.class@hashcode의 16진수


    //3. getClass
    //내가 overriding한 toString 값이 찍객체 자신의 class 정보를 담고있는 class instacnce를 return해
    System.out.println(item1.getClass());//public final native Class<?> 타입임
    Class cls = item1.getClass();//객체의 class 정보를 가지고 있는 객체, String같은 type이야
    System.out.println(cls.getName());
//    cls.getConstructor(); -> 어떤 constructor?
//    cls.getMethod() -> 어떤 method?

//    4. clone() 복제, 객체 복사본 만들어서 return


  }//main
}//class

class Item {//extends Object 생략
  int value;//fields
  public Item(int value) { //constructor
    this.value = value;
  }

  @Override
  public String toString() {
    return "Item{" +
        "value=" + value +//내가 overriding한 toString 값이 찍혀
        '}';
  }
}//class
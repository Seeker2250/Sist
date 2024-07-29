package days20;

import days13.Person;

/**
 * @author created by Seeker2250 on 7/26/24.
 * @Subject
 * @Contents Generic type은 class, method에 선언할 수 있다.
 * 1) Generic class
 * 2) Generic method
 */
public class Ex08_02 {
  public static void main(String[] args) {


      /*
      Box b1 = new Box();
      b1.setItem(100);
      System.out.println( b1.getItem());
      */

      /*
      Box b1 = new Box();
      b1.setItem("홍길동");
      System.out.println( b1.getItem());
      */

/*
    Box b1 = new Box();
    b1.setItem(3.14);
    System.out.println((double) b1.getItem());
*/
//          Box 원시 타입(Raw Type)
//    Box<T> Generic Class, 'T'의 박스
//           타입변수 또는 타입 매개변수
//      T, E, K, V
    Box<Person> b1  = new Box<>();
    b1.setItem(new Person());
    Person p = b1.getItem();
    System.out.println(p);

  } // main

} // class
class Box <T> { //Generic Class declare
  T item;

  public T getItem() {
    return item;
  }

  public void setItem(T item) {
    this.item = item;
  }
}

/*
class Box{
   Object item;

   public Object getItem() {
      return item;
   }

   public void setItem(Object item) {
      this.item = item;
   }
} */

/*
class Box{
   double item;

   public double getItem() {
      return item;
   }

   public void setItem(double item) {
      this.item = item;
   }
}
*/

/*
class Box{
   String item;

   public String getItem() {
      return item;
   }

   public void setItem(String item) {
      this.item = item;
   }
}
*/

/*
class Box{
   int item;

   public int getItem() {
      return item;
   }

   public void setItem(int item) {
      this.item = item;
   }
}
*/

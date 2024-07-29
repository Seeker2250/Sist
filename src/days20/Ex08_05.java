package days20;

import java.util.ArrayList;

/**
 * @author created by Seeker2250 on 7/26/24.
 * @Subject
 * @Contents 제한된 제네릭 클래스
 *
 * Box<T>
 * Box<T extends Fruit> 의미 이해
 * Box<T extends Fruit & eatable> 이해
 */
public class Ex08_05 {
  public static void main(String[] args) {
////      Box4<Toy> toybox = new Box4<>();
////      Box4<빵> 빵box = new Box4<>();
//    Box4<Apple> applebox = new Box4<>();
//    Box4<Grape> grapebox = new Box4<>();
  }//main
}//class

//제네릭 클래스
//class Box4 <T extends Fruit & eatable> {//Fruit에서 상속 받았으면서 eatable의 concreete class(Fruit가 eatable이라 ㄱㅊ)
//  ArrayList<T> list = new ArrayList<T>();
//  void add(T item) {  this.list.add(item); }
//  int size() { return this.list.size(); }
//  T get(int i) { return this.list.get(i); }
//  public String toString() { return  this.list.toString();  }
//
//}
//interface eatable {
//
//}
//class 빵 implements eatable{
//
//}
//class Fruit extends Object implements eatable{
//  public String toString() {
//    return "Fruit";
//  }
//}
//class Apple extends Fruit{
//  public String toString() {
//    return "Apple";
//  }
//}
//class Grape extends Fruit{
//  public String toString() {
//    return "Grape";
//  }
//}
//
//class Toy{
//  public String toString() {
//    return "Toy";
//  }
//
//}